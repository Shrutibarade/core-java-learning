package org.dnyanyog;

public class SchoolMain {

    public static void main(String[] args) {
        Student student = new Student();

        
        student.setFirstName("Vaibhav");
        student.setLastName("Zodge");
        student.setEmail("zodgev@gmail.com");
        student.setMobile("989898");

        
        Address address = student.getAddress(); 
        address.setStreet1("Keshnand Road");
        address.setStreet2("Near PMT Stop");
        address.setCity("Wagholi");
        address.setState("Maharashtra");
        address.setCountry("India");

      
        System.out.println(student);
    }
}
