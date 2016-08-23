package per.liuqh.dao;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import per.liuqh.common.TestBaseCase;
import per.liuqh.ssm.dao.UserMapper;
import per.liuqh.ssm.entity.User;
import per.liuqh.ssm.entity.UserExample;

public class UserDaoTest extends TestBaseCase{
	
	@Autowired
	private UserMapper userMapper;
	
	@Test
	public void test1(){
		User u=userMapper.selectByPrimaryKey(1);
		System.out.println(u);
		
		System.out.println(userMapper.countByExample(new UserExample()));
	}
}
