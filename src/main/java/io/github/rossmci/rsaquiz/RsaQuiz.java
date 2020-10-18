package io.github.rossmci.rsaquiz;

import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

public class RsaQuiz implements RsaQuizManger
{
	public RsaQuiz()
	{
		languageMenuFrame = new LanguageMenuFrame(this);
		quizFrame= new QuizFrame(this);
		feedBackFrame= new FeedBackFrame(this);
		splashScreenFrame= new SplashScreenFrame(this);
	}
	@Override
		public void reloadLocaleResource()
	{
		this.quizFrame.reloadLocaleResource();
		this.languageMenuFrame.reloadLocaleResource();
		this.feedBackFrame.reloadLocaleResource();
	}
	private LanguageMenuFrame getLanguageMenuFrame()
	{
		return languageMenuFrame;
	}
	public void setLanguageMenuFrame(LanguageMenuFrame languageMenuFrame)
	{
		this.languageMenuFrame = languageMenuFrame;
	}
	private QuizFrame getQuizFrame()
	{
		return quizFrame;
	}
	public void setQuizFrame(QuizFrame quizFrame)
	{
		this.quizFrame = quizFrame;
	}
	private FeedBackFrame getFeedBackFrame()
	{
		return feedBackFrame;
	}
	public void setFeedBackFrame(FeedBackFrame feedBackFrame)
	{
		this.feedBackFrame = feedBackFrame;
	}
	private SplashScreenFrame getSplashScreenFrame()
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

	@Override
	public Locale getLocale()
	{
		return locale;
	}
	@Override
	public void setLocale(String value)
	{
		locale = new Locale(value);
	}
	@Override
	public void setLocale(Locale value)
	{
		locale = value;
	}

	private Locale locale = new Locale("fr");

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
					Thread.sleep(60);
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
//todo: same for the rest 
	@Override
	public void setLanguageMenuVisible(boolean visible)
	{
		this.languageMenuFrame.setVisible(visible);
	}

	@Override
	public void setQuizVisible(boolean visible)
	{
      this.quizFrame.setVisible(visible);
	}

	@Override
	public void setFeedBackVisible(boolean visible)
	{
         this.feedBackFrame.setVisible(visible);
	}

	@Override
	public void setSplashScreenVisible(boolean visible)
	{
		this.splashScreenFrame.setVisible(visible);
	}
}
