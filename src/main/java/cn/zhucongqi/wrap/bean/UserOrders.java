package cn.zhucongqi.wrap.bean;

import cn.zhucongqi.model.Mallorder;
import cn.zhucongqi.model.User;

import java.util.List;

/**
 * @author ：Jobsz
 * @project ：learning-mybatis-common-mapper
 * @date ：Created in 2019/12/10 19:16
 * @description：
 * @modified By：
 * @version:
 */
public class UserOrders extends User {

    private List<Mallorder> orders;

    public List<Mallorder> getOrders() {
        return orders;
    }

    public void setOrders(List<Mallorder> orders) {
        this.orders = orders;
    }
}
