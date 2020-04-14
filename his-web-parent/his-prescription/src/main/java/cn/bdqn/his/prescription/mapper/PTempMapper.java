package cn.bdqn.his.prescription.mapper;

import cn.bdqn.his.prescription.entity.PTemp;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 处方模板信息
 */
public interface PTempMapper extends BaseMapper<PTemp> {
    
    List<PTemp> findByTemplate(@Param("typeId") Integer typeId, @Param("permissionId") Integer permissionId, @Param("name") String name);

}