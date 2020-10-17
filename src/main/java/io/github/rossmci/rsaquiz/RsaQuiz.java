package io.github.rossmci.rsaquiz;

import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

public class RsaQuiz implements Runnable
{
	public RsaQuiz()
	{
		languageMenuFrame = new LanguageMenuFrame(this);
		quizFrame= new QuizFrame(this);
		feedBackFrame= new FeedBackFrame(this);
		splashScreenFrame= new SplashScreenFrame(this);
	}
		public void reloadLocaleResource()
	{
		this.quizFrame.reloadLocaleResource();
		this.languageMenuFrame.reloadLocaleResource();
		this.feedBackFrame.reloadLocaleResource();
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

	public Locale getLocale()
	{
		return locale;
	}
	public void setLocale(String value)
	{
		locale = new Locale(value);
	}
	public void setLocale(Locale value)
	{
		locale = value;
	}

	private Locale locale = new Locale("en");

	boolean showSplashScreenFrame=true;
	@Override
	public void run()
	{
		
		if(showSplashScreenFrame)
		{
		getSplashScreenFrame().setVisible(true);
		{
			for (int i = 0; i <= 100; i++)
			{
				try
				{
					Thread.sleep(20);
				}
				catch (InterruptedException ex)
				{
					Logger.getLogger(AppLauncher.class.getName()).log(Level.SEVERE, null, ex);
				}
				SplashScreenFrame.PercentjLabel.setText("" + i);
				SplashScreenFrame.ProgressBar.setValue(i);
			}
			getSplashScreenFrame().setVisible(false);
		}
	}
		getLanguageMenuFrame().setVisible(true);	}
}
