package cn.edu.zju.gislab.SCSServices.po;

public class TyphInfo {
    private Long typhNum;

    private String chName;

    private String enName;

    private String isongoing;

    private String modelNum;

    public Long getTyphNum() {
        return typhNum;
    }

    public void setTyphNum(Long typhNum) {
        this.typhNum = typhNum;
    }

    public String getChName() {
        return chName;
    }

    public void setChName(String chName) {
        this.chName = chName == null ? null : chName.trim();
    }

    public String getEnName() {
        return enName;
    }

    public void setEnName(String enName) {
        this.enName = enName == null ? null : enName.trim();
    }

    public String getIsongoing() {
        return isongoing;
    }

    public void setIsongoing(String isongoing) {
        this.isongoing = isongoing == null ? null : isongoing.trim();
    }

    public String getModelNum() {
        return modelNum;
    }

    public void setModelNum(String modelNum) {
        this.modelNum = modelNum == null ? null : modelNum.trim();
    }
}