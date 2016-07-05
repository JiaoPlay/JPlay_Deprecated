package com.pojo;

/**
 * Created by Admin on 2016/6/27.
 */
public class Letter {
    private int letterId;
    private int senderId;
    private int reveiverId;
    private String letterContent;
    private User userByReveiverId;
    private User userBySenderId;

    public int getLetterId() {
        return letterId;
    }

    public void setLetterId(int letterId) {
        this.letterId = letterId;
    }

    public int getSenderId() {
        return senderId;
    }

    public void setSenderId(int senderId) {
        this.senderId = senderId;
    }

    public int getReveiverId() {
        return reveiverId;
    }

    public void setReveiverId(int reveiverId) {
        this.reveiverId = reveiverId;
    }

    public String getLetterContent() {
        return letterContent;
    }

    public void setLetterContent(String letterContent) {
        this.letterContent = letterContent;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Letter letter = (Letter) o;

        if (letterId != letter.letterId) return false;
        if (senderId != letter.senderId) return false;
        if (reveiverId != letter.reveiverId) return false;
        if (letterContent != null ? !letterContent.equals(letter.letterContent) : letter.letterContent != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = letterId;
        result = 31 * result + senderId;
        result = 31 * result + reveiverId;
        result = 31 * result + (letterContent != null ? letterContent.hashCode() : 0);
        return result;
    }

    public User getUserByReveiverId() {
        return userByReveiverId;
    }

    public void setUserByReveiverId(User userByReveiverId) {
        this.userByReveiverId = userByReveiverId;
    }

    public User getUserBySenderId() {
        return userBySenderId;
    }

    public void setUserBySenderId(User userBySenderId) {
        this.userBySenderId = userBySenderId;
    }
}
