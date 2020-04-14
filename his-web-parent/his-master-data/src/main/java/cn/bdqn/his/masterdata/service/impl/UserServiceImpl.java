package cn.bdqn.his.masterdata.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import cn.bdqn.his.masterdata.mapper.UserMapper;
import cn.bdqn.his.masterdata.entity.User;
import cn.bdqn.his.masterdata.service.UserService;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}

