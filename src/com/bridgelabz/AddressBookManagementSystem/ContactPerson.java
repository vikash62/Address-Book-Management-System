package com.bridgelabz.AddressBookManagementSystem;

public class ContactPerson
{
    private String firstName,lastName, city,state, email ;
    private long phoneNumber,zip;
    ContactPerson(String firstName, String lastName, String email, String city, String state,long phoneNumber, long zip)
    {
        super();
        this.firstName = firstName;
        this.lastName = lastName;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }
    public String getFirstName()
    {
        return firstName;
    }
    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }
    public String getLastName()
    {
        return lastName;
    }
    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }
    public String getCity()
    {
        return city;
    }
    public void setCity(String city)
    {
        this.city = city;
    }
    public String getState()
    {
        return state;
    }
    public void setState(String state)
    {
        this.state = state;
    }
    public String getEmail()
    {
        return email;
    }
    public void setEmail(String email)
    {
        this.email = email;
    }
    public long getPhoneNumber()
    {
        return phoneNumber;
    }
    public void setPhoneNumber(long phoneNumber)
    {
        this.phoneNumber = phoneNumber;
    }
    public long getZip()
    {
        return zip;
    }
    public void setZip(long zip)
    {
        this.zip = zip;
    }

    @Override
    public String toString()
    {
        return "ContactPerson [firstName=" + firstName + ", lastName=" + lastName + ", city=" + city + ", state="
                + state + ", email=" + email + ", phoneNumber=" + phoneNumber + ", zip=" + zip + "]";
    }



}