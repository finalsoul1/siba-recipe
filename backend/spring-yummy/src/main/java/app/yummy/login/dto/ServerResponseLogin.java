package app.yummy.login.dto;

import app.yummy.vo.Login;
import lombok.Data;

@Data
public class ServerResponseLogin {
	
	private String status = "Success";
	private String message;
	
	private Login login;
	
	private String errorCode;
	private String errorMessage;

	public ServerResponseLogin() {
		// Default Constructor
	}

	public ServerResponseLogin(Login login) {
		this.login = login;
	}

}