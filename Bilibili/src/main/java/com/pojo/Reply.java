package com.pojo;

import java.util.Collection;

/**
 * Created by Admin on 2016/6/27.
 */
public class Reply {
    private int replyId;
    private String content;
    private int thumbCount;
    private Collection<CommentReply> commentRepliesByReplyId;
    private Collection<ReplyReport> replyReportsByReplyId;
    private Collection<UserReply> userRepliesByReplyId;

    public int getReplyId() {
        return replyId;
    }

    public void setReplyId(int replyId) {
        this.replyId = replyId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
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

        Reply reply = (Reply) o;

        if (replyId != reply.replyId) return false;
        if (thumbCount != reply.thumbCount) return false;
        if (content != null ? !content.equals(reply.content) : reply.content != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = replyId;
        result = 31 * result + (content != null ? content.hashCode() : 0);
        result = 31 * result + thumbCount;
        return result;
    }

    public Collection<CommentReply> getCommentRepliesByReplyId() {
        return commentRepliesByReplyId;
    }

    public void setCommentRepliesByReplyId(Collection<CommentReply> commentRepliesByReplyId) {
        this.commentRepliesByReplyId = commentRepliesByReplyId;
    }

    public Collection<ReplyReport> getReplyReportsByReplyId() {
        return replyReportsByReplyId;
    }

    public void setReplyReportsByReplyId(Collection<ReplyReport> replyReportsByReplyId) {
        this.replyReportsByReplyId = replyReportsByReplyId;
    }

    public Collection<UserReply> getUserRepliesByReplyId() {
        return userRepliesByReplyId;
    }

    public void setUserRepliesByReplyId(Collection<UserReply> userRepliesByReplyId) {
        this.userRepliesByReplyId = userRepliesByReplyId;
    }
}
