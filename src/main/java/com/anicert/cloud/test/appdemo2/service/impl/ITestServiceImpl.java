package com.anicert.cloud.test.appdemo2.service.impl;

import com.anicert.cloud.test.appdemo2.entity.Test;
import com.anicert.cloud.test.appdemo2.mapper.TestMapper;
import com.anicert.cloud.test.appdemo2.service.ITestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ITestServiceImpl implements ITestService {

    @Autowired
    private TestMapper testMapper;

    @Override
    public String getDBString() {
        // 获取1到10之间的随机数
        int random=(int)(Math.random()*10+1);
        Test test = testMapper.getString(random);
        if (test == null){
            return "无数据";
        }else{
            return test.getString();
        }
    }
}
