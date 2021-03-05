package cn.edu.zju.gislab.SCSServices.mapper;

import cn.edu.zju.gislab.SCSServices.po.Rddyxx;
import cn.edu.zju.gislab.SCSServices.po.RddyxxExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RddyxxMapper {
    int countByExample(RddyxxExample example);

    int deleteByExample(RddyxxExample example);

    int insert(Rddyxx record);

    int insertSelective(Rddyxx record);

    List<Rddyxx> selectByExample(RddyxxExample example);

    int updateByExampleSelective(@Param("record") Rddyxx record, @Param("example") RddyxxExample example);

    int updateByExample(@Param("record") Rddyxx record, @Param("example") RddyxxExample example);
    public List<String> selectSingleStringList(@Param(value="sqlStr") String sqlStr);
}