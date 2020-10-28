package io.github.rossmci.rsaquiz;

import java.util.List;
import java.util.Locale;

public interface RsaQuizManger extends Runnable
{
	// gets the user data for the quiz
	UserData getUserData();

	User getUser();
	void setUser(User user);
// setup the quiz
	void startQuiz();
   // stores the questions in the quiz
	List<RsaSignQuestion> getRsaSignQuestionBank();
  // gets the locale thats selected
	Locale getLocale();
  // sets all the locales aon the guis
	void reloadLocaleResource();

	void setLocale(String value);

	void setLocale(Locale value);
// makes the panels visiable and not visiable
	void setLanguageMenuVisible(boolean visible);

	void setQuizVisible(boolean visible);

	void setFeedBackVisible(boolean visible);

	void setSplashScreenVisible(boolean visible);

}
