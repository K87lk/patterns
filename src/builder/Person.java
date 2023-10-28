package builder;

import java.util.Set;

public class Person {
    private String name;
    private String surname;
    private int age;
    private int height;
    private int weight;
    private Set<Person> parents;

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    public Set<Person> getParents() {
        return parents;
    }

    public static class Builder {
        private final Person new_person;

        public Builder() {
            new_person = new Person();
        }
        public Builder withName(String name) {
            new_person.name = name;
            return this;
        }
        public Builder withSurname(String surname){
            new_person.surname = surname;
            return this;
        }

        public Builder withAge(int age){
            new_person.age = age;
            return this;
        }

        public Builder withHeight(int height){
            new_person.height = height;
            return this;
        }

        public Builder withWeight(int weight){
            new_person.weight = weight;
            return this;
        }

        public Builder withParents(Set<Person> parents){
            new_person.parents = parents;
            return this;
        }
        public Person build() {
            return new_person;
        }
    }
}
