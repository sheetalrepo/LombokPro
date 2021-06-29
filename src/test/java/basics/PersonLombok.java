package basics;

import java.util.Date;
import lombok.Builder;
import lombok.ToString;

/**
 * This example will cover builder pattern 
 * 
 * @Builder : 
 * This will generate all arg constructor
 * Other builder related code
 * 
 * @author Sheetal_Singh
 */

@Builder
@ToString
public class PersonLombok {
	private String empId;
	private String firstName;
	private String lastname;
	private Date dob;
	private String phoneNo;
}
