package com.XTi.Projects;

public abstract class Employee implements Payable {
    private String Firstname;
    private String Lastname;
    private String SocialSecurityNum;

    public Employee(String firstname, String lastname, String socialsecuritynum) {
        this.Firstname = firstname;
        this.Lastname = lastname;
        this.SocialSecurityNum = socialsecuritynum;
    }

    public String getFirstname() {
        return this.Firstname;
    }

    public String getLastname() {
        return this.Lastname;
    }

    public String getSocialSecurityNum() {
        return this.SocialSecurityNum;
    }

    public String toString() {
        return String.format("%s %s%nSocial Security Number: %s", this.getFirstname(), this.getLastname(), this.getSocialSecurityNum());
    }

    public abstract double earnings();
}