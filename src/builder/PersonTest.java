package builder;

public class PersonTest {
    public static void main(String[] args) {
        Person person = new Person.Builder()
                .withWeight(65)
                .withAge(23)
                .withName("Alex")
                .withSurname("Skolnik")
                .build();
    }
}
