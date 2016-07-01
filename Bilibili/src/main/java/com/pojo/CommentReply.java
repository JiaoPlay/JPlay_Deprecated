package com.pojo;

/**
 * Created by Admin on 2016/6/27.
 */

/**
 * CommentReply类 表达视频评论和视频评论回复的关系类（基于JavaBean概念）
 * <p>
 *     CommentReply私有成员<br>
 *     commentId             视频评论的ID<br>
 *     replyId               视频评论回复的ID<br>
 *     commentByCommentId    该视频评论ID下的视频评论<br>
 *     replyByReplyId        该视频评论回复ID下的视频评论回复<br>
 * </p>
 */
public class CommentReply {
    private int commentId;
    private int replyId;
    private Comment commentByCommentId;
    private Reply replyByReplyId;

    public int getCommentId() {
        return commentId;
    }

    public void setCommentId(int commentId) {
        this.commentId = commentId;
    }

    public int getReplyId() {
        return replyId;
    }

    public void setReplyId(int replyId) {
        this.replyId = replyId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CommentReply that = (CommentReply) o;

        if (commentId != that.commentId) return false;
        if (replyId != that.replyId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = commentId;
        result = 31 * result + replyId;
        return result;
    }

    public Comment getCommentByCommentId() {
        return commentByCommentId;
    }

    public void setCommentByCommentId(Comment commentByCommentId) {
        this.commentByCommentId = commentByCommentId;
    }

    public Reply getReplyByReplyId() {
        return replyByReplyId;
    }

    public void setReplyByReplyId(Reply replyByReplyId) {
        this.replyByReplyId = replyByReplyId;
    }
}
