package cn.hselfweb.ibox.ibox.model;

import java.io.Serializable;
import java.util.Date;

public class Record implements Serializable {
    private Integer uuid;

    private Integer iceId;

    private Integer fid;

    private Integer opflag;

    private Date opdate;

    private Integer tareweight;

    private Integer foodweight;

    private static final long serialVersionUID = 1L;

    public Integer getUuid() {
        return uuid;
    }

    public void setUuid(Integer uuid) {
        this.uuid = uuid;
    }

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

    public Integer getOpflag() {
        return opflag;
    }

    public void setOpflag(Integer opflag) {
        this.opflag = opflag;
    }

    public Date getOpdate() {
        return opdate;
    }

    public void setOpdate(Date opdate) {
        this.opdate = opdate;
    }

    public Integer getTareweight() {
        return tareweight;
    }

    public void setTareweight(Integer tareweight) {
        this.tareweight = tareweight;
    }

    public Integer getFoodweight() {
        return foodweight;
    }

    public void setFoodweight(Integer foodweight) {
        this.foodweight = foodweight;
    }
}