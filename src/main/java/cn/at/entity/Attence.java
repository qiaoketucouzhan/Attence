package cn.at.entity;

import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * (Attence)实体类
 *
 * @author makejava
 * @since 2021-04-30 09:43:14
 */
public class Attence implements Serializable {
    private static final long serialVersionUID = 166478071966301035L;

    private Integer id;
    /**
     * 员工姓名
     */
    private String empname;
    /**
     * 部门
     */
    private String dept;
    /**
     * 考勤日期
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date chkdate;
    /**
     * 考勤类型
     */
    private Integer status;

    private String status1;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmpname() {
        return empname;
    }

    public void setEmpname(String empname) {
        this.empname = empname;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public Date getChkdate() {
        return chkdate;
    }

    public void setChkdate(Date chkdate) {
        this.chkdate = chkdate;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }


    public String getStatus1() {
        if (status==1){
            return "正常";
        }else if(status==2){
            return "迟到";
        }else if(status==3) {
            return "早退";
        }else if(status==4){
            return "休假";
        }else{
            return "外出";
        }
    }

    public void setStatus1(String status1) {
        this.status1 = status1;
    }
}