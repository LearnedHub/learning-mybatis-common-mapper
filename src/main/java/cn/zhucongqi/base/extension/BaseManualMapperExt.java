package cn.zhucongqi.base.extension;

import cn.zhucongqi.base.BaseMapper;
import cn.zhucongqi.base.privoder.ManualMapperExtProvider;
import org.apache.ibatis.annotations.SelectProvider;
import tk.mybatis.mapper.annotation.RegisterMapper;

/**
 * @author ：Jobsz
 * @project ：learning-mybatis-common-mapper
 * @date ：Created in 2019/12/10 23:07
 * @description：
 * @modified By：
 * @version:
 */
//一定要加 @RegisterMapper 注解
@RegisterMapper
public interface BaseManualMapperExt<T> extends BaseMapper<T> {

    //这里的方法名称一定要与Provider中的方法名称一致
    @SelectProvider(type = ManualMapperExtProvider.class, method = "dynamicSQL")
    T getObjectByManualLogic(Integer id);

    @SelectProvider(type = ManualMapperExtProvider.class, method = "dynamicSQL")
    T getAnnotationValue(T t);
}
