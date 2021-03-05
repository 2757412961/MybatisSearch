package cn.edu.zju.gislab.SCSServices.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.ibatis.type.Alias;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor

@Alias("Blog")
public class Blog {
    private String id;
    private String title;
    private String author;
    private Date createTime;
    private int views;
}
