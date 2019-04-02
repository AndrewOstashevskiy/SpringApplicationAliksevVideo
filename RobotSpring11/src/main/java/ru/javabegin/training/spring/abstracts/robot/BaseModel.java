package ru.javabegin.training.spring.abstracts.robot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import ru.javabegin.training.spring.interfaces.IHand;
import ru.javabegin.training.spring.interfaces.IHead;
import ru.javabegin.training.spring.interfaces.ILeg;
import ru.javabegin.training.spring.interfaces.Robot;

public abstract class BaseModel implements Robot {

	@Autowired
	@Qualifier("IHand")
	private IHand hand;

	@Autowired
	@Qualifier("ILeg")
	private ILeg leg;

	@Autowired
	@Qualifier("IHead")
	private IHead head;

	public BaseModel() {
		System.out.println(this + " - BaseModel constructor()");
	}

	public BaseModel(IHand hand, ILeg leg, IHead head) {
		this();
		this.hand = hand;
		this.leg = leg;
		this.head = head;
	}

	public IHand getHand() {
		return hand;
	}

	public void setHand(IHand hand) {
		this.hand = hand;
	}

	public ILeg getLeg() {
		return leg;
	}

	public void setLeg(ILeg leg) {
		this.leg = leg;
	}

	public IHead getHead() {
		return head;
	}

	public void setHead(IHead head) {
		this.head = head;
	}

}
