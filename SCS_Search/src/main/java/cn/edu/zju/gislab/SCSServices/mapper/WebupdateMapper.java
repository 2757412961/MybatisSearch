package cn.edu.zju.gislab.SCSServices.mapper;

import cn.edu.zju.gislab.SCSServices.po.Webupdate;
import cn.edu.zju.gislab.SCSServices.po.WebupdateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WebupdateMapper {
    int countByExample(WebupdateExample example);

    int deleteByExample(WebupdateExample example);

    int insert(Webupdate record);

    int insertSelective(Webupdate record);

    List<Webupdate> selectByExample(WebupdateExample example);

    int updateByExampleSelective(@Param("record") Webupdate record, @Param("example") WebupdateExample example);

    int updateByExample(@Param("record") Webupdate record, @Param("example") WebupdateExample example);
}