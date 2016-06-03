package model;

import DuckDao.FlyWithWings;
import DuckDao.Quack;

public class MallardDuck extends Duck {
	public MallardDuck(){
		setQuackBehavior(new Quack());	
		setFlyBehavior(new FlyWithWings());		
	}
	@Override
	public void display(){
		System.out.println("I am MallardDuck.");
	}
}
