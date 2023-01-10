package com.bootcoding.match.model;

import org.springframework.stereotype.Component;

@Component
public class Player
{
    private String Name;
    private String type;
    private String CountryName;


    public String getCountryName() {
        return CountryName;
    }

    public void setCountryName(String countryName) {
        CountryName = countryName;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
