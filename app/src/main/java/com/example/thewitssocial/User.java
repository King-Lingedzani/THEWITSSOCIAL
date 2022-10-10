package com.example.thewitssocial;

import com.google.firebase.database.PropertyName;

public class User {



    public String Name,Surname,Email,PhoneNo,Password;

    public User(){

    }
    public User(String Name,String Surname,String Email,String Password,String PhoneNo){
        this.Name = Name;
        this.Surname = Surname;
        this.Email =Email;
        this.Password = Password;
        this.PhoneNo = PhoneNo;
    }

    public boolean isNameEmpty(String a){
        if(a.isEmpty()){
            return false;
        }else {
            return true;
        }
    }

    public boolean isEmailEmpty(String a){
        if(a.isEmpty()){
            return false;
        }else {
            return true;
        }
    }

    public boolean isPasswordEmpty(String a){
        if(a.isEmpty()){
            return false;
        }else {
            return true;
        }
    }

    public boolean isPhoneEmpty(String a){
        if(a.isEmpty()){
            return false;
        }else {
            return true;
        }
    }
    public boolean isSurnameEmpty(String a){
        if(a.isEmpty()){
            return false;
        }else {
            return true;
        }
    }



    @PropertyName("Name")
    public String getName() {
        return Name;
    }
    @PropertyName("Surname")
    public String getSurname() {
        return Surname;
    }
}
