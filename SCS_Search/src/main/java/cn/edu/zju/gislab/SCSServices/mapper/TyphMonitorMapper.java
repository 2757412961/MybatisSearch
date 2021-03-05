package cn.edu.zju.gislab.SCSServices.mapper;

import cn.edu.zju.gislab.SCSServices.po.TyphMonitor;
import cn.edu.zju.gislab.SCSServices.po.TyphMonitorExample;
import cn.edu.zju.gislab.SCSServices.po.TyphMonitorKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TyphMonitorMapper {
    int countByExample(TyphMonitorExample example);

    int deleteByExample(TyphMonitorExample example);

    int deleteByPrimaryKey(TyphMonitorKey key);

    int insert(TyphMonitor record);

    int insertSelective(TyphMonitor record);

    List<TyphMonitor> selectByExample(TyphMonitorExample example);

    TyphMonitor selectByPrimaryKey(TyphMonitorKey key);

    int updateByExampleSelective(@Param("record") TyphMonitor record, @Param("example") TyphMonitorExample example);

    int updateByExample(@Param("record") TyphMonitor record, @Param("example") TyphMonitorExample example);

    int updateByPrimaryKeySelective(TyphMonitor record);

    int updateByPrimaryKey(TyphMonitor record);
}