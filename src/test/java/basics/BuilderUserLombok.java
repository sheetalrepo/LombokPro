package basics;

import lombok.Builder;
import lombok.ToString;

/**
 * This example will cover builder pattern
 * For Example: To open any bank account FN and LN is mandatory and other fields are optional
 * 
 * @author Sheetal_Singh
 */

@Builder
@ToString
public class BuilderUserLombok {
	private final String firstName; // mandatory field
	private final String lastName; // mandatory
	private final int age; // optional
	private final String phone; // optional
	private final String address; // optional
}
