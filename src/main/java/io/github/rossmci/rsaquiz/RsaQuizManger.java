package io.github.rossmci.rsaquiz;

import java.util.List;
import java.util.Locale;

public interface RsaQuizManger extends Runnable
{
	//TODO: Object UserData

	List<RsaSignQuestion>  getRsaSignQuestions();
	
	Locale getLocale();

	void reloadLocaleResource();

	void setLocale(String value);

	void setLocale(Locale value);
	
	void setLanguageMenuVisible(boolean visible);
	void setQuizVisible(boolean visible);
	void setFeedBackVisible(boolean visible);
	void setSplashScreenVisible(boolean visible);
	
}
