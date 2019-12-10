package cn.zhucongqi.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "`mallorder`")
public class Mallorder {
    @Id
    @Column(name = "`id`")
    @GeneratedValue(generator = "JDBC")
    private Integer id;

    @Column(name = "`uid`")
    private Integer uid;

    @Column(name = "`date`")
    private Date date;

    @Column(name = "`descr`")
    private String descr;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return uid
     */
    public Integer getUid() {
        return uid;
    }

    /**
     * @param uid
     */
    public void setUid(Integer uid) {
        this.uid = uid;
    }

    /**
     * @return date
     */
    public Date getDate() {
        return date;
    }

    /**
     * @param date
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * @return descr
     */
    public String getDescr() {
        return descr;
    }

    /**
     * @param descr
     */
    public void setDescr(String descr) {
        this.descr = descr;
    }
}