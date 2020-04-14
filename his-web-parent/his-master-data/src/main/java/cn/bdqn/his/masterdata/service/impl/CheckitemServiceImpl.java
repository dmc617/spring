package cn.bdqn.his.masterdata.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import cn.bdqn.his.masterdata.entity.Checkitem;
import cn.bdqn.his.masterdata.mapper.CheckitemMapper;
import cn.bdqn.his.masterdata.service.CheckitemService;
@Service
public class CheckitemServiceImpl extends ServiceImpl<CheckitemMapper, Checkitem> implements CheckitemService{

    @Autowired
    CheckitemMapper checkitemMapper;

    @Override
    public List<Checkitem> find(Integer status, String name) {
        return checkitemMapper.find(status,name);
    }
}
