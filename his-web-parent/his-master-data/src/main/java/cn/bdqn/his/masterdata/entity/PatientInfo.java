package cn.bdqn.his.masterdata.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.util.Date;
import lombok.Data;

@Data
@TableName(value = "patient_info")
public class PatientInfo {
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @TableField(value = "bodyId")
    private Integer bodyid;

    @TableField(value = "name")
    private String name;

    /**
     * 卡号
     */
    @TableField(value = "cardNumber")
    private String cardnumber;

    @TableField(value = "age")
    private Integer age;

    @TableField(value = "bornDate")
    private Date borndate;

    @TableField(value = "sex")
    private String sex;

    @TableField(value = "phone")
    private String phone;

    @TableField(value = "IDCard")
    private String idcard;

    /**
     * 会员类型
     */
    @TableField(value = "isMember")
    private Integer ismember;

    /**
     * 会员到期时间
     */
    @TableField(value = "memberExpiraDate")
    private Date memberexpiradate;

    /**
     * 民族
     */
    @TableField(value = "nationality")
    private String nationality;

    /**
     * 婚姻状况
     */
    @TableField(value = "maritalStatus")
    private String maritalstatus;

    @TableField(value = "education")
    private String education;

    @TableField(value = "career")
    private String career;

    /**
     * 工作单位
     */
    @TableField(value = "company")
    private String company;

    @TableField(value = "address")
    private String address;

    @TableField(value = "comment")
    private String comment;
}