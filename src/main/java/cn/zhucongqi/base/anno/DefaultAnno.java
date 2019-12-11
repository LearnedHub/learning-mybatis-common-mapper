package cn.zhucongqi.base.anno;

/**
 * @author ：Jobsz
 * @project ：learning-mybatis-common-mapper
 * @date ：Created in 2019/12/11 11:25
 * @description：
 * @modified By：
 * @version:
 */
public class DefaultAnno implements AnnoApi{

    @Override
    public Object anno(Object var1) throws Exception {
        return var1 == null ? "" : var1;
    }
}
