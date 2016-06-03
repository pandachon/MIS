package DuckDao;

import BehaviorDao.FlyBehavior;

public class FlyWithRocket extends FlyBehavior {
	@Override
	public void fly(){
		System.out.println("喷射!");
	}
}
