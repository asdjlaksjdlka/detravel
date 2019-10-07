package com.qf.detravel.service;

import com.qf.detravel.entity.Scenic;
import com.qf.detravel.vo.ScenicVo;

import java.util.List;
import java.util.Map;

public interface ScenicService {
    /**
     * 这个是根据类别id和地区名称查询所有的景点信息
     * @param vId 需要的类别id
     * @param region 需要的地区名称
     * @return 返回的是所有的景点信息
     */
    public List<Scenic> findAllScenic(Integer vId, String region);

    /**
     * 这是查询所属国家的景点信息
     * @param vId 需要的类别id
     * @param region 需要的地区名称
     * @param country 需要国家名称
     * @return 返回的是所属国家的景点信息
     */
    public List<Scenic> findAllByCountry(Integer vId, String region, String country);

    /**
     * 这是查询国家类景点个数
     * @param vId 需要的类别id
     * @param region 需要的地区名称
     * @param country 需要的国家名称
     * @return 返回的是一个Map集合
     */
    public Map<String, Integer> findCountryCount(Integer vId, String region, String country);

    /**
     * 这里查询的是具体的景点信息
     * @param vId 需要类别id
     * @param name 需要的景点名称
     * @param region 需要的地区名称
     * @param country 需要的国家名称
     * @return 返回的是景点信息
     */
    public ScenicVo findScenic(Integer vId, String name, String region, String country);
}
