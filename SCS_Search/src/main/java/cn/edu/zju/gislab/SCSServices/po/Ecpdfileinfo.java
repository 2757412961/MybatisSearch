package cn.edu.zju.gislab.SCSServices.po;

import java.math.BigDecimal;
import java.util.Date;

public class Ecpdfileinfo {
    private BigDecimal fileid;

    private Date filedate;

    private BigDecimal time;

    private Date createtime;

    private Date updatetime;

    public BigDecimal getFileid() {
        return fileid;
    }

    public void setFileid(BigDecimal fileid) {
        this.fileid = fileid;
    }

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

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }
}