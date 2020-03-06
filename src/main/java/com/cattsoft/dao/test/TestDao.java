package com.cattsoft.dao.test;


import com.cattsoft.eitity.test.TbUser;
import org.apache.ibatis.annotations.Select;

public interface TestDao {

    @Select("select * from tb_user where id=#{id}")
    public TbUser findById(String id) throws Exception;

}
