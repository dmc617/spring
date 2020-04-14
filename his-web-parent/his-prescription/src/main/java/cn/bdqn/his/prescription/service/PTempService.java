package cn.bdqn.his.prescription.service;

import cn.bdqn.his.prescription.entity.PTemp;
import com.baomidou.mybatisplus.extension.service.IService;
import org.apache.ibatis.annotations.Param;

import java.util.List;
public interface PTempService extends IService<PTemp>{

    List<PTemp> findTemplate(@Param("typeId") Integer typeId, @Param("permissionId") Integer permissionId, @Param("name") String name);
}
