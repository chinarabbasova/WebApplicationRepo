package model;

public class PersonModel {
    private int id;
    private String name;
    private String surname;
    private String date;

    public PersonModel(int id, String name, String surname, String date) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.date = date;
    }
    public PersonModel(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
