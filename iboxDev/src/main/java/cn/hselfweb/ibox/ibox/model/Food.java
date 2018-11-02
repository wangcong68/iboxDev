package cn.hselfweb.ibox.ibox.model;

import java.io.Serializable;
import java.util.Date;

public class Food implements Serializable {
    private Integer foodId;

    private String foodName;

    private Date startTime;

    private String foodUrl;

    private Integer type;

    private static final long serialVersionUID = 1L;

    public Integer getFoodId() {
        return foodId;
    }

    public void setFoodId(Integer foodId) {
        this.foodId = foodId;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public String getFoodUrl() {
        return foodUrl;
    }

    public void setFoodUrl(String foodUrl) {
        this.foodUrl = foodUrl;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }
}