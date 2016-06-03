package model;
import BehaviorDao.FlyBehavior;
import BehaviorDao.QuackBehavior;

public abstract class Duck {
   QuackBehavior quackBehavior;
   FlyBehavior flyBehavior;
   
   public void performQuack() {
	      quackBehavior.quack();
	   }
	   public void performFly() {
		   flyBehavior.fly();
	   }
	   public void display() {}
	   public void swim(){
			System.out.println("Swim!");
		}
	   public void setQuackBehavior(QuackBehavior behavior) {
		      this.quackBehavior = behavior;
		}
		public void setFlyBehavior(FlyBehavior behavior) {
		      this.flyBehavior = behavior;
		}
}

