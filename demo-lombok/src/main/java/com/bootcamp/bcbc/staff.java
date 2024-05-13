package com.bootcamp.bcbc;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
@Builder  // builder pattern

public class staff {
  private String name;
  private int age;

  public static void main(String[] args) {
    staff s1=staff.builder()
    .name("sam")
    .age(11)
    .build();

    System.out.println(s1);
    System.out.println(s1.toString());

  }
  
}
