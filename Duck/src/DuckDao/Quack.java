package DuckDao;

import BehaviorDao.QuackBehavior;

public class Quack extends QuackBehavior {
	@Override
	public void quack(){
		System.out.println("呱!");
	}
}
