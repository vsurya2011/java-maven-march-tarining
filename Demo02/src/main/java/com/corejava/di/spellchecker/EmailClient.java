package com.corejava.di.spellchecker;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component
public class EmailClient /*implements InitializingBean, DisposableBean */{
	private SpellChecker spellChecker;

	public EmailClient(){
          System.out.println("no args constructor");
	}

	public EmailClient(SpellChecker spellChecker) {
		super();
		this.spellChecker = spellChecker;
	}
	
	void sendEmail(String emailMessage) {
		spellChecker.checkSpelling(emailMessage);
	}

	//seter injection
	public void setSpellChecker(SpellChecker spellChecker){
		System.out.println("setSpellChecker");
		this.spellChecker =spellChecker;
	}

//	public void init(){
//		System.out.println("initilizing email client");
//	}
//
//	public void destory(){
//		System.out.println("destory email client");
//	}
//
//	@Override
//	public void destroy() throws Exception {
//		System.out.println("Destroyed Properties");
//	}
//
//	@Override
//	public void afterPropertiesSet() throws Exception {
//          System.out.println("Setting properties after bean is initializing");
//	}
}
