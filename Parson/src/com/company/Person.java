package com.company;

public class Person
{
    // fields
    private String firstName;
    private String lastName;
    private int age;

    // set the value of the firstName field
    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    // set the value of the lastName field
    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    // set the value of the age
    public void setAge(int age)
    {
        if((age < 0) || (age > 100))
        {
            age = 0;
        }
        this.age = age;
    }

    // return true if the value of age field is greatest than 12 and less than 20
    public boolean isTeen()
    {
        if((this.age > 12) && (this.age < 20))
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    // return the value of the firstName field
    public String getFirstName()
    {
        return this.firstName;
    }

    // return the value of the lastName field
    public String getLastName()
    {
        return this.lastName;
    }

    // return the value of the age field
    public int getAge()
    {
        return this.age;
    }

    // return the full name of the person
    public String getFullName()
    {
        if(this.firstName.isEmpty() && this.lastName.isEmpty())
        {
            return this.firstName;
        }

        if(this.lastName.isEmpty())
        {
            return this.firstName;
        }

        if(this.firstName.isEmpty())
        {
            return this.lastName;
        }
        return this.firstName + " " + this.lastName;
    }
}
