package cn.edu.zju.gislab.SCSServices.mapper;

import cn.edu.zju.gislab.SCSServices.po.BuoyLast;
import cn.edu.zju.gislab.SCSServices.po.BuoyLastExample;
import cn.edu.zju.gislab.SCSServices.po.BuoyLastKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BuoyLastMapper {
    int countByExample(BuoyLastExample example);

    int deleteByExample(BuoyLastExample example);

    int deleteByPrimaryKey(BuoyLastKey key);

    int insert(BuoyLast record);

    int insertSelective(BuoyLast record);

    List<BuoyLast> selectByExample(BuoyLastExample example);

    BuoyLast selectByPrimaryKey(BuoyLastKey key);

    int updateByExampleSelective(@Param("record") BuoyLast record, @Param("example") BuoyLastExample example);

    int updateByExample(@Param("record") BuoyLast record, @Param("example") BuoyLastExample example);

    int updateByPrimaryKeySelective(BuoyLast record);

    int updateByPrimaryKey(BuoyLast record);
}