package cn.edu.zju.gislab.SCSServices.mapper;

import cn.edu.zju.gislab.SCSServices.po.TyphMonitorWeb;
import cn.edu.zju.gislab.SCSServices.po.TyphMonitorWebExample;
import cn.edu.zju.gislab.SCSServices.po.TyphMonitorWebKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TyphMonitorWebMapper {
    int countByExample(TyphMonitorWebExample example);

    int deleteByExample(TyphMonitorWebExample example);

    int deleteByPrimaryKey(TyphMonitorWebKey key);

    int insert(TyphMonitorWeb record);

    int insertSelective(TyphMonitorWeb record);

    List<TyphMonitorWeb> selectByExample(TyphMonitorWebExample example);

    TyphMonitorWeb selectByPrimaryKey(TyphMonitorWebKey key);

    int updateByExampleSelective(@Param("record") TyphMonitorWeb record, @Param("example") TyphMonitorWebExample example);

    int updateByExample(@Param("record") TyphMonitorWeb record, @Param("example") TyphMonitorWebExample example);

    int updateByPrimaryKeySelective(TyphMonitorWeb record);

    int updateByPrimaryKey(TyphMonitorWeb record);
}