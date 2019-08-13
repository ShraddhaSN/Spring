package com.Beginner.PracticalonSpring;

import org.springframework.stereotype.Component;

@Component
public class Bike implements Vehicle{
  public void drive()
  {
	  System.out.println("It has two wheels");
  }
}
