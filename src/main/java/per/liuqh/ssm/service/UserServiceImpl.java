package per.liuqh.ssm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import per.liuqh.ssm.dao.UserMapper;
import per.liuqh.ssm.entity.User;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserMapper userMapper;
	@Override
	public User selectByPrimaryKey(Integer id) {
		return null;
	}
	
}
