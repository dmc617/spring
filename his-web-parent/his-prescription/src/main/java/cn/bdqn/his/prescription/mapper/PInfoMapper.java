package cn.bdqn.his.prescription.mapper;

import cn.bdqn.his.prescription.entity.PInfo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PInfoMapper extends BaseMapper<PInfo> {

    List<PInfo> selectByCode(String code);
}