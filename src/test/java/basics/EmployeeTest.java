package basics;

import org.apache.log4j.Logger;
import lombok.extern.java.Log;

@Log
public class EmployeeTest {

	/**
	 * Logger initialized manually in normal case
	 */
	private static final Logger logger = Logger.getLogger(EmployeeTest.class);
	public static void normalMethod() {
		EmployeeOriginal obj = new EmployeeOriginal(20, "Albert", "Alpha");
		System.out.println(obj);
		logger.info(obj);
	}
	
	
	
	/**
	 * Calling Arg Constructor, setter, getters
	 * automatic logging via @Log annotation on top of the class
	 */
	public static void withLombokMethod() {
		EmployeeLombok obj = new EmployeeLombok(10, "Bob", "Bryan");
		log.info(">>>>>>>>> Lombok loggin: "+obj.toString());
		
		obj.setId(11);
		log.info(obj.toString());		
	}
	
	public static void main(String[] args) {
		normalMethod();
		withLombokMethod();
	}

}
