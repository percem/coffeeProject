package Entity;

import Abstract.IEntity;

public class Customer implements IEntity{
	public int Id;
	public String FirstName;
	public String LastName;
	public String NationalityId;
	public String BirthYear;
	
	
	public Customer(int id, String firstName, String lastName, String nationalityId, String birthYear) {
		super();
		Id = id;
		FirstName = firstName;
		LastName = lastName;
		NationalityId = nationalityId;
		BirthYear = birthYear;
	}


	public int getId() {
		return Id;
	}


	public void setId(int id) {
		Id = id;
	}


	public String getFirstName() {
		return FirstName;
	}


	public void setFirstName(String firstName) {
		FirstName = firstName;
	}


	public String getLastName() {
		return LastName;
	}


	public void setLastName(String lastName) {
		LastName = lastName;
	}


	public String getNationalityId() {
		return NationalityId;
	}


	public void setNationalityId(String nationalityId) {
		NationalityId = nationalityId;
	}


	public String getBirthYear() {
		return BirthYear;
	}


	public void setBirthYear(String birthYear) {
		BirthYear = birthYear;
	}
	
	

}
