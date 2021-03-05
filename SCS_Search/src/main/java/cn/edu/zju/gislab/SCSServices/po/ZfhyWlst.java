package cn.edu.zju.gislab.SCSServices.po;

import java.util.Date;

public class ZfhyWlst {
    private Date qbsj;

    private Date ybrq;

    private String ybsc;

    private String hymc;

    private String fx;

    private String fl;

    private String zf;

    private String lg;

    public Date getQbsj() {
        return qbsj;
    }

    public void setQbsj(Date qbsj) {
        this.qbsj = qbsj;
    }

    public Date getYbrq() {
        return ybrq;
    }

    public void setYbrq(Date ybrq) {
        this.ybrq = ybrq;
    }

    public String getYbsc() {
        return ybsc;
    }

    public void setYbsc(String ybsc) {
        this.ybsc = ybsc == null ? null : ybsc.trim();
    }

    public String getHymc() {
        return hymc;
    }

    public void setHymc(String hymc) {
        this.hymc = hymc == null ? null : hymc.trim();
    }

    public String getFx() {
        return fx;
    }

    public void setFx(String fx) {
        this.fx = fx == null ? null : fx.trim();
    }

    public String getFl() {
        return fl;
    }

    public void setFl(String fl) {
        this.fl = fl == null ? null : fl.trim();
    }

    public String getZf() {
        return zf;
    }

    public void setZf(String zf) {
        this.zf = zf == null ? null : zf.trim();
    }

    public String getLg() {
        return lg;
    }

    public void setLg(String lg) {
        this.lg = lg == null ? null : lg.trim();
    }
}