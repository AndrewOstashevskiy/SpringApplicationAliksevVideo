package ru.javabegin.training.spring.impls.toshiba;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import ru.javabegin.training.spring.interfaces.ILeg;

@Component
@Qualifier("ILeg")
public class ToshibaLeg implements ILeg {
	
	public void go(){
		System.out.println("Go to Toshiba!");
	}

}
