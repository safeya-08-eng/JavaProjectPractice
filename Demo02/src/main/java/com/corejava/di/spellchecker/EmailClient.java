package com.corejava.di.spellchecker;

public class EmailClient {
	private SpellChecker spellChecker;
	public EmailClient(){

	}

	public EmailClient(SpellChecker spellChecker) {
		super();
		this.spellChecker = spellChecker;
	}

	void sendEmail(String emailMessage) {
		spellChecker.checkSpelling(emailMessage);
	}
	//	setter injection
	public void setSpellChecker(SpellChecker spellChecker){
		System.out.println("setterinjection");
		this.spellChecker=spellChecker;
	}
}