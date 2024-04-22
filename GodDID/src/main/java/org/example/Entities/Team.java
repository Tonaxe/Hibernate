package org.example.Entities;

public class Team {
    private int code;
    private String name;
    private String stadium;
    private String city;

    public Team(int code, String name, String stadium, String city) {
        this.code = code;
        this.name = name;
        this.stadium = stadium;
        this.city = city;
    }

    public Team() {
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStadium() {
        return stadium;
    }

    public void setStadium(String stadium) {
        this.stadium = stadium;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Team [code=" + code + ", name=" + name + ", stadium=" + stadium + ", city=" + city + "]";
    }
}

