package cn.zhucongqi.demos;

import cn.zhucongqi.mapper.UserMapper;
import cn.zhucongqi.model.User;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author ：Jobsz
 * @project ：learning-mybatis-common-mapper
 * @date ：Created in 2019/12/11 00:47
 * @description：
 * @modified By：
 * @version:
 */
public class VersionDemos extends BaseDemo{

    private SqlSession sqlSession;

    public void testVersion() {

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                VersionDemos.this.versionInnerTest();
            }
        };

//        for (int i = 0; i < 10; i++) {
//            new Thread(runnable).start();
//        }
//        new Thread(runnable).start();

        this.versionInnerTest();
    }

    private void versionInnerTest() {
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
//                //先查找到数据数据
        User user = userMapper.selectByPrimaryKey(2);
        VersionDemos.this.printObject("😿😿😿😿😿😿😿Old Version"+user.getVersion());
//                //修改信息&Version
        user.setName("辛辣名字"+(System.currentTimeMillis()%36000));
        int ret = userMapper.updateByPrimaryKeySelective(user);
        user = userMapper.selectByPrimaryKey(2);
        this.printObject("😁😁😁😁😁😁😁New Version"+user.getVersion());
        this.printObject("ret"+ret);
    }

    public void setSqlSession(SqlSession sqlSession) {
        this.sqlSession = sqlSession;
    }

    public static void main(String[] args) {

        ApplicationContext cxt = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        VersionDemos versionDemos = new VersionDemos();
        versionDemos.setSqlSession(cxt.getBean(SqlSession.class));
        versionDemos.testVersion();
    }
}
