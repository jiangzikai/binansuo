package com.kaihang.binansuo.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 用户DTO
 */
@ApiModel(value="用户对象DTO",description="用户对象DTO")
public class TbUserDTO {
    @ApiModelProperty(value="用户名",name="name",example="jiangzikai")
    private String name;
    @ApiModelProperty(value="性别",name="sex",example="男")
    private String sex;
    @ApiModelProperty(value="年龄",name="age",example="18")
    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
