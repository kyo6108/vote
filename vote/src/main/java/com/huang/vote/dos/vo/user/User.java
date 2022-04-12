package com.huang.vote.dos.vo.user;

public class User {
    private Integer userAcount;
    private String userPassword;
    private String createDate;
    private Boolean alive;
    private String lastUpdateDate;

    public Integer getUserAcount() {
        return userAcount;
    }

    public void setUserAcount(Integer userAcount) {
        this.userAcount = userAcount;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public Boolean getAlive() {
        return alive;
    }

    public void setAlive(Boolean alive) {
        this.alive = alive;
    }

    public String getLastUpdateDate() {
        return lastUpdateDate;
    }

    public void setLastUpdateDate(String lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }
}
