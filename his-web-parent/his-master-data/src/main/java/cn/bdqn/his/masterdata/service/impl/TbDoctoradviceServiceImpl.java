package cn.bdqn.his.masterdata.service.impl;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import cn.bdqn.his.masterdata.entity.TbDoctoradvice;
import cn.bdqn.his.masterdata.mapper.TbDoctoradviceMapper;
import cn.bdqn.his.masterdata.service.TbDoctoradviceService;
@Service
public class TbDoctoradviceServiceImpl extends ServiceImpl<TbDoctoradviceMapper, TbDoctoradvice> implements TbDoctoradviceService{

    @Autowired
    TbDoctoradviceMapper doctoradviceMapper;

    @Override
    public List<TbDoctoradvice> getAll() {
        return doctoradviceMapper.selectList(null);
    }
}
