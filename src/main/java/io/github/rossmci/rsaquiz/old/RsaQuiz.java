package io.github.rossmci.rsaquiz.old;

import io.github.rossmci.rsaquiz.AppLauncher;
import io.github.rossmci.rsaquiz.RsaQuizManger;
import io.github.rossmci.rsaquiz.RsaSignQuestion;
import io.github.rossmci.rsaquiz.User;
import io.github.rossmci.rsaquiz.UserData;
import java.util.List;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

public class RsaQuiz implements RsaQuizManger
{

	public RsaQuiz()
	{
		languageMenuFrame = new LanguageMenuFrame(this);
		quizFrame = new QuizFrame(this);
		feedBackFrame = new FeedBackFrame(this);
		splashScreenFrame = new SplashScreenFrame(this);
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

	boolean showSplashScreenFrame = true;

	@Override
	public void run()
	{

		if (showSplashScreenFrame)
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
		getLanguageMenuFrame().setVisible(true);
	}
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

	@Override
	public List<RsaSignQuestion> getRsaSignQuestionBank()
	{
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}


	@Override
	public void startQuiz()
	{
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public User getUser()
	{
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public void setUser(User user)
	{
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public UserData getUserData()
	{
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}
}
