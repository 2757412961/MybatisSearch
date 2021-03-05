package cn.edu.zju.gislab.SCSServices.service.impl;

import cn.edu.zju.gislab.SCSServices.mapper.ZfhyMapper;
import cn.edu.zju.gislab.SCSServices.po.Zfhy;
import cn.edu.zju.gislab.SCSServices.po.ZfhyExample;
import cn.edu.zju.gislab.SCSServices.service.LawAreaService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class LawAreaServiceImp implements LawAreaService {

    @Autowired
    private ZfhyMapper zfhyMapper;

    @Override
    public List<Zfhy> getZfhyByName(String areaName) {
        List<Zfhy> results = null;

        ZfhyExample zfhyExample = new ZfhyExample();
        ZfhyExample.Criteria criteria = zfhyExample.createCriteria();
        criteria.andHymcEqualTo(areaName);
        List<Zfhy> zfhyList = zfhyMapper.selectByExample(zfhyExample);
        if (zfhyList.size() > 0) results = zfhyList;

        return results;
    }

    @Override
    public List<Zfhy> getZfhyAll() {
        List<Zfhy> results = null;

        ZfhyExample zfhyExample = new ZfhyExample();
        List<Zfhy> zfhyList = zfhyMapper.selectByExample(zfhyExample);
        if (zfhyList.size() > 0) results = zfhyList;

        return results;
    }

}
