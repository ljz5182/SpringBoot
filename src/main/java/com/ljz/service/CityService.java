package com.ljz.service;

import com.ljz.domain.City;

/**
 *
 *  城市业务逻辑接口类
 *
 * Created by liangjiazhang on 2017/7/13.
 *
 */
public interface CityService {

    /**
     *  根据城市名称，查询城市信息
     * @param cityName
     * @return
     */
    City findCityByName(String cityName);
}
