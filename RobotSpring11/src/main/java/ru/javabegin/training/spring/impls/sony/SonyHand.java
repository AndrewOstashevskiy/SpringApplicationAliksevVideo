package ru.javabegin.training.spring.impls.sony;

import ru.javabegin.training.spring.interfaces.IHand;


public class SonyHand implements IHand {

	public void catchSomething() {
		System.out.println("Catched from Sony!!");
	}

}
