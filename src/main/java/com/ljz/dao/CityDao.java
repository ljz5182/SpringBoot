package com.ljz.dao;

import com.ljz.domain.City;
import org.apache.ibatis.annotations.*;

/**
 *
 * 城市 DAO 接口类
 *
 * Created by liangjiazhang on 2017/7/13.
 */

@Mapper         // 标志为 Mybatis 的  Mapper

public interface CityDao {

    /**
     *  根据城市名称， 查询城市信息
     *
     *  @param  cityName  城市名
     *
     */
    @Select("SELECT * FROM city")

    // 返回 Map 结果集
    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "provinceId", column = "province_id"),
            @Result(property = "cityName", column = "city_Name"),
            @Result(property = "description", column = "description"),
    })
    City findByName(@Param("cityName") String cityName );
}
