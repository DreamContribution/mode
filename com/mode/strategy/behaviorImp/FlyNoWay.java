package com.mode.strategy.behaviorImp;

import com.mode.strategy.behavior.FlyBehavior;

public class FlyNoWay implements FlyBehavior{

	@Override
	public void fly() {
		System.out.println("I can't fly");
	}

}
