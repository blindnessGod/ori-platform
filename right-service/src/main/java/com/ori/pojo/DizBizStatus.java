package com.ori.pojo;

public class DizBizStatus {
    private Integer statusId;

    private String statusNm;

    private Integer isRollback;

    private String bizStatuscol;

    private Integer statusType;

    private Integer howlongCallback;

    public Integer getStatusId() {
        return statusId;
    }

    public void setStatusId(Integer statusId) {
        this.statusId = statusId;
    }

    public String getStatusNm() {
        return statusNm;
    }

    public void setStatusNm(String statusNm) {
        this.statusNm = statusNm;
    }

    public Integer getIsRollback() {
        return isRollback;
    }

    public void setIsRollback(Integer isRollback) {
        this.isRollback = isRollback;
    }

    public String getBizStatuscol() {
        return bizStatuscol;
    }

    public void setBizStatuscol(String bizStatuscol) {
        this.bizStatuscol = bizStatuscol;
    }

    public Integer getStatusType() {
        return statusType;
    }

    public void setStatusType(Integer statusType) {
        this.statusType = statusType;
    }

    public Integer getHowlongCallback() {
        return howlongCallback;
    }

    public void setHowlongCallback(Integer howlongCallback) {
        this.howlongCallback = howlongCallback;
    }
}