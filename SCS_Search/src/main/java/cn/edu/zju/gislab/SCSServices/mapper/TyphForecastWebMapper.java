package cn.edu.zju.gislab.SCSServices.mapper;

import cn.edu.zju.gislab.SCSServices.po.TyphForecastWeb;
import cn.edu.zju.gislab.SCSServices.po.TyphForecastWebExample;
import cn.edu.zju.gislab.SCSServices.po.TyphForecastWebKey;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface TyphForecastWebMapper {
    int countByExample(TyphForecastWebExample example);

    int deleteByExample(TyphForecastWebExample example);

    int deleteByPrimaryKey(TyphForecastWebKey key);

    int insert(TyphForecastWeb record);

    int insertSelective(TyphForecastWeb record);

    List<TyphForecastWeb> selectByExample(TyphForecastWebExample example);

    TyphForecastWeb selectByPrimaryKey(TyphForecastWebKey key);

    int updateByExampleSelective(@Param("record") TyphForecastWeb record, @Param("example") TyphForecastWebExample example);

    int updateByExample(@Param("record") TyphForecastWeb record, @Param("example") TyphForecastWebExample example);

    int updateByPrimaryKeySelective(TyphForecastWeb record);

    int updateByPrimaryKey(TyphForecastWeb record);

    List<TyphForecastWeb> selectSingleStringList(@Param(value = "sqlStr") String sqlStr);
}