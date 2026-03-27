package com.corejava.di.spellchecker;

public class AdvancedSpellChecker implements SpellChecker {
	public AdvancedSpellChecker() {
		System.out.println("AdvancedSpellChecker");
	}

	@Override
	public void checkSpelling(String emailMessage) {
		if (emailMessage != null) {
			// Determining  the language of the email Message
			// check grammatical errors in the email Message
			// check spellings in the email Message
			System.out.println("Checking Spelling using Advance Spell Checker...");
			System.out.println("Spell Checking Completed!!");
		} else {
			throw new RuntimeException("An exception occured " + "while checking Spelling");
		}
	}
}


