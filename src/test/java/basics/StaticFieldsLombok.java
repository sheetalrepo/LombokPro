package basics;

import lombok.Value;



/**
 * Static 
 * 1. static fields are related to class and not to object
 * 2. Lombok will completely ignore static fields in generating 
 *    setters, constructor and in equals method etc
 * 
 * java -jar lombok-1.18.16.jar delombok -p StaticFieldsLombok.java
 * 
 * @author Sheetal_Singh
 *
 */
@Value
public class StaticFieldsLombok {
	String name;
    static int counter;
}
