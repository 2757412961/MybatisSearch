package cn.edu.zju.gislab.SCSServices.po;

import java.util.Date;

public class BuoyLastKey {
    private String name;

    private Date dateTime;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Date getDateTime() {
        return dateTime;
    }

    public void setDateTime(Date dateTime) {
        this.dateTime = dateTime;
    }
}