package cn.bdqn.his.masterdata.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName(value = "tb_doctoradvice")
public class TbDoctoradvice {
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 医嘱
     */
    @TableField(value = "advice")
    private String advice;
}