package com.bl.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;

public class Rocket implements BeanFactoryAware {
	private int threshold;
	private int level;
	private double distance;

	public Rocket(int threshold) {
		System.out.println("Rocket(threshold)");
		this.threshold = threshold;
	}

	public void setLevel(int level) {
		System.out.println("setLevel(level)");
		this.level = level;
	}

	@Override
	public void setBeanFactory(BeanFactory factory) throws BeansException {
		System.out.println("setBeanFactory()");
	}
	
	public void prepare() {
		System.out.println("prepare()");
		distance = threshold * level;
	}
	
	public void release() {
		System.out.println("release()");
	}

	@Override
	public String toString() {
		return "Rocket [threshold=" + threshold + ", level=" + level
				+ ", distance=" + distance + "]";
	}
	
	public void checkConcept() {
		throw new RuntimeException();
	}
	

}
