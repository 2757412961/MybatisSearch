package cn.edu.zju.gislab.SCSServices.mapper;

import cn.edu.zju.gislab.SCSServices.po.Webmtsatupdate;
import cn.edu.zju.gislab.SCSServices.po.WebmtsatupdateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WebmtsatupdateMapper {
    int countByExample(WebmtsatupdateExample example);

    int deleteByExample(WebmtsatupdateExample example);

    int insert(Webmtsatupdate record);

    int insertSelective(Webmtsatupdate record);

    List<Webmtsatupdate> selectByExample(WebmtsatupdateExample example);

    int updateByExampleSelective(@Param("record") Webmtsatupdate record, @Param("example") WebmtsatupdateExample example);

    int updateByExample(@Param("record") Webmtsatupdate record, @Param("example") WebmtsatupdateExample example);
}