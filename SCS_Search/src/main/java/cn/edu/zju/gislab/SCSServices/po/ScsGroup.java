package cn.edu.zju.gislab.SCSServices.po;

import java.math.BigDecimal;

public class ScsGroup {
    private BigDecimal id;

    private Object name;

    private Object hide;

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public Object getName() {
        return name;
    }

    public void setName(Object name) {
        this.name = name;
    }

    public Object getHide() {
        return hide;
    }

    public void setHide(Object hide) {
        this.hide = hide;
    }
}