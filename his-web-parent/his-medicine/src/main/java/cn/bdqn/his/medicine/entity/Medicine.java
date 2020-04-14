package cn.bdqn.his.medicine.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

/**
 * 药品基本信息表
 */
@Data
@Builder
@ToString
@TableName(value = "medicine")
public class Medicine {
    @TableId(value = "id",type = IdType.AUTO)
    private Long id;
    private String typeId;
    private String code;
    private String barcode;
    private String name;
    private String spec;
    private Integer stock;
    private String otc;
    private Integer costPrice;
    private Integer salePrice;
    private String factory;
}
