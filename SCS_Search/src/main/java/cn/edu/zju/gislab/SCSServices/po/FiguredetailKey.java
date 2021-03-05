package cn.edu.zju.gislab.SCSServices.po;

import java.math.BigDecimal;
import java.util.Date;

public class FiguredetailKey {
    private Date filedate;

    private BigDecimal time;

    private String type;

    public Date getFiledate() {
        return filedate;
    }

    public void setFiledate(Date filedate) {
        this.filedate = filedate;
    }

    public BigDecimal getTime() {
        return time;
    }

    public void setTime(BigDecimal time) {
        this.time = time;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }
}