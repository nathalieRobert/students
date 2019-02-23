package fr.formation.students.dtos;

import java.time.LocalDate;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class UserDto {

	@NotBlank
	private String firstname;

	@NotBlank
	private String lastname;

	@NotNull
	private LocalDate birthdate;

	@NotNull
	private boolean active;

	public UserDto() {
		// TODO Auto-generated constructor stub
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public LocalDate getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(LocalDate birthdate) {
		this.birthdate = birthdate;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	@Override
	public String toString() {
	    return "UserDto [firstname=" + firstname + ", lastname=" + lastname
		    + ", birthdate=" + birthdate + ", active=" + active + "]";
	}
	
	

}
