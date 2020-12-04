package com.anicert.cloud.test.appdemo2.mapper;

import com.anicert.cloud.test.appdemo2.entity.Test;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TestMapper {

    Test getString(int id);
}
