package cn.bdqn.his.masterdata.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.util.Date;
import lombok.Data;

@Data
@TableName(value = "user")
public class User {
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 工号
     */
    @TableField(value = "jobNo")
    private String jobno;

    @TableField(value = "name")
    private String name;

    @TableField(value = "sex")
    private String sex;

    @TableField(value = "age")
    private Integer age;

    @TableField(value = "phone")
    private String phone;

    /**
     * 所属诊所
     */
    @TableField(value = "clinic")
    private String clinic;

    /**
     * 所属科室
     */
    @TableField(value = "office")
    private String office;

    /**
     * 角色
     */
    @TableField(value = "roles")
    private String roles;

    @TableField(value = "createTime")
    private Date createtime;

    /**
     * 创建人员
     */
    @TableField(value = "createName")
    private String createname;

    /**
     * 员工状态
     */
    @TableField(value = "status")
    private Integer status;
}