package cn.bdqn.his.prescription.service.impl;

import cn.bdqn.his.prescription.service.PInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import cn.bdqn.his.prescription.entity.PInfo;
import cn.bdqn.his.prescription.mapper.PInfoMapper;

import java.util.List;

@Service
public class PInfoServiceImpl extends ServiceImpl<PInfoMapper, PInfo> implements PInfoService {

    @Autowired
    PInfoMapper pInfoMapper;


    @Override
    public List<PInfo> findPreInfo(String code) {
        return pInfoMapper.selectByCode(code);
    }
}
