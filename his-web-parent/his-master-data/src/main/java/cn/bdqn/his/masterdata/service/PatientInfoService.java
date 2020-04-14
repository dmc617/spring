package cn.bdqn.his.masterdata.service;

import cn.bdqn.his.masterdata.entity.PatientInfo;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

public interface PatientInfoService extends IService<PatientInfo>{

    List<PatientInfo> findByName(String name);
}
