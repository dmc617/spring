package cn.bdqn.his.masterdata.controller;


import cn.bdqn.his.common.response.Response;
import cn.bdqn.his.common.response.ResponseEnum;
import cn.bdqn.his.masterdata.service.impl.UserServiceImpl;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * api接口
 * @author Administrator
 *
 */
@Api
@RestController
@RequestMapping("/api/masterdata")
public class UserController {

	@Autowired
	UserServiceImpl userService;

    @GetMapping("/user")
    public Authentication getUser(Authentication user){
        return user;
    }

	@GetMapping("/user2")
	public Authentication getUser2(){
		Authentication user = SecurityContextHolder.getContext().getAuthentication();
    	return user;
	}

    @GetMapping("/users/{id}")
    public Object get(@PathVariable Integer id) {
//    	Map<String, Object> user = new HashMap<String, Object>();
//    	user.put("id", id);
//    	user.put("username", "张三");
//    	user.put("gender", "男");
//    	return new Response(ResponseEnum.SUCCESS).setResponseBody(user);
		return userService.getById(id);
    }
    @GetMapping("/users")
    public Response getUsers() {
//    	Map<String, Object> user1 = new HashMap<String, Object>();
//    	user1.put("id", 1);
//    	user1.put("username", "张三");
//    	user1.put("gender", "男");
//
//    	Map<String, Object> user2 = new HashMap<String, Object>();
//    	user2.put("id", 2);
//    	user2.put("username", "李四");
//    	user2.put("gender", "女");
//
//    	List<Map<String, Object>> users = new ArrayList<Map<String,Object>>();
//    	users.add(user1);
//    	users.add(user2);
//    	return new Response(ResponseEnum.SUCCESS).setResponseBody(users);
		return new Response(ResponseEnum.SUCCESS).setResponseBody(userService.list());
    }
}
