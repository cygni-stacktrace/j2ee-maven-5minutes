package cygni.se.ejb.myejbs;
import javax.ejb.Remote;

@Remote
public interface MyRemoteSessionBeanRemote {
	String getTime();
}
