package cn.edu.zju.gislab.SCSServices.mapper;

import cn.edu.zju.gislab.SCSServices.po.TyphForecast;
import cn.edu.zju.gislab.SCSServices.po.TyphForecastExample;
import cn.edu.zju.gislab.SCSServices.po.TyphForecastKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TyphForecastMapper {
    int countByExample(TyphForecastExample example);

    int deleteByExample(TyphForecastExample example);

    int deleteByPrimaryKey(TyphForecastKey key);

    int insert(TyphForecast record);

    int insertSelective(TyphForecast record);

    List<TyphForecast> selectByExample(TyphForecastExample example);

    TyphForecast selectByPrimaryKey(TyphForecastKey key);

    int updateByExampleSelective(@Param("record") TyphForecast record, @Param("example") TyphForecastExample example);

    int updateByExample(@Param("record") TyphForecast record, @Param("example") TyphForecastExample example);

    int updateByPrimaryKeySelective(TyphForecast record);

    int updateByPrimaryKey(TyphForecast record);
}