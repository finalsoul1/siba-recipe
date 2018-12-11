package app.yummy.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import app.yummy.login.dto.ServerResponseUser;
import app.yummy.mapper.UserMapper;
import app.yummy.vo.User;

@CrossOrigin("*")
@RestController
public class UserController {

	@Autowired
	private UserMapper userMapper;
	

	@PostMapping("/register")
	public Object postUser(@RequestBody User user, Model model, HttpSession session) {

		ServerResponseUser responseUser = new ServerResponseUser(user);
		responseUser.setMessage("회원가입 처리");

		try {
			userMapper.insert(user);
		} catch (DuplicateKeyException e) {
			responseUser.setErrorMessage(e.getMessage());
			responseUser.setErrorCode("duplication");
		} catch (Exception e) {
			responseUser.setErrorMessage(e.getMessage());
		}

		return responseUser;
		
	}

}
