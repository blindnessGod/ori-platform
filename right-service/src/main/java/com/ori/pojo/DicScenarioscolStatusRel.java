package com.ori.pojo;

public class DicScenarioscolStatusRel {

	private Integer ssId;

    private Integer bizId;

    private Integer statusId;

    private String interfaceRollback;

    public Integer getSsId() {
        return ssId;
    }

    public void setSsId(Integer ssId) {
        this.ssId = ssId;
    }

    public Integer getBizId() {
        return bizId;
    }

    public void setBizId(Integer bizId) {
        this.bizId = bizId;
    }

    public Integer getStatusId() {
        return statusId;
    }

    public void setStatusId(Integer statusId) {
        this.statusId = statusId;
    }

    public String getInterfaceRollback() {
        return interfaceRollback;
    }

    public void setInterfaceRollback(String interfaceRollback) {
        this.interfaceRollback = interfaceRollback;
    }
}