package cn.bdqn.his.masterdata.service;

import cn.bdqn.his.masterdata.entity.Checkitem;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

public interface CheckitemService extends IService<Checkitem>{

    List<Checkitem> find(Integer status,String name);
}
