package com.ori.pojo;

import java.util.Date;

public class TOriRightSystem {
    private Integer rightSystemId;

    private String systemCode;

    private String systemName;

    private Integer isEnable;

    private Date createTime;

    private Date updateTime;

    public Integer getRightSystemId() {
        return rightSystemId;
    }

    public void setRightSystemId(Integer rightSystemId) {
        this.rightSystemId = rightSystemId;
    }

    public String getSystemCode() {
        return systemCode;
    }

    public void setSystemCode(String systemCode) {
        this.systemCode = systemCode;
    }

    public String getSystemName() {
        return systemName;
    }

    public void setSystemName(String systemName) {
        this.systemName = systemName;
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