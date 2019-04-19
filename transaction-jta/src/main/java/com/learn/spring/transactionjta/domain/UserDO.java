package com.learn.spring.transactionjta.domain;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class UserDO implements Serializable {
    private Integer id;

    private String name;

    private String phone;

    private String password;

    private String avatar="";

    /**
     * 点击了什么产品链接，name
     */
    private String downloads="";

    private String invite="";

    private String ip="";

    private Date createTime;

    private String createTimeStr;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar == null ? null : avatar.trim();
    }

    public String getDownloads() {
        return downloads;
    }

    public void setDownloads(String downloads) {
        this.downloads = downloads == null ? null : downloads.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", phone=").append(phone);
        sb.append(", password=").append(password);
        sb.append(", avatar=").append(avatar);
        sb.append(", downloads=").append(downloads);
        sb.append(", createTime=").append(createTime);
        sb.append("]");
        return sb.toString();
    }
}