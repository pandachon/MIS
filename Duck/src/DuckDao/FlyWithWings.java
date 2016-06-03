package DuckDao;

import BehaviorDao.FlyBehavior;

public class FlyWithWings extends FlyBehavior {
	@Override
	public void fly(){
		System.out.println("拍翅膀!");
	}
}
