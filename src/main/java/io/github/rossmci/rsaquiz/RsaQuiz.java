package io.github.rossmci.rsaquiz;

import java.util.Locale;

public class RsaQuiz
{
	public RsaQuiz()
	{
		languageMenuFrame = new LanguageMenuFrame(this);
		quizFrame= new QuizFrame(this);
		feedBackFrame= new FeedBackFrame(this);
		splashScreenFrame= new SplashScreenFrame(this);
	}
	public LanguageMenuFrame getLanguageMenuFrame()
	{
		return languageMenuFrame;
	}
	public void setLanguageMenuFrame(LanguageMenuFrame languageMenuFrame)
	{
		this.languageMenuFrame = languageMenuFrame;
	}
	public QuizFrame getQuizFrame()
	{
		return quizFrame;
	}
	public void setQuizFrame(QuizFrame quizFrame)
	{
		this.quizFrame = quizFrame;
	}
	public FeedBackFrame getFeedBackFrame()
	{
		return feedBackFrame;
	}
	public void setFeedBackFrame(FeedBackFrame feedBackFrame)
	{
		this.feedBackFrame = feedBackFrame;
	}
	public SplashScreenFrame getSplashScreenFrame()
	{
		return splashScreenFrame;
	}
	public void setSplashScreenFrame(SplashScreenFrame splashScreenFrame)
	{
		this.splashScreenFrame = splashScreenFrame;
	}

	private LanguageMenuFrame languageMenuFrame;
	private QuizFrame quizFrame;
	private FeedBackFrame feedBackFrame;
	private SplashScreenFrame splashScreenFrame;

	public static Locale getLocale()
	{
		return locale;
	}
	public static void setLocale(String value)
	{
		locale = new Locale(value);
	}
	public static void setLocale(Locale value)
	{
		locale = value;
	}

	private static Locale locale = new Locale("en");
}
