package ru.javabegin.training.spring.impls.toshiba;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import ru.javabegin.training.spring.interfaces.IHead;

@Component
@Qualifier("IHead")
public class ToshibaHead implements IHead {
	
	public void calc(){
		System.out.println("Thinking about Toshiba...");
	}

}
