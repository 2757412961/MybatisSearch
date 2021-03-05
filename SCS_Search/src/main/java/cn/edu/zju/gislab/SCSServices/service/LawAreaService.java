package cn.edu.zju.gislab.SCSServices.service;

import cn.edu.zju.gislab.SCSServices.po.Zfhy;

import java.util.List;

public interface LawAreaService {
    List<Zfhy> getZfhyByName(String areaName);

    List<Zfhy> getZfhyAll();
}
