package com.tangzh.domain;

import java.util.Date;

public class Bill {
    @Override
	public String toString() {
		return "Bill [bid=" + bid + ", detail=" + detail + ", time=" + time
				+ ", addr=" + addr + ", status=" + status + ", appTime="
				+ appTime + ", sid=" + sid + "]";
	}

	private Integer bid;

    private String detail;

    private Date time;

    private String addr;

    private String status;

    private Date appTime;

    private Integer sid;

    public Integer getBid() {
        return bid;
    }

    public void setBid(Integer bid) {
        this.bid = bid;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail == null ? null : detail.trim();
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr == null ? null : addr.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public Date getAppTime() {
        return appTime;
    }

    public void setAppTime(Date appTime) {
        this.appTime = appTime;
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }
}