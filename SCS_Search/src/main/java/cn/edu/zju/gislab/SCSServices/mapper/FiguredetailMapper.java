package cn.edu.zju.gislab.SCSServices.mapper;

import cn.edu.zju.gislab.SCSServices.po.Figuredetail;
import cn.edu.zju.gislab.SCSServices.po.FiguredetailExample;
import cn.edu.zju.gislab.SCSServices.po.FiguredetailKey;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface FiguredetailMapper {
    int countByExample(FiguredetailExample example);

    int deleteByExample(FiguredetailExample example);

    int deleteByPrimaryKey(FiguredetailKey key);

    int insert(Figuredetail record);

    int insertSelective(Figuredetail record);

    List<Figuredetail> selectByExampleWithBLOBs(FiguredetailExample example);

    List<Figuredetail> selectByExample(FiguredetailExample example);

    Figuredetail selectByPrimaryKey(FiguredetailKey key);

    int updateByExampleSelective(@Param("record") Figuredetail record, @Param("example") FiguredetailExample example);

    int updateByExampleWithBLOBs(@Param("record") Figuredetail record, @Param("example") FiguredetailExample example);

    int updateByExample(@Param("record") Figuredetail record, @Param("example") FiguredetailExample example);

    int updateByPrimaryKeySelective(Figuredetail record);

    int updateByPrimaryKeyWithBLOBs(Figuredetail record);

    int updateByPrimaryKey(Figuredetail record);

    List<Figuredetail> selectSingleSQL(@Param(value = "sqlStr") String sqlStr);
}