package cn.edu.zju.gislab.SCSServices.mapper;

import cn.edu.zju.gislab.SCSServices.po.TyphInfo;
import cn.edu.zju.gislab.SCSServices.po.TyphInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TyphInfoMapper {
    int countByExample(TyphInfoExample example);

    int deleteByExample(TyphInfoExample example);

    int deleteByPrimaryKey(Long typhNum);

    int insert(TyphInfo record);

    int insertSelective(TyphInfo record);

    List<TyphInfo> selectByExample(TyphInfoExample example);

    TyphInfo selectByPrimaryKey(Long typhNum);

    int updateByExampleSelective(@Param("record") TyphInfo record, @Param("example") TyphInfoExample example);

    int updateByExample(@Param("record") TyphInfo record, @Param("example") TyphInfoExample example);

    int updateByPrimaryKeySelective(TyphInfo record);

    int updateByPrimaryKey(TyphInfo record);
}