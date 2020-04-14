package cn.bdqn.his.masterdata.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import cn.bdqn.his.masterdata.mapper.PatientInfoMapper;
import cn.bdqn.his.masterdata.entity.PatientInfo;
import cn.bdqn.his.masterdata.service.PatientInfoService;
@Service
public class PatientInfoServiceImpl extends ServiceImpl<PatientInfoMapper, PatientInfo> implements PatientInfoService{

    @Autowired
    PatientInfoMapper patientInfoMapper;

    @Override
    public List<PatientInfo> findByName(String name) {
        return patientInfoMapper.findByName(name);
    }
}
