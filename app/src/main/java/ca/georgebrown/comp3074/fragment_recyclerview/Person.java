package ca.georgebrown.comp3074.fragment_recyclerview;

public class Person {
    String name;
    String hobby;

    public Person(String name, String hobby) {
        this.name = name;
        this.hobby = hobby;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

}
