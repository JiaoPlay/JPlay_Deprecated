package com.action;

import com.dao.DAOFactory;
import com.dao.videoDAO;
import com.pojo.Video;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.struts2.ServletActionContext;


import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.util.List;

import static org.apache.struts2.ServletActionContext.getServletContext;

/**
 * Created by Admin on 2016/6/27.
 */
public class videoAction extends baseAction {

    private String title;
    private String content;
    private String message;

    @Override
    public String execute() throws Exception {
        HttpServletRequest request = ServletActionContext.getRequest();

        videoDAO videoDao = DAOFactory.getVideoDao();


        String uri = request.getRequestURI();
        String path = uri.substring(uri.lastIndexOf("/"), uri.lastIndexOf("."));


        //提供解析时的一些缺省配置
        DiskFileItemFactory factory = new DiskFileItemFactory();

        //创建一个解析器,分析InputStream,该解析器会将分析的结果封装成一个FileItem对象的集合
        //一个FileItem对象对应一个表单域
        ServletFileUpload sfu = new ServletFileUpload(factory);

        try {
            Video video = new Video();
            video.setTitle(title);
            video.setContent(content);
            List<FileItem> items = sfu.parseRequest(request);
            boolean flag = false;    //转码成功与否的标记
            //要区分是上传文件还是普通的表单域
            for (int i = 0; i < items.size(); i++) {
                FileItem item = items.get(i);
                if (!item.isFormField()) {
                    //上传文件
                    //System.out.println("上传文件" + item.getName());
                    ServletContext sctx = getServletContext();
                    //获得保存文件的路径
                    String basePath = sctx.getRealPath("videos");
                    //获得文件名
                    String fileUrl = item.getName();
                    //在某些操作系统上,item.getName()方法会返回文件的完整名称,即包括路径
                    String fileType = fileUrl.substring(fileUrl.lastIndexOf(".")); //截取文件格式
                    //自定义方式产生文件名
                    String serialName = String.valueOf(System.currentTimeMillis());
                    //待转码的文件
                    File uploadFile = new File(basePath + "/temp/" + serialName + fileType);
                    item.write(uploadFile);

                    if (item.getSize() > 500 * 1024 * 1024) {
                        message = "上传失败！您上传的文件太大,系统允许最大文件500M";
                    }

                    String codcFilePath = basePath + "/" + serialName + ".flv";                //设置转换为flv格式后文件的保存路径
                    String mediaPicPath = basePath + "/images" + File.separator + serialName + ".jpg";    //设置上传视频截图的保存路径

                    // 获取配置的转换工具（ffmpeg.exe）的存放路径
                    String ffmpegPath = getServletContext().getRealPath("/tools/ffmpeg.exe");

                    video.setLink("videos/" + serialName + ".flv");
                    //video.setPicture("videos/images/" + serialName + ".jpg");
                    //video.setCreateTime(DateTimeUtil.getYMDHMSFormat());

                    //转码
                    flag = videoDao.executeCodecs(ffmpegPath, uploadFile.getAbsolutePath(), codcFilePath, mediaPicPath);
                }
            }
            if (flag) {
                //转码成功,向数据表中添加该视频信息
                videoDao.createVideo(video);
                message = "上传成功!";
            }
            return SUCCESS;

        } catch (Exception e) {
            e.printStackTrace();
            throw new ServletException(e);
        }

    }




    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
