package cn.zhucongqi.demos;

import cn.zhucongqi.mapper.ManualUserMapper;
import cn.zhucongqi.mapper.ext.ManualMapperExt;
import cn.zhucongqi.model.User;
import cn.zhucongqi.origin.mapper.OriginUserMapper;
import cn.zhucongqi.mapper.UserMapper;
import cn.zhucongqi.wrap.bean.UserOrders;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.HashMap;

/**
 * @author ：Jobsz
 * @project ：learning-mybatis-common-mapper
 * @date ：Created in 2019/12/10 15:45
 * @description：
 * @modified By：
 * @version:
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class UserDemos extends BaseDemo{

    @Autowired
    SqlSession sqlSession;

    @Autowired
    SqlSessionFactory sqlSessionFactory;

    @Test
    public void testUserMapper() {
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);

        User user = userMapper.selectByPrimaryKey(1L);
        this.printObject(user);
    }

    @Test
    public void testManualUserMapper() {
        ManualUserMapper manualUserMapper = sqlSession.getMapper(ManualUserMapper.class);
        User user = manualUserMapper.getUser(1l);
        this.printObject(user);
    }

    @Test
    public void testOriginFunc() {
        OriginUserMapper originUserMapper = sqlSession.getMapper(OriginUserMapper.class);
        HashMap ret = originUserMapper.getOriginUser(1l);
        this.printObject(ret);
    }

    @Test
    public void testOne2ManyFunc() {
        OriginUserMapper originUserMapper = sqlSession.getMapper(OriginUserMapper.class);
        UserOrders userOrders = originUserMapper.getUserOrders(11l);
        this.printObject(userOrders);
    }

    @Test
    public void testManualProvider() {
        ManualMapperExt manualUserMapperExt = sqlSession.getMapper(ManualMapperExt.class);
        User user = manualUserMapperExt.getObjectByManualLogic(11);
        this.printObject(user);
    }
}
