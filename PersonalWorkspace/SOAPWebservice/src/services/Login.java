package services;

import java.net.URL;
import java.util.Calendar;

import com.trapedza.bankfusion.webservices.security.ApplicationID;
import com.trapedza.bankfusion.webservices.security.LoginResponseType;
import com.trapedza.bankfusion.webservices.security.LoginSerivce;
import com.trapedza.bankfusion.webservices.security.LoginService;
import com.trapedza.bankfusion.webservices.security.OSUserID;
import com.trapedza.bankfusion.webservices.security.PassCode;
import com.trapedza.bankfusion.webservices.security.Password;
import com.trapedza.bankfusion.webservices.security.Request;
import com.trapedza.bankfusion.webservices.security.UserName;

import common.utils.UnmarshallHelper;

public class Login {
	private URL url;
	private UnmarshallHelper unmarshallHelper = new UnmarshallHelper();

	public Login(URL url) {
		this.url = url;
	}

	public LoginResponseType invoke(String user, String pwd) {
		/*JAXBContext jaxbContext = JAXBContext.newInstance(LoginSerivce.class);
		Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
		File loginRequest = new File("Login.xml");
		jaxbUnmarshaller.unmarshal(loginRequest);*/
		long startTime = Calendar.getInstance().getTimeInMillis();
		LoginService loginService = new LoginService(url);
		LoginSerivce ls = loginService.getLoginPort();
		UserName userName = new UserName();
		userName.setValue(user);
		Password password = new Password();
		password.setValue(pwd);
		PassCode passCode = new PassCode();
		passCode.setValue("");
		OSUserID oSUserID = new OSUserID();
		oSUserID.setValue("");
		ApplicationID applicationID = new ApplicationID();
		applicationID.setValue("");
		Request request = new Request();
		LoginResponseType response = ls.login(password, userName, passCode, oSUserID, applicationID, request);
		long endTime = Calendar.getInstance().getTimeInMillis();
		return response;
	}
}
