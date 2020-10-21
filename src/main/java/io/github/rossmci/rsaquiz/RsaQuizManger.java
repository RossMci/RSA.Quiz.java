package io.github.rossmci.rsaquiz;

import java.util.List;
import java.util.Locale;

public interface RsaQuizManger extends Runnable
{

	//TODO: Object UserData
	UserData getUserData();

	User getUser();
	void setUser(User user);

	void startQuiz();

	List<RsaSignQuestion> getRsaSignQuestionBank();

	Locale getLocale();

	void reloadLocaleResource();

	void setLocale(String value);

	void setLocale(Locale value);

	void setLanguageMenuVisible(boolean visible);

	void setQuizVisible(boolean visible);

	void setFeedBackVisible(boolean visible);

	void setSplashScreenVisible(boolean visible);

}
