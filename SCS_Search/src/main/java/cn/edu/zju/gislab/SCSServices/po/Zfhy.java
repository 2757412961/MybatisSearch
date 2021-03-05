package cn.edu.zju.gislab.SCSServices.po;

import java.util.Date;

public class Zfhy extends ZfhyKey {
    private Date qbsj;

    private String tqqk;

    private String fx;

    private String fs;

    private String scfw;

    private String fl;

    private String yl;

    public Date getQbsj() {
        return qbsj;
    }

    public void setQbsj(Date qbsj) {
        this.qbsj = qbsj;
    }

    public String getTqqk() {
        return tqqk;
    }

    public void setTqqk(String tqqk) {
        this.tqqk = tqqk == null ? null : tqqk.trim();
    }

    public String getFx() {
        return fx;
    }

    public void setFx(String fx) {
        this.fx = fx == null ? null : fx.trim();
    }

    public String getFs() {
        return fs;
    }

    public void setFs(String fs) {
        this.fs = fs == null ? null : fs.trim();
    }

    public String getScfw() {
        return scfw;
    }

    public void setScfw(String scfw) {
        this.scfw = scfw == null ? null : scfw.trim();
    }

    public String getFl() {
        return fl;
    }

    public void setFl(String fl) {
        this.fl = fl == null ? null : fl.trim();
    }

    public String getYl() {
        return yl;
    }

    public void setYl(String yl) {
        this.yl = yl == null ? null : yl.trim();
    }
}