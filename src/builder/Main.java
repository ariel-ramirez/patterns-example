package builder;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person persona1 = new Person.Builder()
				.withName("Emanuel")
				.withSurname("Zapata")
				.withIdentificationNumber(35999888L)
				.build();
		
		System.out.println(persona1.toString());
	}

}
