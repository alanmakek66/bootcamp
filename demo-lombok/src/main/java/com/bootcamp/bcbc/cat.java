package com.bootcamp.bcbc;

public class cat {
  private String name;
  private int age;
  public cat(String name,int age){
    this.name=name;
    this.age=age;
  }
  public String getName(){
    return this.name;
  }
  public int getage(){
    return this.age;
  }
  public static void main(String[] args) {
    cat c1=new cat("sam", 10);
  }
  
}
