package com.Beginner.PracticalonSpring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car implements Vehicle{
	@Autowired
	private Tyre tyre;
	
	public Tyre getTyre() {
		return tyre;
	}

	public void setTyre(Tyre tyre) {
		this.tyre = tyre;
	}

	public void drive()
	{
	
		System.out.println("It has 4 wheels");
		System.out.println("Our Car has "+tyre+ " Tyres");
	}

}
