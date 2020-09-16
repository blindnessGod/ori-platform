package com.ori.pojo;

import java.util.Date;

public class TOriCardSeries {
    private Integer seriesId;

    private String seriesName;

    private String cardRights;

    private Integer isEnable;

    private Date createTime;

    private Date updateTime;

    public Integer getSeriesId() {
        return seriesId;
    }

    public void setSeriesId(Integer seriesId) {
        this.seriesId = seriesId;
    }

    public String getSeriesName() {
        return seriesName;
    }

    public void setSeriesName(String seriesName) {
        this.seriesName = seriesName;
    }

    public String getCardRights() {
        return cardRights;
    }

    public void setCardRights(String cardRights) {
        this.cardRights = cardRights;
    }

    public Integer getIsEnable() {
        return isEnable;
    }

    public void setIsEnable(Integer isEnable) {
        this.isEnable = isEnable;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}