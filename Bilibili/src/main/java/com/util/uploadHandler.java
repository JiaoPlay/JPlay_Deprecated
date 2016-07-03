package com.util;

import com.opensymphony.xwork2.ActionSupport;

import java.io.*;

/**
 * Created by Admin on 2016/6/28.
 */
public class uploadHandler extends ActionSupport {
    private static final String storagePath = "/Users/apple/Downloads/";
    private File upload;
    private String uploadFileName;
    private String uploadContentType;

    public File getUpload() {
        return upload;
    }

    public void setUpload(File upload) {
        this.upload = upload;
    }

    public String getUploadFileName() {
        return uploadFileName;
    }

    public void setUploadFileName(String uploadFileName) {
        this.uploadFileName = uploadFileName;
    }

    public String getUploadContentType() {
        return uploadContentType;
    }

    public void setUploadContentType(String uploadContentType) {
        this.uploadContentType = uploadContentType;
    }

    public String execute() throws Exception {
        System.out.println("execute " + uploadFileName);
        FileInputStream fileInputStream = new FileInputStream(upload);
        File file = new File(storagePath + uploadFileName);  // + "." + fileType It is possible to have same filename
        if (!file.exists()) {
            file.createNewFile();
        }
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        byte[] buf = new byte[4096];
        int i;
        while ((i = fileInputStream.read(buf)) != -1) {
            fileOutputStream.write(buf, 0, i);
        }
        System.out.println("End.");
        return SUCCESS;
    }
}
