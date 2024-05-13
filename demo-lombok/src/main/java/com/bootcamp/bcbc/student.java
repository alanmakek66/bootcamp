package com.bootcamp.bcbc;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@ToString
public class student {
  @Getter
  private String name;
  @Setter
  private int age;

  public static void main(String[] args) {
    student s1=new student("sam", 20);
    s1.getName();
    s1.setAge(66);
    System.out.println(s1);
  }
  
}
