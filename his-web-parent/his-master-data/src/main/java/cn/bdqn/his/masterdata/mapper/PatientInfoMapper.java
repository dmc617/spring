package cn.bdqn.his.masterdata.mapper;

import cn.bdqn.his.masterdata.entity.PatientInfo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PatientInfoMapper extends BaseMapper<PatientInfo> {

    List<PatientInfo> findByName(String name);
}