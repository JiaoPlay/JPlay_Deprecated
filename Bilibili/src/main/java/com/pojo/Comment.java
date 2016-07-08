package com.pojo;

import java.io.Serializable;
import java.util.Collection;

/**
 * Created by Admin on 2016/6/27.
 */

/**
 * Comment类 表达用户对视频评论的实体类（基于JavaBean概念）
 * <p>
 *     Comment私有成员<br>
 *     commentId     视频评论的ID，用于查找功能<br>
 *     content       视频点评的内容，描述视频点评的所有内容，包括文字、表情、标点符号等<br>
 *     createTime    视频点评的发布时间<br>
 *     thumbCount    视频点评的点赞数，描述用户对于该视频点评进行点赞行为的总数<br>
 * </p>
 */
public class Comment {
    private int commentId;
    private String content;
    private String createTime;
    private int thumbCount;
    private Collection<CommentReply> commentRepliesByCommentId;
    private Collection<CommentReport> commentReportsByCommentId;
    private Collection<UserComment> userCommentsByCommentId;
    private Collection<VideoComment> videoCommentsByCommentId;

    public int getCommentId() {
        return commentId;
    }

    public void setCommentId(int commentId) {
        this.commentId = commentId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public int getThumbCount() {
        return thumbCount;
    }

    public void setThumbCount(int thumbCount) {
        this.thumbCount = thumbCount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Comment comment = (Comment) o;

        if (commentId != comment.commentId) return false;
        if (thumbCount != comment.thumbCount) return false;
        if (content != null ? !content.equals(comment.content) : comment.content != null) return false;
        if (createTime != null ? !createTime.equals(comment.createTime) : comment.createTime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = commentId;
        result = 31 * result + (content != null ? content.hashCode() : 0);
        result = 31 * result + (createTime != null ? createTime.hashCode() : 0);
        result = 31 * result + thumbCount;
        return result;
    }

    public Collection<CommentReply> getCommentRepliesByCommentId() {
        return commentRepliesByCommentId;
    }

    public void setCommentRepliesByCommentId(Collection<CommentReply> commentRepliesByCommentId) {
        this.commentRepliesByCommentId = commentRepliesByCommentId;
    }

    public Collection<CommentReport> getCommentReportsByCommentId() {
        return commentReportsByCommentId;
    }

    public void setCommentReportsByCommentId(Collection<CommentReport> commentReportsByCommentId) {
        this.commentReportsByCommentId = commentReportsByCommentId;
    }

    public Collection<UserComment> getUserCommentsByCommentId() {
        return userCommentsByCommentId;
    }

    public void setUserCommentsByCommentId(Collection<UserComment> userCommentsByCommentId) {
        this.userCommentsByCommentId = userCommentsByCommentId;
    }

    public Collection<VideoComment> getVideoCommentsByCommentId() {
        return videoCommentsByCommentId;
    }

    public void setVideoCommentsByCommentId(Collection<VideoComment> videoCommentsByCommentId) {
        this.videoCommentsByCommentId = videoCommentsByCommentId;
    }
}
