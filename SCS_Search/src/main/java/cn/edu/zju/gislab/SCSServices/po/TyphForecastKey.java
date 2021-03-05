package cn.edu.zju.gislab.SCSServices.po;

import java.util.Date;

public class TyphForecastKey {
    private Long typhNum;

    private String tm;

    private Date qbsj;

    private Date ybsj;

    public Long getTyphNum() {
        return typhNum;
    }

    public void setTyphNum(Long typhNum) {
        this.typhNum = typhNum;
    }

    public String getTm() {
        return tm;
    }

    public void setTm(String tm) {
        this.tm = tm == null ? null : tm.trim();
    }

    public Date getQbsj() {
        return qbsj;
    }

    public void setQbsj(Date qbsj) {
        this.qbsj = qbsj;
    }

    public Date getYbsj() {
        return ybsj;
    }

    public void setYbsj(Date ybsj) {
        this.ybsj = ybsj;
    }
}