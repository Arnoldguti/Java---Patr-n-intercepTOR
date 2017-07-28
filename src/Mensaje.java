import javax.faces.bean.*;

import Core.Constants;


@ManagedBean(name = "mensaje")
@RequestScoped
public class Mensaje implements Constants {
	
	private String sayWelcome = "JSF Car";

	public String getSayWelcome() {
		return sayWelcome;
	}
		
	public void setSayWelcome(String sayWelcome) {
		this.sayWelcome = sayWelcome;
	}
	
	
	private String Button1 = BUTTON_CONTENT_1;
	  

	    public String getButton1 ( )
	    {
	        return Button1;
	    }

	    public void setButton1 (String buttonName)
	    {
	    	Button1 = buttonName;           
	    }
	
	
		private String Button3 = BUTTON_CONTENT_3;
		  

	    public String getButton3 ( )
	    {
	        return Button3;
	    }

	    public void setButton3 (String buttonName)
	    {
	    	Button3 = buttonName;           
	    }
	
	
	
}
