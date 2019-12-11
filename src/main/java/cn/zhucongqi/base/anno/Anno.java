package cn.zhucongqi.base.anno;

import tk.mybatis.mapper.version.DefaultNextVersion;
import tk.mybatis.mapper.version.NextVersion;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author ：Jobsz
 * @project ：learning-mybatis-common-mapper
 * @date ：Created in 2019/12/11 11:23
 * @description：
 * @modified By：
 * @version:
 */
@Target({ElementType.FIELD, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface Anno {
    Class<? extends AnnoApi> anno() default DefaultAnno.class;
}
