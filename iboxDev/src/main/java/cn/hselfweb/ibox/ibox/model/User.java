package cn.hselfweb.ibox.ibox.model;

import java.io.Serializable;

public class User implements Serializable {
    private Integer uid;

    private String password;

    private String userName;

    private String tel;

    private String info;

    private String hmapurl;

    private Integer fid;

    private static final long serialVersionUID = 1L;

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getHmapurl() {
        return hmapurl;
    }

    public void setHmapurl(String hmapurl) {
        this.hmapurl = hmapurl;
    }

    public Integer getFid() {
        return fid;
    }

    public void setFid(Integer fid) {
        this.fid = fid;
    }
}