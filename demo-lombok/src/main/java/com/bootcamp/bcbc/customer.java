package com.bootcamp.bcbc;

import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@EqualsAndHashCode
@ToString

public class customer {
  private String name;
  private List<order> orders;   /* = new ArrayList<>(); */

  public customer(String name){
    this.name=name;
    this.orders=new ArrayList<>();
  }
  public void add(order o1){
    orders.add(o1);
  }
  public boolean isVip(){
    return this.getOrders().size()>=10;
  }

  public static void main(String[] args) {
    customer c1=new customer("tom");
    customer c2=new customer("tom");

    //order o1=new order("ss");
    
    c1.add(new order("aa"));
    c2.add(new order("aa"));

    System.out.println(c1.equals(c2));
    System.out.println(customer.isVip2(c1));

   // System.out.println(c1.equals(c2));
    

  }

  public static boolean isVip2(customer c1){
    return c1.getOrders().size()>=10;
  }
  
}
