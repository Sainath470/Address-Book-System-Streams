package com.AddressBookPackage;
import java.util.Objects;
public class Person {
        private String firstName;
        private String lastName;
        private String address;
        private String city;
        private String state;
        private String phoneNumber;
        private String emailId;
        private int zipCode;


        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {

            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public int getZipCode() {
            return zipCode;
        }

        public void setZipCode(int zipCode) {
            this.zipCode = zipCode;
        }

        public String getEmailId() {
            return emailId;
        }

        public void setEmailId(String emailId) {
            this.emailId = emailId;
        }

        public String getPhoneNumber() {
            return phoneNumber;
        }

        public void setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
        }

        public String getState() {
            return state;
        }

        public void setState(String state) {
            this.state = state;
        }

        @Override
        public String toString() {
            return "com.AddressBookPackage.Person{" +
                    "firstName='" + firstName + '\'' +
                    ", lastName='" + lastName + '\'' +
                    ", address='" + address + '\'' +
                    ", city='" + city + '\'' +
                    ", state='" + state + '\'' +
                    ", zip=" + zipCode +
                    ", email='" + emailId + '\'' +
                    ", phoneNumber='" + phoneNumber + '\'' +
                    '}';

        }

    

    @Override
    public boolean equals(Object o){
        if(this==o){
            return true;
        }
        if(o==null || getClass() != o.getClass()){
            return false;
        }
        Person person =(Person) o;
        return Objects.equals(firstName, person.firstName)
                && Objects.equals(lastName, person.lastName);
    }
    @Override
    public int hashCode(){
        return Objects.hash(firstName, lastName);
    }

}
