package cn.zhucongqi.base.anno;

import tk.mybatis.mapper.version.VersionException;

/**
 * @author ：Jobsz
 * @project ：learning-mybatis-common-mapper
 * @date ：Created in 2019/12/11 11:24
 * @description：
 * @modified By：
 * @version:
 */
public interface AnnoApi<T> {
    T anno(T var1) throws Exception;
}
