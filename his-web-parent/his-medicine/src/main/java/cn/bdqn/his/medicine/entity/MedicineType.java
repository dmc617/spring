package cn.bdqn.his.medicine.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 药品分类实体
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "medicine_type")
public class MedicineType {
    @TableId(value = "id",type = IdType.AUTO)
    private Integer id;
    private String name;
}
