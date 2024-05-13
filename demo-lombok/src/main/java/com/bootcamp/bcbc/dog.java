package com.bootcamp.bcbc;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
// annotation
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
//custom constructor can't use all/no arg.....

public class dog {
  private String name;
  private int age;

  public static void main(String[] args) {
    dog d1 =new dog("ken", 20);
    d1.getAge();
    d1.getName();
    System.out.println(d1.getName());
    staff s1=new staff("ken", 1);
    staff s2 =new staff("ken", 1);
    System.out.println(s1.canEqual(s2));
    staff s3=new staff();
    staff s4=new staff();
    System.out.println(s3.canEqual(s4));
   System.out.println(s3.equals(s4));
   staff s5=new staff("tom", 2);
   System.out.println(s5.equals(s4));
   System.out.println(s5.canEqual(s4));
   System.out.println(s5.canEqual(d1));
   System.out.println(s5.canEqual(d1));
   System.out.println(s5);
   System.out.println(s5.hashCode());
   System.out.println(s1.hashCode());
   System.out.println(s2.hashCode());
   System.out.println(s4.hashCode());
   System.out.println(s3.hashCode());
   
    


  }
  
}
