package cn.zhucongqi.base.anno;

/**
 * @author ：Jobsz
 * @project ：learning-mybatis-common-mapper
 * @date ：Created in 2019/12/11 16:02
 * @description：
 * @modified By：
 * @version:
 */
public class AnnoUtil {

    public static Object getAnnoValue(Class<? extends AnnoApi> clazz, Object var) throws Exception {
        AnnoApi annoApi = clazz.newInstance();
        return annoApi.anno(var);
    }

}
