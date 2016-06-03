package DuckDao;

import BehaviorDao.QuackBehavior;

public class MuteQuack extends QuackBehavior {
	@Override
	public void quack(){
		System.out.println("MuteQuack!");
	}
}
