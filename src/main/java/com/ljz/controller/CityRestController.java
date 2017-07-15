package com.ljz.controller;

import com.ljz.domain.City;
import com.ljz.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by liangjiazhang on 2017/7/13.
 */

@RestController

public class CityRestController {

    @Autowired
    private CityService cityService;

    //  这个方法，GE／POST 都可以用
    @RequestMapping(value = "/api/city", method = {RequestMethod.GET, RequestMethod.POST} )
    public City findOneCity(@RequestParam(value = "cityName", required = true) String cityName) {
        return cityService.findCityByName(cityName);
    }



}
