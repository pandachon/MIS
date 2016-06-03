package model;

import DuckDao.MuteQuack;
import DuckDao.FlyNoWay;

public class RubberDuck extends Duck {
		public RubberDuck(){
			setQuackBehavior(new MuteQuack());	
			setFlyBehavior(new FlyNoWay());		
		}
		@Override
		public void display(){
			System.out.println("I am RubberDuck.");
		}
}
