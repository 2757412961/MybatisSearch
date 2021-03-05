package cn.edu.zju.gislab.SCSServices.mapper;

import cn.edu.zju.gislab.SCSServices.po.Hqtqyb;
import cn.edu.zju.gislab.SCSServices.po.HqtqybExample;
import cn.edu.zju.gislab.SCSServices.po.HqtqybKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HqtqybMapper {
    int countByExample(HqtqybExample example);

    int deleteByExample(HqtqybExample example);

    int deleteByPrimaryKey(HqtqybKey key);

    int insert(Hqtqyb record);

    int insertSelective(Hqtqyb record);

    List<Hqtqyb> selectByExample(HqtqybExample example);

    Hqtqyb selectByPrimaryKey(HqtqybKey key);

    int updateByExampleSelective(@Param("record") Hqtqyb record, @Param("example") HqtqybExample example);

    int updateByExample(@Param("record") Hqtqyb record, @Param("example") HqtqybExample example);

    int updateByPrimaryKeySelective(Hqtqyb record);

    int updateByPrimaryKey(Hqtqyb record);
}