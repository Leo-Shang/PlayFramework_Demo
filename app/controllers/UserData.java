package controllers;

import play.data.validation.Constraints;

/**
 * A form processing DTO that maps to the widget form.
 *
 * Using a class specifically for form binding reduces the chances
 * of a parameter tampering attack and makes code clearer, because
 * you can define constraints against the class.
 */
public class UserData {

    @Constraints.Required
    private String firstName;

    @Constraints.Required
    private String lastName;

    @Constraints.Required
    private String phone;

    public UserData(@Constraints.Required String firstName, @Constraints.Required String lastName, @Constraints.Required String phone, @Constraints.Required String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.password = password;
    }

    @Constraints.Required
    private String password;

    public UserData() {
    }

    // setters and getters

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() { return lastName; }

    public String getPhone() { return phone; }

    public String getPassword() { return password; }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) { this.lastName = lastName; }

    public void setPhone(String phone) { this.phone = phone; }

    public void setPassword(String password) { this.password = password; }

}
