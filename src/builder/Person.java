package builder;

public class Person {
	private String name;
	private String surname;
	private Long identificationNumber;

	public Person() {}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public Long getIdentificationNumber() {
		return identificationNumber;
	}

	public void setIdentificationNumber(Long identificationNumber) {
		this.identificationNumber = identificationNumber;
	};
	
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", surname=" + surname + ", identificationNumber=" + identificationNumber + "]";
	}


	public static class Builder {
		private Person person;
		
		public Builder() {
			person = new Person();
		}
		
		public Builder withName(String name) {
			person.setName(name);
			return this;
		}
		
		public Builder withSurname(String surname) {
			person.setSurname(surname);
			return this;
		}
		
		public Builder withIdentificationNumber(Long identificacion) {
			person.setIdentificationNumber(identificacion);
			return this;
		}
		
		public Person build() {
			return person;
		}
	}

	
}
