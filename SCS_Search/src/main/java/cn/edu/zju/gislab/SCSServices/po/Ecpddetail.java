package cn.edu.zju.gislab.SCSServices.po;

public class Ecpddetail extends EcpddetailKey {
    private String filetype;

    private String totalpath;

    private String name;

    public String getFiletype() {
        return filetype;
    }

    public void setFiletype(String filetype) {
        this.filetype = filetype == null ? null : filetype.trim();
    }

    public String getTotalpath() {
        return totalpath;
    }

    public void setTotalpath(String totalpath) {
        this.totalpath = totalpath == null ? null : totalpath.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }
}