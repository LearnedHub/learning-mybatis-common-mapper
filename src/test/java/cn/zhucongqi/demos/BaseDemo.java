package cn.zhucongqi.demos;

import com.alibaba.fastjson.JSON;

/**
 * @author ：Jobsz
 * @project ：learning-mybatis-common-mapper
 * @date ：Created in 2019/12/11 00:48
 * @description：
 * @modified By：
 * @version:
 */
public class BaseDemo {

    protected void printObject(Object obj) {
        System.out.println("========================start===================");
        System.out.println("【【data = " + JSON.toJSON(obj) + "】】");
        System.out.println("==========================end===================");
    }

}
