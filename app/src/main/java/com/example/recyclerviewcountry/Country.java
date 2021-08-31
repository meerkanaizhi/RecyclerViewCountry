package com.example.recyclerviewcountry;


public class Country {

    private String country;
    private String capital;
    private int flag;

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public int getFlag() {
        return flag;
    }

    public void setFlag(int flag) {
        this.flag = flag;
    }

    public Country(String country, String capital, int flag) {
        this.country = country;
        this.capital = capital;
        this.flag = flag;
    }
}