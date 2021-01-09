package com.kaihang.binansuo.dao.mapper;

import com.kaihang.binansuo.dao.entity.TbUser;
import com.kaihang.binansuo.dao.entity.TbUserExample;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

import java.util.List;

public interface TbUserMapper {
    @SelectProvider(type= TbUserSqlProvider.class, method="countByExample")
    long countByExample(TbUserExample example);

    @DeleteProvider(type= TbUserSqlProvider.class, method="deleteByExample")
    int deleteByExample(TbUserExample example);

    @Delete({
        "delete from tb_user",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into tb_user (name, sex, ",
        "age, ip, remark, ",
        "valid_ind, create_time, ",
        "modify_time)",
        "values (#{name,jdbcType=VARCHAR}, #{sex,jdbcType=VARCHAR}, ",
        "#{age,jdbcType=INTEGER}, #{ip,jdbcType=VARCHAR}, #{remark,jdbcType=VARCHAR}, ",
        "#{validInd,jdbcType=INTEGER}, #{createTime,jdbcType=TIMESTAMP}, ",
        "#{modifyTime,jdbcType=TIMESTAMP})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Integer.class)
    int insert(TbUser record);

    @InsertProvider(type= TbUserSqlProvider.class, method="insertSelective")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Integer.class)
    int insertSelective(TbUser record);

    @SelectProvider(type= TbUserSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="sex", property="sex", jdbcType=JdbcType.VARCHAR),
        @Result(column="age", property="age", jdbcType=JdbcType.INTEGER),
        @Result(column="ip", property="ip", jdbcType=JdbcType.VARCHAR),
        @Result(column="remark", property="remark", jdbcType=JdbcType.VARCHAR),
        @Result(column="valid_ind", property="validInd", jdbcType=JdbcType.INTEGER),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="modify_time", property="modifyTime", jdbcType=JdbcType.TIMESTAMP)
    })
    List<TbUser> selectByExample(TbUserExample example);

    @Select({
        "select",
        "id, name, sex, age, ip, remark, valid_ind, create_time, modify_time",
        "from tb_user",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="sex", property="sex", jdbcType=JdbcType.VARCHAR),
        @Result(column="age", property="age", jdbcType=JdbcType.INTEGER),
        @Result(column="ip", property="ip", jdbcType=JdbcType.VARCHAR),
        @Result(column="remark", property="remark", jdbcType=JdbcType.VARCHAR),
        @Result(column="valid_ind", property="validInd", jdbcType=JdbcType.INTEGER),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="modify_time", property="modifyTime", jdbcType=JdbcType.TIMESTAMP)
    })
    TbUser selectByPrimaryKey(Integer id);

    @UpdateProvider(type= TbUserSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") TbUser record, @Param("example") TbUserExample example);

    @UpdateProvider(type= TbUserSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") TbUser record, @Param("example") TbUserExample example);

    @UpdateProvider(type= TbUserSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(TbUser record);

    @Update({
        "update tb_user",
        "set name = #{name,jdbcType=VARCHAR},",
          "sex = #{sex,jdbcType=VARCHAR},",
          "age = #{age,jdbcType=INTEGER},",
          "ip = #{ip,jdbcType=VARCHAR},",
          "remark = #{remark,jdbcType=VARCHAR},",
          "valid_ind = #{validInd,jdbcType=INTEGER},",
          "create_time = #{createTime,jdbcType=TIMESTAMP},",
          "modify_time = #{modifyTime,jdbcType=TIMESTAMP}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(TbUser record);
}
