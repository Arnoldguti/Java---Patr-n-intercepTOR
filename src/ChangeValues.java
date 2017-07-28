import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import Core.Constants;



@ManagedBean(name = "changeValues", eager=true)
@SessionScoped
public class ChangeValues implements Serializable, Constants {

	private static final long serialVersionUID = 1L;
	
	
	
	private String button1 = BUTTON_CONTENT_1;
	private String Button2 = BUTTON_CONTENT_3;
	private String label   = ETIQUETA1; 
	private String speedUpButton = SPEEDUPDISABLED;
	
	private String colorText = COLOR_1;

	
	
	public ChangeValues() {	
		label = ETIQUETA1;
		button1 = BUTTON_CONTENT_1;
		Button2 = BUTTON_CONTENT_3;
		colorText = COLOR_1;
		speedUpButton = SPEEDUPENABLED;
	}
	

	
	
	public void speedUp(){				
		label= ONFORSPEED;
		System.out.println("Acelerando motor");		
	}
	
	public void startStop(){				
	
	if (colorText.equals(COLOR_1)){
		label= ETIQUETA2;
		colorText = COLOR_2;
		button1 = BUTTON_CONTENT_2;
		speedUpButton = SPEEDUPDISABLED;
		System.out.println("Encendiendo Motor");
	
	}else{
		label= ETIQUETA1;
		colorText = COLOR_1;
		button1 = BUTTON_CONTENT_1;
		speedUpButton = SPEEDUPENABLED;
		System.out.println("Apagando Motor");
	}
	}
	

	public String getColorText(){
		return colorText;
	}
	public void setColorText(String colorTextV){
		this.colorText = colorTextV;
	}
	
	
    public String getButton1 ( )
    {
        return button1;
    }

    public void setButton1 (String buttonName)
    {
    	button1 = buttonName;           
    }
	
	

    public String getButton2 ( )
    {
        return Button2;
    }

    public void setButton2 (String buttonName)
    {
    	Button2 = buttonName;           
    }
    
    
    public String getLabel ( )
    {
        return label;
    }

    public void setLabel (String labelName)
    {
    	label = labelName;           
    }
	
    public String getSpeedUpButton ( )
    {
        return speedUpButton;
    }

    public void setSpeedUpbUTTON (String speedUpData)
    {
    	speedUpButton = speedUpData;           
    }
	

	

	
	
}
