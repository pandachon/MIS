package DuckDao;
import BehaviorDao.QuackBehavior;

public class Squeak extends QuackBehavior {
	@Override
	public void quack(){
		System.out.println("吱!");
	}
}
