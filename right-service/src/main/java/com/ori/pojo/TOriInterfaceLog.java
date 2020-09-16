package com.ori.pojo;

import java.util.Date;

public class TOriInterfaceLog {
    private Integer logId;

    private Integer rightSystemId;

    private Integer msgDirection;

    private Integer businessType;

    private String msgStatus;

    private String msgStatusDesc;

    private Date createTime;

    private Date updateTime;

    private String msgContent;

    public Integer getLogId() {
        return logId;
    }

    public void setLogId(Integer logId) {
        this.logId = logId;
    }

    public Integer getRightSystemId() {
        return rightSystemId;
    }

    public void setRightSystemId(Integer rightSystemId) {
        this.rightSystemId = rightSystemId;
    }

    public Integer getMsgDirection() {
        return msgDirection;
    }

    public void setMsgDirection(Integer msgDirection) {
        this.msgDirection = msgDirection;
    }

    public Integer getBusinessType() {
        return businessType;
    }

    public void setBusinessType(Integer businessType) {
        this.businessType = businessType;
    }

    public String getMsgStatus() {
        return msgStatus;
    }

    public void setMsgStatus(String msgStatus) {
        this.msgStatus = msgStatus;
    }

    public String getMsgStatusDesc() {
        return msgStatusDesc;
    }

    public void setMsgStatusDesc(String msgStatusDesc) {
        this.msgStatusDesc = msgStatusDesc;
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

    public String getMsgContent() {
        return msgContent;
    }

    public void setMsgContent(String msgContent) {
        this.msgContent = msgContent;
    }
}