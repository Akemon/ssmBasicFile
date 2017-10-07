package com.hk.bean;

public class User_Role {
    private Integer id;

    private Integer userId;

    private Integer roleId;

    public User_Role() {
    }

    public User_Role(Integer id, Integer userId, Integer roleId) {
        this.id = id;
        this.userId = userId;
        this.roleId = roleId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }
}