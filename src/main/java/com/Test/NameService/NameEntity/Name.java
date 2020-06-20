package com.Test.NameService.NameEntity;


import org.springframework.stereotype.Service;

@Service
public class Name {

    private String name;
    private String surname;

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




    @Override
    public String toString() {
        return name+" "+surname;

    }

}
