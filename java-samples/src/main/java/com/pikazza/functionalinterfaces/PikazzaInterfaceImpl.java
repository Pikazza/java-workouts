package com.pikazza.functionalinterfaces;

public class PikazzaInterfaceImpl {

  public static void main(String[] args) {
    System.out.println(
        "Testing the functional interfaces against ananymous classes vs Lambda expresions");

    // PikazzaInterface oldway = new PikazzaInterface() {
    // @Override
    // public String getOutput() {
    // System.out.println("Display from old anonymous classes");
    // return "calling is done";
    // }
    // };
    // gettingOutput(oldway);

    gettingOutput(new PikazzaInterface() {
      @Override
      public String getOutput() {
        System.out.println("Display from old anonymous classes");
        return "calling is done";
      }
    });

    // PikazzaInterface newWay = () -> {
    // System.out.println("Display from new Lambda Expression");
    // return "calling is done";
    // };
    // gettingOutput(newWay);

    gettingOutput(() -> {
      System.out.println("Display from new Lambda Expression");
      return "calling is done";
    });
  }

  public static void gettingOutput(PikazzaInterface pikazzaInterface) {
    String returnString = pikazzaInterface.getOutput();
    System.out.println(returnString);
  }
  

}
