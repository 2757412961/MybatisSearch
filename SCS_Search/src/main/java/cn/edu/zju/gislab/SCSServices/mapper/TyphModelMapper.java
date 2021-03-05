package cn.edu.zju.gislab.SCSServices.mapper;

import cn.edu.zju.gislab.SCSServices.po.TyphModel;
import cn.edu.zju.gislab.SCSServices.po.TyphModelExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface TyphModelMapper {
    int countByExample(TyphModelExample example);

    int deleteByExample(TyphModelExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TyphModel record);

    int insertSelective(TyphModel record);

    List<TyphModel> selectByExample(TyphModelExample example);

    TyphModel selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TyphModel record, @Param("example") TyphModelExample example);

    int updateByExample(@Param("record") TyphModel record, @Param("example") TyphModelExample example);

    int updateByPrimaryKeySelective(TyphModel record);

    int updateByPrimaryKey(TyphModel record);

    List<TyphModel> selectSingleStringList(@Param(value = "sqlStr") String sqlStr);
}