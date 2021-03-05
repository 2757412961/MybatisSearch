package cn.edu.zju.gislab.SCSServices.po;

import java.math.BigDecimal;

public class EcpddetailKey {
    private BigDecimal fileid;

    private String type;

    private String subtype;

    public BigDecimal getFileid() {
        return fileid;
    }

    public void setFileid(BigDecimal fileid) {
        this.fileid = fileid;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getSubtype() {
        return subtype;
    }

    public void setSubtype(String subtype) {
        this.subtype = subtype == null ? null : subtype.trim();
    }
}