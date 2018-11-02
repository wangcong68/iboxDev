package cn.hselfweb.ibox.ibox.model;

import java.io.Serializable;

public class OfficialCard implements Serializable {
    private Integer uuid;

    private Integer foodid;

    private static final long serialVersionUID = 1L;

    public Integer getUuid() {
        return uuid;
    }

    public void setUuid(Integer uuid) {
        this.uuid = uuid;
    }

    public Integer getFoodid() {
        return foodid;
    }

    public void setFoodid(Integer foodid) {
        this.foodid = foodid;
    }
}