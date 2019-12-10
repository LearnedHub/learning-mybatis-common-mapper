package cn.zhucongqi.demos;

import cn.zhucongqi.origin.mapper.OriginUserMapper;
import cn.zhucongqi.mapper.UserMapper;
import cn.zhucongqi.wrap.bean.UserOrders;
import com.alibaba.fastjson.JSON;
import org.apache.ibatis.session.SqlSession;
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
public class UserDemos {

    @Autowired
    SqlSession sqlSession;

    @Test
    public void testUserMapper0() {
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);

       //User user = userMapper.selectByPrimaryKey(1L);
      // user = userMapper.getHello(1l);
//        System.out.println(user+"😝😝😝😝😝😝😝😝😝");


        OriginUserMapper originUserMapper = sqlSession.getMapper(OriginUserMapper.class);
        originUserMapper.getUser(1l);

    }

    @Test
    public void testOriginFunc() {
        OriginUserMapper originUserMapper = sqlSession.getMapper(OriginUserMapper.class);

       HashMap ret = originUserMapper.getOriginUser(1l);

    }

    @Test
    public void testOne2ManyFunc() {

        OriginUserMapper originUserMapper = sqlSession.getMapper(OriginUserMapper.class);

        UserOrders userOrders = originUserMapper.getUserOrders(11l);


        System.out.println("ret to json"+ JSON.toJSON(userOrders));
    }
}
