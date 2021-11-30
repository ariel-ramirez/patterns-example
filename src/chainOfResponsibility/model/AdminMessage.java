package chainOfResponsibility.model;

public class AdminMessage extends BusinessModel {
	private String loginData;

	public AdminMessage(String loginData) {
		super();
		this.loginData = loginData;
	}

	public String getLoginData() {
		return loginData;
	}

	public void setLoginData(String loginData) {
		this.loginData = loginData;
	}

	@Override
	public String toString() {
		return "AdminMessage [loginData=" + loginData + "]";
	}
	
	
}
