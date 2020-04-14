package cn.bdqn.his.prescription.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName(value = "p_info")
public class PInfo {
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 属于哪个模板
     */
    @TableField(value = "tempCode")
    private String tempcode;

    /**
     * 组号
     */
    @TableField(value = "group")
    private Integer group;

    @TableField(value = "medicineId")
    private Integer medicineid;

    /**
     * 单次用量
     */
    @TableField(value = "perCount")
    private String percount;

    /**
     * 用法
     */
    @TableField(value = "ways")
    private String ways;

    /**
     * 频度
     */
    @TableField(value = "frequency")
    private String frequency;

    /**
     * 天数
     */
    @TableField(value = "days")
    private String days;

    /**
     * 总量
     */
    @TableField(value = "allCount")
    private String allcount;

    /**
     * 单价
     */
    @TableField(value = "price")
    private Double price;

    private String medicineName;
}