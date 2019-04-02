package ru.javabegin.training.spring.impls.toshiba;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import ru.javabegin.training.spring.interfaces.IHand;

@Component
@Qualifier("IHand")
public class ToshibaHand implements IHand {

	@Override
	public void catchSomething(){
		System.out.println("Catched from Toshiba!");
	}

}
