package springmvc.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springmvc.dao.UserDao;
import springmvc.dao.UserDaoImpl;
import springmvc.model.User;

@Service
public class UserServices {
	@Autowired
	private UserDao userDaoImpl;
	
	public int createUser(User user) {
		return this.userDaoImpl.saveUser(user);
	}

	public UserDao getUserDaoImpl() {
		return userDaoImpl;
	}

	public void setUserDaoImpl(UserDaoImpl userDaoImpl) {
		this.userDaoImpl = userDaoImpl;
	}
	
	
}
