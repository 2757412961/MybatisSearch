package cn.edu.zju.gislab.SCSServices.mapper;

import cn.edu.zju.gislab.SCSServices.po.Zfhy;
import cn.edu.zju.gislab.SCSServices.po.ZfhyExample;
import cn.edu.zju.gislab.SCSServices.po.ZfhyKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ZfhyMapper {
    int countByExample(ZfhyExample example);

    int deleteByExample(ZfhyExample example);

    int deleteByPrimaryKey(ZfhyKey key);

    int insert(Zfhy record);

    int insertSelective(Zfhy record);

    List<Zfhy> selectByExample(ZfhyExample example);

    Zfhy selectByPrimaryKey(ZfhyKey key);

    int updateByExampleSelective(@Param("record") Zfhy record, @Param("example") ZfhyExample example);

    int updateByExample(@Param("record") Zfhy record, @Param("example") ZfhyExample example);

    int updateByPrimaryKeySelective(Zfhy record);

    int updateByPrimaryKey(Zfhy record);
}