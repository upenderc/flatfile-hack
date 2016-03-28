package com.flatfile.domain;

public final class PersonBuilder {

   
   private  String firstName;
   private  String lastName;
   private  String middleName;
   
   private PersonBuilder() {}
   public static PersonBuilder newBuilder() {
      return new PersonBuilder();
   }
   
   public PersonBuilder firstName(String fn) {
      this.firstName=fn;
      return this;
   }
   public PersonBuilder lastName(String ln) {
      this.lastName=ln;
      return this;
   }
   public PersonBuilder middleName(String mn) {
      this.middleName=mn;
      return this;
   }
   public Person build() {
      return new Person(firstName,lastName,middleName);
   }
}
