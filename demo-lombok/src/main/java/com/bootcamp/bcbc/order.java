package com.bootcamp.bcbc;

import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString

public class order {
  private String orderID;

  public static void main(String[] args) {
    order oo=new order("sam");
    order ooo= new order("sam");
    System.out.println(oo.equals(ooo));
  }
  
}
