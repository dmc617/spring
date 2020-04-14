package cn.bdqn.his.prescription.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.util.Date;
import lombok.Data;

@Data
@TableName(value = "p_temp")
public class PTemp {
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @TableField(value = "code")
    private String code;

    @TableField(value = "name")
    private String name;

    /**
     * 模板说明
     */
    @TableField(value = "explains")
    private String explains;

    /**
     * 处方类型
     */
    @TableField(value = "type")
    private Integer type;

    @TableField(value = "permission")
    private String permission;

    /**
     * 诊断
     */
    @TableField(value = "diagnose")
    private String diagnose;

    @TableField(value = "createTime")
    private Date createtime;

    @TableField(value = "createName")
    private String createname;
}