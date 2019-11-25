package guru.ruc.domain.modelproject;

import java.util.List;
import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class UserDTO {

	@JsonIgnore
	private List<CompanyDTO> company;

	private UUID id;

	private String userName;

	private PersonDTO person;

	public List<CompanyDTO> getCompany() {
		return company;
	}

	public void setCompany(List<CompanyDTO> company) {
		this.company = company;
	}

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public PersonDTO getPerson() {
		return person;
	}

	public void setPerson(PersonDTO person) {
		this.person = person;
	}

}
