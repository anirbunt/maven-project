package com.example;

/**
 * This is a class.
 */
public class Greeter {

  /**
   * This is a constructor.
   */
  public Greeter() {

  }

  /**
   * @return this tag is necessary 
   * @param tag is also necessary
   */ 
  
  public  final String greet( final String someone) {
    return String.format("Hello, %s!", someone);
  }
}
