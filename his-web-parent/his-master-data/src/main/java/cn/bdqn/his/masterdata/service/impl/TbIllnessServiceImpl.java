package cn.bdqn.his.masterdata.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import cn.bdqn.his.masterdata.mapper.TbIllnessMapper;
import cn.bdqn.his.masterdata.entity.TbIllness;
import cn.bdqn.his.masterdata.service.TbIllnessService;
@Service
public class TbIllnessServiceImpl extends ServiceImpl<TbIllnessMapper, TbIllness> implements TbIllnessService{

    @Autowired
    TbIllnessMapper illnessMapper;

    @Override
    public List<TbIllness> getAll() {
        return illnessMapper.selectList(null);
    }
}
