package com.ljz.service.impl;

import com.ljz.dao.CityDao;
import com.ljz.domain.City;
import com.ljz.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.io.Serializable;

/**
 *
 * 城市业务逻辑实现类
 *
 * Created by liangjiazhang on 2017/7/13.
 */

@Service

public class CityServiceImpl implements CityService  {

    @Autowired
    private CityDao cityDao;

    /**
     *
     * @param cityName
     * @return
     */
    public City findCityByName(String cityName) {
        return cityDao.findByName(cityName);
    }
}
