package com.meetstone.project.dao;
import com.meetstone.project.dao.entity.AcountEntity;
import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface AcountDao {
	@Results({
		@Result(property = "acount_id",  column = "acount_id"),
		@Result(property = "acount_name",  column = "acount_name"),
        @Result(property = "acount_passwrod",  column = "acount_psd"),
        @Result(property = "acount_role", column = "acount_role")
    })
	@Select("Select * from acount")
    List<AcountEntity> getAll();
	
	@Insert("insert into acount values(#{acount_id},#{acount_name},#{acount_passwrod},#{acount_role})")
	void SignUp(AcountEntity acount);
	
}
