package cn.bdqn.his.prescription.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName(value = "p_type")
public class PType {
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @TableField(value = "type_name")
    private String typeName;
}