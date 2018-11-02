package cn.hselfweb.ibox.ibox.model;

import java.io.Serializable;

public class Icebox implements Serializable {
    private Integer iceId;

    private Integer fid;

    private String iceName;

    private String macAddr;

    private static final long serialVersionUID = 1L;

    public Integer getIceId() {
        return iceId;
    }

    public void setIceId(Integer iceId) {
        this.iceId = iceId;
    }

    public Integer getFid() {
        return fid;
    }

    public void setFid(Integer fid) {
        this.fid = fid;
    }

    public String getIceName() {
        return iceName;
    }

    public void setIceName(String iceName) {
        this.iceName = iceName;
    }

    public String getMacAddr() {
        return macAddr;
    }

    public void setMacAddr(String macAddr) {
        this.macAddr = macAddr;
    }
}