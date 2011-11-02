package cygni.se.ejb.myejbs;
import javax.ejb.Local;

@Local
public interface MyLocalSessionBeanLocal {

	String now();

}
