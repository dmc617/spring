package cn.bdqn.his.prescription.service.impl;

import cn.bdqn.his.prescription.service.PTempService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import cn.bdqn.his.prescription.mapper.PTempMapper;
import cn.bdqn.his.prescription.entity.PTemp;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
@Service
public class PTempServiceImpl extends ServiceImpl<PTempMapper, PTemp> implements PTempService {

    @Resource
    PTempMapper pTempMapper;

    @Override
    public List<PTemp> findTemplate(@Param("typeId") Integer typeId, @Param("permissionId") Integer permissionId, @Param("name") String name) {
        return pTempMapper.findByTemplate(typeId,permissionId,name);
    }
}
