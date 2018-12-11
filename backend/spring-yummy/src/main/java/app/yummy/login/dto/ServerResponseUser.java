package app.yummy.login.dto;

import app.yummy.vo.User;
import lombok.Data;

@Data
public class ServerResponseUser {
	
	private String status = "Success";
	private String message;
	
	private User user;
	
	private String errorCode;
	private String errorMessage;

	public ServerResponseUser() {
		// Default Constructor
	}

	public ServerResponseUser(User user) {
		this.user = user;
	}

}