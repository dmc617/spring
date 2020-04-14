package cn.bdqn.his.prescription.service.impl;

import cn.bdqn.his.prescription.service.PTypeService;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import cn.bdqn.his.prescription.mapper.PTypeMapper;
import cn.bdqn.his.prescription.entity.PType;

@Service
public class PTypeServiceImpl extends ServiceImpl<PTypeMapper, PType> implements PTypeService {

}
