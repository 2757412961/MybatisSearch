package cn.edu.zju.gislab.SCSServices.mapper;

import cn.edu.zju.gislab.SCSServices.po.ScsGroup;
import cn.edu.zju.gislab.SCSServices.po.ScsGroupExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ScsGroupMapper {
    int countByExample(ScsGroupExample example);

    int deleteByExample(ScsGroupExample example);

    int deleteByPrimaryKey(BigDecimal id);

    int insert(ScsGroup record);

    int insertSelective(ScsGroup record);

    List<ScsGroup> selectByExample(ScsGroupExample example);

    ScsGroup selectByPrimaryKey(BigDecimal id);

    int updateByExampleSelective(@Param("record") ScsGroup record, @Param("example") ScsGroupExample example);

    int updateByExample(@Param("record") ScsGroup record, @Param("example") ScsGroupExample example);

    int updateByPrimaryKeySelective(ScsGroup record);

    int updateByPrimaryKey(ScsGroup record);
}