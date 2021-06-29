package basics;

import java.util.Date;

public class PersonOriginal {
	private String empId;
	private String firstName;
	private String lastname;
	private Date dob;
	private String phoneNo;

	public PersonOriginal(String empId, String firstName,
			String lastname, Date dob, String phoneNo) {
		this.empId = empId;
		this.firstName = firstName;
		this.lastname = lastname;
		this.dob = dob;
		this.phoneNo = phoneNo;
	}

	public static class PersonBuilder {
		private String empId;
		private String firstName;
		private String lastname;
		private Date dob;
		private String phoneNo;

		public PersonBuilder withEmpId(String empId) {
			this.empId = empId;
			return this;
		}

		public PersonBuilder withFirstName(String firstName) {
			this.firstName = firstName;
			return this;
		}

		public PersonBuilder withLastName(String lastName) {
			this.lastname = lastName;
			return this;
		}

		public PersonBuilder withDob(Date dob) {
			this.dob = dob;
			return this;
		}

		public PersonBuilder withPhoneNo(String phoneNo) {
			this.phoneNo = phoneNo;
			return this;
		}

		public PersonOriginal build() {
			return new PersonOriginal(empId, firstName, lastname, dob,
					phoneNo);
		}
	}

	@Override
	public String toString() {
		return "Person [empId=" + empId + ", firstName="
				+ firstName + ", lastname=" + lastname + ", dob=" + dob
				+ ", phoneNo=" + phoneNo + "]";
	}
}
