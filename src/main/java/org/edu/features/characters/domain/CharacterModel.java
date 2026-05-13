package org.edu.features.characters.domain;

public class CharacterModel {
    private String id;
    private String name;
    private int age;
    private String power;
    private String planet;

    public CharacterModel(String id, String name, int age, String power, String planet) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.power = power;
        this.planet = planet;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    public String getPlanet() {
        return planet;
    }

    public void setPlanet(String planet) {
        this.planet = planet;
    }
}
