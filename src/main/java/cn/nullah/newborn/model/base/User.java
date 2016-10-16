package cn.nullah.newborn.model.base;

public class User {
    private Long userId;

    private String userName;

    private String userPwd;

    private Short userStatus;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd == null ? null : userPwd.trim();
    }

    public Short getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(Short userStatus) {
        this.userStatus = userStatus;
    }
}