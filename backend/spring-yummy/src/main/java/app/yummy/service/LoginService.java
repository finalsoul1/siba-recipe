package app.yummy.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.yummy.mapper.UserMapper;
import app.yummy.vo.Login;
import app.yummy.vo.User;

@Service
public class LoginService {
	@Autowired
	private UserMapper userMapper;

	public void authenticate(Login login) {
		User user = userMapper.selectByEmail(login.getEmail());
		if (user == null) {
			login.setError("Email does not exist.");
		} else {
			if (!user.getPassword().equals(login.getPassword())) {
				login.setError("Password is not correct.");
			} else {
				login.setError(null);
			}
		}
	}
}
