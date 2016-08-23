package per.liuqh.ssm.service;

import org.springframework.stereotype.Service;

import per.liuqh.ssm.entity.User;

@Service
public class UserServiceImpl implements UserService{
	
	@Override
	public User selectByPrimaryKey(Integer id) {
		return null;
	}
	
}
