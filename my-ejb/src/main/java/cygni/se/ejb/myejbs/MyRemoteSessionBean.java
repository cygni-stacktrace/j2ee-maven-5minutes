package cygni.se.ejb.myejbs;

import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;

/**
 * Session Bean implementation class MyRemoteSessionBean
 */
@Stateless
@LocalBean
public class MyRemoteSessionBean implements MyRemoteSessionBeanRemote {
	@EJB
	private MyLocalSessionBeanLocal myLocalSessionBeanLocal;
	
    /**
     * Default constructor. 
     */
    public MyRemoteSessionBean() {
    	System.out.println("MyRemoteSessionBean");
    }

	@Override
	public String test() {
    	return myLocalSessionBeanLocal.wicked();
	}

}
