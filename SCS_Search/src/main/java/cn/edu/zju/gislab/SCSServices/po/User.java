package cn.edu.zju.gislab.SCSServices.po;

import lombok.*;
import org.apache.ibatis.type.Alias;

@Data
@NoArgsConstructor
@AllArgsConstructor

@Alias("User")
public class User {
    private int id;
    private String name;
//    private String pwd;
    private String password;
}
