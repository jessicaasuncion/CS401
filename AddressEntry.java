package com.company;

public class AddressEntry {
    private String firstName;
    private String lastName;
    private String street;
    private String city;
    private String state;
    private String zip;
    private String phone;
    private String email;

    /* default constructor for AddressEntry */
    public AddressEntry(){

    }
    /** Constructor for AddressEntry
     * accepts firstName, lastName, street, city, state, zip, phone, email
     */
    public AddressEntry(String firstName, String lastName, String street,
                        String city, String state, String zip, String phone, String email){
        this.firstName = firstName;
        this.lastName = lastName;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phone = phone;
        this.email = email;
    }
    /**
     * takes all data elements and composes nicely formatted string
     * prints to console
     */
    public String toString(){
        return "First Name: " + firstName + "Last Name: " + lastName + "Street: " + street + "City: " + city +
                "State: " + state + "Zip: " + zip + "Phone: " + phone + "Email: " + email;
    }
    /* set input of first name as firstName variable */
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    /* get lastName from input */
    public String getLastName(){
        return lastName;
    }
    /* get firstName from input */
    public String getFirstName(){
        return firstName;
    }
    /* set input of last name as lastName variable */
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    /*set input of city as city variable */
    public void setCity(String city){
        this.city = city;
    }
    /* get city from input */
    public String getCity(){
        return city;
    }
    /* set input of state as state variable */
    public void setState(String state){
        this.state = state;
    }
    /* get state from input */
    public String getState()
    {
        return state;
    }
    /* set input of street as street variable */
    public void setStreet(String street){
        this.street = street;
    }
    /* get street from input */
    public String getStreet(){
        return street;
    }
    /* set input of zip as street zip*/
    public void setZip(String zip){
        this.zip = zip;
    }
    /* get zip from input */
    public String getZip(){
        return zip;
    }
    /* set input of phone as street phone */
    public void setPhone(String phone){
        this.phone = phone;
    }
    /* get phone from input */
    public String getPhone(){
        return phone;
    }
    /* set input of email as street email */
    public void setEmail(String email){
        this.email = email;
    }
    /* get email from input */
    public String getEmail(){
        return email;
    }
}
