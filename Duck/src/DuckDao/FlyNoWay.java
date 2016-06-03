package DuckDao;

import BehaviorDao.FlyBehavior;

public class FlyNoWay extends FlyBehavior {
	@Override
	public void fly(){
		System.out.println("Can not fly!");
	}
}
