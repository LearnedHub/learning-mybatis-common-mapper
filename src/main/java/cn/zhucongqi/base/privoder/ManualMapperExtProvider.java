package cn.zhucongqi.base.privoder;

import cn.zhucongqi.base.anno.Anno;
import org.apache.ibatis.mapping.MappedStatement;
import tk.mybatis.mapper.annotation.Version;
import tk.mybatis.mapper.entity.EntityColumn;
import tk.mybatis.mapper.mapperhelper.EntityHelper;
import tk.mybatis.mapper.mapperhelper.MapperHelper;
import tk.mybatis.mapper.mapperhelper.MapperTemplate;
import tk.mybatis.mapper.mapperhelper.SqlHelper;
import tk.mybatis.mapper.version.VersionException;

import java.util.Iterator;
import java.util.Set;

/**
 * @author ：Jobsz
 * @project ：learning-mybatis-common-mapper
 * @date ：Created in 2019/12/11 02:10
 * @description：
 * @modified By：
 * @version:
 */
public class ManualMapperExtProvider extends MapperTemplate {

    public ManualMapperExtProvider(Class<?> mapperClass, MapperHelper mapperHelper) {
        super(mapperClass, mapperHelper);
    }

    public String getObjectByManualLogic(MappedStatement ms) {
        Class<?> entityClass = this.getEntityClass(ms);
        this.setResultType(ms, entityClass);
        StringBuilder sql = new StringBuilder();
        sql.append(SqlHelper.selectAllColumns(entityClass));
        sql.append(SqlHelper.fromTable(entityClass, this.tableName(entityClass)));
        sql.append(SqlHelper.wherePKColumns(entityClass));
        return sql.toString();
    }

    public String getAnno(MappedStatement ms) {
        Class<?> entityClass = this.getEntityClass(ms);
        this.setResultType(ms, entityClass);
        StringBuilder sql = new StringBuilder();
        sql.append(SqlHelper.selectAllColumns(entityClass));
        sql.append(SqlHelper.fromTable(entityClass, this.tableName(entityClass)));
        // add anno column data
        Set<EntityColumn> columnSet = EntityHelper.getColumns(entityClass);
        EntityColumn annoColumn = null;
        Iterator iterator = columnSet.iterator();
        while (iterator.hasNext()) {
            EntityColumn column = (EntityColumn)iterator.next();
            if (column.getEntityField().isAnnotationPresent(Anno.class)) {
                if (annoColumn != null) {
                    break;
                }

                annoColumn = column;
            }
        }

        if (null != annoColumn) {
            sql.append("<bind name=\"");
            sql.append(annoColumn.getProperty());
            sql.append("\" value=\"@cn.zhucongqi.base.anno.AnnoUtil@getAnnoValue(@cn.zhucongqi.base.anno.DefaultAnno@class, ");
            sql.append(annoColumn.getProperty());
            sql.append(")\"/>");
        }
        sql.append(SqlHelper.whereAllIfColumns(entityClass, this.isNotEmpty()));
        return sql.toString();
    }
}
