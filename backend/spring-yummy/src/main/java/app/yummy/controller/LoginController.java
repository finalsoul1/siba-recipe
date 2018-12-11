package app.yummy.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import app.yummy.login.dto.ServerResponseLogin;
import app.yummy.service.LoginService;
import app.yummy.vo.Login;

@CrossOrigin("*")
@RestController
public class LoginController {

	@Autowired
	private LoginService loginService;
	
	@PostMapping("/login")
	public Object postLogin(Login login, HttpSession session) {
		ServerResponseLogin responseLogin = new ServerResponseLogin(login);
		
		loginService.authenticate(login);
		
		if(login.getError() != null) {
			responseLogin.setErrorMessage(login.getError());			
		}
		return responseLogin;
	}
}
