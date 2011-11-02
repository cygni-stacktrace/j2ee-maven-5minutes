package cygni.se.ejb.myejbs;

import javax.ejb.EJB;
import javax.ejb.Schedule;
import javax.ejb.Stateless;
import javax.ejb.Timer;

@Stateless
public class MyEjbTimerCallback {
	@EJB
	private MyRemoteSessionBeanRemote myRemoteSessionBeanRemote;
	
    /**
     * Default constructor. 
     */
    public MyEjbTimerCallback() {
    	System.out.println("MyEjbTimerCallback");
    }
	
	@SuppressWarnings("unused")
	@Schedule(second="*/10", minute="*", hour="8-23", dayOfWeek="Mon-Fri", dayOfMonth="*", month="*", year="*", info="MyTimer")
    private void scheduledTimeout(final Timer t) {
		System.out
				.println("@Schedule called at: "
						+ myRemoteSessionBeanRemote.getTime()
						+ ". Time remaning until next call: "
						+ t.getTimeRemaining());
    }
}