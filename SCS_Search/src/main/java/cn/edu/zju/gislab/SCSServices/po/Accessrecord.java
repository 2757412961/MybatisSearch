package cn.edu.zju.gislab.SCSServices.po;

import java.util.Date;

public class Accessrecord {
    private Date firsttime;

    private Date lasttime;

    private Long accessnum;

    public Date getFirsttime() {
        return firsttime;
    }

    public void setFirsttime(Date firsttime) {
        this.firsttime = firsttime;
    }

    public Date getLasttime() {
        return lasttime;
    }

    public void setLasttime(Date lasttime) {
        this.lasttime = lasttime;
    }

    public Long getAccessnum() {
        return accessnum;
    }

    public void setAccessnum(Long accessnum) {
        this.accessnum = accessnum;
    }
}