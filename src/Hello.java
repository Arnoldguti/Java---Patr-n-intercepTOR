import javax.faces.bean.*;
import Core.Constants;

@ManagedBean(name = "hello")
@RequestScoped

public class Hello implements Constants {
	@ManagedProperty(value = "#{mensaje}")
	private Mensaje messageBean;

	public void setMessageBean(Mensaje messageBean) {
		this.messageBean = messageBean;
	}

	private String name = ETIQUETA1;
	private String userNumber = "Encendido";

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// For label state

	public void setUserNumber(String user_number) {
		userNumber = user_number;
	}

	public String getUserNumber() {
		return userNumber;
	}

	public String getSayWelcome() {
		// check if null?
		if ("".equals(name) || name == null) {
			return "nadie	";
		} else {
			return messageBean.getSayWelcome() + name;
		}
	}

}
