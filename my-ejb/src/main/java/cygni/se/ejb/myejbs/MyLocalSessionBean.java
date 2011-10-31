package cygni.se.ejb.myejbs;

import java.util.Calendar;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

/**
 * Session Bean implementation class MyLocalSessionBean
 */
@Stateless
@LocalBean
public class MyLocalSessionBean implements MyLocalSessionBeanLocal {

    /**
     * Default constructor. 
     */
    public MyLocalSessionBean() {
    }

	@Override
	public String wicked() {
		return Calendar.getInstance().getTime().toString();
	}

}
