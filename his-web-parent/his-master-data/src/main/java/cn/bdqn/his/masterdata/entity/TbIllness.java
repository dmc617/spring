package cn.bdqn.his.masterdata.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName(value = "tb_illness")
public class TbIllness {
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 疾病名称
     */
    @TableField(value = "name")
    private String name;
}