package com.anicert.cloud.test.appdemo2.controller;

import com.anicert.cloud.test.appdemo2.service.ITestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class DBController {

    @Autowired
    private ITestService iTestService;

    @GetMapping("/getdbstring")
    public String getDBString(){
        return iTestService.getDBString();
    }

    @GetMapping("/testperformance")
    public String testPerformance(){
        List<Integer> testList = new ArrayList<>();

        for (int i=0;i<=10000;i++){
            // 获取1到100000之间的随机数
            int random=(int)(Math.random()*10000+1);
            testList.add(random);
        }
        Integer[] queue = testList.toArray(new Integer[testList.size()]);

        maopaoSort(queue);

        return "OK";
    }

    private void maopaoSort(Integer[] queue) {
        int qLength = queue.length;
        // 外层循环循环整个数组（不包含最后一个元素）
        for (int i = 0; i < queue.length - 1; i++) {
            // 内从循环的开始为数组的第一位，结束位置很重要，要每次把最会一个元素（已经排好序的元素）剔除掉
            // 所以是j<queue.length-1-i
            for (int j = 0; j < queue.length - 1 - i; j++) {
                // 如果当前元素的值比后续元素的值大，则两者交换
                if (queue[j] > queue[j + 1]) {
                    Integer tmp = queue[j];
                    queue[j] = queue[j + 1];
                    queue[j + 1] = tmp;
                }
            }
        }
    }
}
