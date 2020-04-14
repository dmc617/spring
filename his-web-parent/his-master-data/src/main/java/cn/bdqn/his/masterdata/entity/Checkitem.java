package cn.bdqn.his.masterdata.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.util.Date;
import lombok.Data;

@Data
@TableName(value = "checkitem")
public class Checkitem {
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @TableField(value = "code")
    private String code;

    @TableField(value = "name")
    private String name;

    /**
     * 项目类别id
     */
    @TableField(value = "typeId")
    private Integer typeid;

    private String typeName;

    /**
     * 发票项目id
     */
    @TableField(value = "invoiceProjectId")
    private Integer invoiceprojectid;

    private String invoiceName;

    /**
     * 零售价
     */
    @TableField(value = "price")
    private Double price;

    /**
     * 成本
     */
    @TableField(value = "cost")
    private Double cost;

    /**
     * 单位
     */
    @TableField(value = "unit")
    private String unit;

    /**
     * 状态：0停用，1启用
     */
    @TableField(value = "status")
    private Integer status;

    /**
     * 创建时间
     */
    @TableField(value = "createTime")
    private Date createtime;
}