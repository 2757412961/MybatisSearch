/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: RollForecastServiceImp
 * Author:   zhangzhe
 * Date:     2020/9/22 11:00
 * Description: 滚动预报服务实现
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package cn.edu.zju.gislab.SCSServices.service.impl;

import cn.edu.zju.gislab.SCSServices.mapper.HqtqybMapper;
import cn.edu.zju.gislab.SCSServices.mapper.ZfhyWlstMapper;
import cn.edu.zju.gislab.SCSServices.po.Hqtqyb;
import cn.edu.zju.gislab.SCSServices.po.HqtqybExample;
import cn.edu.zju.gislab.SCSServices.po.ZfhyWlst;
import cn.edu.zju.gislab.SCSServices.po.ZfhyWlstExample;
import cn.edu.zju.gislab.SCSServices.service.RollForecastService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * 〈滚动预报服务实现〉
 *
 * @author zhangzhe
 * @create 2020/9/22
 * @since 1.0.0
 */
public class RollForecastServiceImp implements RollForecastService {

    @Autowired
    private HqtqybMapper hqtqybMapper;

    @Autowired
    private ZfhyWlstMapper zfhyWlstMapper;
    /**
     *  获取所有近海区域预报信息
     * @return
     */
    @Override
    public List<Hqtqyb> getAllOffshoreArea() {
        HqtqybExample hqtqybExample = new HqtqybExample();
        hqtqybExample.setOrderByClause("hqbh, ybtc ASC");
        List<Hqtqyb> result = hqtqybMapper.selectByExample(hqtqybExample);
        return result;
    }

    /**
     *  获取所有执法海域预报信息
     * @return
     */
    @Override
    public List<ZfhyWlst> getAllLawEnforceArea() {
        ZfhyWlstExample zfhyWlstExample = new ZfhyWlstExample();
        zfhyWlstExample.setOrderByClause("hymc, ybrq, ybsc ASC");
        List<ZfhyWlst> result = zfhyWlstMapper.selectByExample(zfhyWlstExample);
        return result;
    }
}
