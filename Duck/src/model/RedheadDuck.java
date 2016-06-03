package model;

import DuckDao.FlyWithRocket;
import DuckDao.Squeak;

public class RedheadDuck extends Duck {
	public RedheadDuck(){
		setQuackBehavior(new Squeak());	
		setFlyBehavior(new FlyWithRocket());		
	}
	@Override
	public void display(){
		System.out.println("I am RedheadDuck.");
	}
}
