package com.example.myusercontrollers.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;


@AllArgsConstructor @Data
public class Empolyees {
   @NotNull(message = "ID can't be null")
   @Size (min=3 , max=10, message = "ID can't be less than 3 or more than 10")
   private int ID;
   @NotNull(message = "Name should not be null")
   @Size(min=5 , max=20, message = "letters should not be less than 4 and not more than 20 ")
   private String name;
   @NotNull(message = "Age should be older than 25")
   @Past
   private int age;

   private String onLeave;
   @NotNull(message = "It must to be number")
   private int employmentYear;
   @NotNull(message = "It must to be number")
   private int annualLeave;


}
