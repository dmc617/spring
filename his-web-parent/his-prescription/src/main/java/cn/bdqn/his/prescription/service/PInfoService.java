package cn.bdqn.his.prescription.service;

import cn.bdqn.his.prescription.entity.PInfo;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

public interface PInfoService extends IService<PInfo>{

    List<PInfo> findPreInfo(String code);
}
