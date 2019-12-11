package cn.zhucongqi.origin.mapper;

import cn.zhucongqi.model.User;
import cn.zhucongqi.wrap.bean.UserOrders;

import java.util.HashMap;

/**
 * @author ：Jobsz
 * @project ：learning-mybatis-common-mapper
 * @date ：Created in 2019/12/10 18:59
 * @description：
 * @modified By：
 * @version:
 */
public interface OriginUserMapper {

    User getUser(Integer id);

    HashMap getOriginUser(Integer id);

    UserOrders getUserOrders(Integer id);
}
