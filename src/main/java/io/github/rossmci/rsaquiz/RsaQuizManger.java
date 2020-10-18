/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.rossmci.rsaquiz;

import java.util.Locale;

/**
 *
 * @author Ross Mcinerney
 */
public interface RsaQuizManger extends Runnable
{

	//TODO Object getQuestions();
	Locale getLocale();

	void reloadLocaleResource();

	void setLocale(String value);

	void setLocale(Locale value);
	
	void setLanguageMenuVisible(boolean visible);
	void setQuizVisible(boolean visible);
	void setFeedBackVisible(boolean visible);
	void setSplashScreenVisible(boolean visible);
	
}
