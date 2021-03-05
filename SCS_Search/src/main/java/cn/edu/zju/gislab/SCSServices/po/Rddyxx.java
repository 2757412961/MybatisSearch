package cn.edu.zju.gislab.SCSServices.po;

public class Rddyxx {
    private Long typhNum;

    private String filename;

    private Short releaseNum;

    private String dateTime;

    public Long getTyphNum() {
        return typhNum;
    }

    public void setTyphNum(Long typhNum) {
        this.typhNum = typhNum;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename == null ? null : filename.trim();
    }

    public Short getReleaseNum() {
        return releaseNum;
    }

    public void setReleaseNum(Short releaseNum) {
        this.releaseNum = releaseNum;
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime == null ? null : dateTime.trim();
    }
}