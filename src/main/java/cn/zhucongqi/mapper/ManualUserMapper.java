package cn.zhucongqi.mapper;

import cn.zhucongqi.base.BaseMapper;
import cn.zhucongqi.model.User;
import org.apache.ibatis.annotations.Select;

/**
 * @author ：Jobsz
 * @project ：learning-mybatis-common-mapper
 * @date ：Created in 2019/12/10 23:07
 * @description：
 * @modified By：
 * @version:
 */
// 这里只能extends BaseMapper，Mapper插件在reflect时需要这个泛型T，
// 因为是对同一个类型，所以extends自UserMapper和BaseMapper<User>,
// 从结果上是一致的，但是在实践中，会比较奇怪，这里继续探究
public interface ManualUserMapper extends BaseMapper<User> {

    @Select("select * from user where id = #{id}")
    User getUser(Object id);
}
