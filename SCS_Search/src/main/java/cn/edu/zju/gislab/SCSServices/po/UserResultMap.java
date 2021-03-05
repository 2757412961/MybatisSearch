package cn.edu.zju.gislab.SCSServices.po;

import lombok.*;
import org.apache.ibatis.type.Alias;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Alias("UserResultMap")
public class UserResultMap {
    private int id;
    private String name;
    private String password;
}
