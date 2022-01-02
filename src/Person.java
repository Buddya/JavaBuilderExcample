import java.util.Objects;

public class Person {
    protected final String name;
    protected final String surname;
    protected Integer age; //if age = 0 newborn child?
    protected String address;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public Person(String name, String surname, int age, String address) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.address = address;
    }

    public boolean hasAge() {
        return age != null;
    }

    public boolean hasAddress() {
        return address != null;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void happyBirthday() {
        if (hasAge()) {
            age++;
        }
    }

    public PersonBuilder newChildBuilder() {
        return new PersonBuilder()
                .setName(name)
                .setSurname(surname)
                .setAddress(address)
                .setAge(0);
    }

    @Override
    public String toString() {
        return surname + " " + name;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, age, address);
    }
}
