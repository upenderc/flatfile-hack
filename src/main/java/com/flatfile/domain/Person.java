package com.flatfile.domain;

public class Person {

   private final String firstName;
   private final String lastName;
   private final String middleName;
   
   public Person(String fn,String ln,String mn){
      this.firstName=fn;
      this.lastName=ln;
      this.middleName=mn;
   }
   public String getFirstName() {
      return firstName;
   }
   
   public String getLastName() {
      return lastName;
   }
  
   public String getMiddleName() {
      return middleName;
   }
   
   public String toString() {
      return firstName+"&amp;#9;"+lastName+"&amp;#9;"+middleName;
   }
   
   
}
