package cn.bdqn.his.prescription.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName(value = "temp_permission")
public class TempPermission {
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @TableField(value = "permission_name")
    private String permissionName;
}