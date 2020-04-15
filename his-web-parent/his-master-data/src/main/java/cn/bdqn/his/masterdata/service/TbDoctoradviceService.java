package cn.bdqn.his.masterdata.service;

import cn.bdqn.his.masterdata.entity.TbDoctoradvice;
import cn.bdqn.his.masterdata.entity.TbIllness;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

public interface TbDoctoradviceService extends IService<TbDoctoradvice>{

    List<TbDoctoradvice> getAll();

}
