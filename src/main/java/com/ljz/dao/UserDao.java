package com.ljz.dao;

import com.ljz.domain.User;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.jdbc.SQL;

import java.util.List;

/**
 *
 *  用户Dao 接口类
 *
 * Created by liangjiazhang on 2017/7/14.
 */


@Mapper            // 使用MyBatis

public interface UserDao {


    @Select("SELECT * FROM t_user where user_name =#{userName}")

    // 返回 Map 结果  查询全部用户
    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "userName", column = "user_name"),
            @Result(property = "userPassWord", column = "user_password"),
            @Result(property = "resigterDate", column = "date_time"),
            @Result(property = "updateTime", column = "update_time"),
            @Result(property = "deleteState", column = "delete_state"),
            @Result(property = "nickName",column = "user_nickname"),
            @Result(property = "userHead",column = "user_head"),
            @Result(property = "createBy",column = "create_by"),
            @Result(property = "updateBy",column = "update_by"),
    })

    /**
     *  查询单个用户
     */
    User findByUserName(@Param("userName") String userName);

    User findById(@Param("id") Long id);

    /**
     *  以下是用 Restful 服务， 其于 HTTP/JSON 传输
     */
    /**
     * 查询全部用语
     * @return
     */
    List<User> getAll();



    @Select("SELECT * FROM t_user WHERE user_name = #{user_name}")

    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "userName", column = "user_name"),
            @Result(property = "userPassWord", column = "user_password"),
            @Result(property = "resigterDate", column = "date_time"),
            @Result(property = "updateTime", column = "update_time"),
            @Result(property = "deleteState", column = "delete_state"),
            @Result(property = "nickName",column = "user_nickname"),
            @Result(property = "userHead",column = "user_head"),
            @Result(property = "createBy",column = "create_by"),
            @Result(property = "updateBy",column = "update_by"),
    })

    User getUserByName(String user_name);


    /**
     *  插入数据
     */
    @Insert("INSERT INTO t_user(user_name,user_password,date_time,update_time,delete_state,user_nickname,user_head,create_by,update_by) VALUES(#{userName}, #{userPassWord}, NOW(), #{updateTime}, #{deleteState}, #{nickName}, #{userHead}, #{createBy}, #{updateBy})")

    int insertUserData(User user);


    /**
     *  更新密码
     */
    @Update("UPDATE t_user SET user_password = #{userPassWord} WHERE id = #{id}")

    void updateUserPassword(User user);


    /**
     *  删除用户
     *
     */
    @Delete("DELETE FROM t_user WHERE id = #{id}")

    void deleteUserById(User user);


    /**
     *  更新用户的状态，将状态改为 1， 表示该用户已删除， 但数据还留在表中，
     *  状态为 0 时， 表示该用户是正常，查询全部有效的用户时显示出来
     */
    @Update("UPDATE t_user SET delete_state = #{deleteState} WHERE id = #{id}")

    void updateUserStateByUserId(User user);




//    @UpdateProvider(type = MerchantProvider.class, method = "updateSalesman")
//    void updateSalesman(@Param("M") MerchantSalesDTO merchantSalesDTO);



//    public String updateUserWithParam(@Param("U") User user);
//
//
//    {
//
//        SQL sql = new SQL(){{
//            UPDATE("t_user");
//
//            if (user.getUserPassWord() != null){
//                SET("user_password = #{U.userPassWord}");
//            }
//            if (user.getNickName() != null){
//                SET("upper = #{M.upper}");
//            }
//            WHERE("sales_id = #{M.salesId}");
//        }};
//        return sql.toString();
//
//    }

}
