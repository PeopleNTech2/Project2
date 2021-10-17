package database;

public class User {
    String name;
    String location;
    int age;

    public User(String name, int age, String location) {
        this.age = age;
        this.name = name;
        this.location = location;
    }

    public User() {

    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
