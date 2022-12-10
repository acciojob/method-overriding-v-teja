package com.driver;

public class Main {
    static class A{
        static String meth(){
            return "Invoking method from class A";
        }
    }

    static class B extends A{
        static String meth() {
            return "Method is overridden in Extendend class B";
        }
    }
  public static void main(String[] args){
        B temp = new B();
      System.out.println(B.meth());
  }
}