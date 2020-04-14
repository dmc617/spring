package cn.bdqn.his.masterdata.mapper;

import cn.bdqn.his.masterdata.entity.Checkitem;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
@Mapper
public interface CheckitemMapper extends BaseMapper<Checkitem> {

    List<Checkitem> find(@Param("status") Integer status, @Param("name")String name);
}