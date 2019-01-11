package io.spring.java.springjpa;

public class UserInfo {
    private int age;
    private String name;
    private String address;
    private String desktopName;
    private String favoriteProgrammingLanguage;
    UserInfo(int age,String name,String address,String desktopName,String favoriteProgrammingLanguage){
        this.age = age;
        this.name = name;
        this.address = address;
        this.desktopName = desktopName;
        this.favoriteProgrammingLanguage = favoriteProgrammingLanguage;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getDesktopName() {
        return desktopName;
    }

    public String getFavoriteProgrammingLanguage() {
        return favoriteProgrammingLanguage;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setDesktopName(String desktopName) {
        this.desktopName = desktopName;
    }

    public void setFavoriteProgrammingLanguage(String favoriteProgrammingLanguage) {
        this.favoriteProgrammingLanguage = favoriteProgrammingLanguage;
    }
}
