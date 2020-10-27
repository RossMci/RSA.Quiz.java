package io.github.rossmci.rsaquiz;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.List;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

public class RsaQuizFrame extends javax.swing.JFrame implements RsaQuizManger
{

	public RsaQuizFrame()
	{
		initComponents();
		this.headingPanel1.setRsaQuizManger(this);
		//panels[1] = this.headingPanel1;

		panels[0] = this.languagePanel1;
		panels[1] = this.splashScreenPanel1;
		panels[2] = this.quizPanel;
		panels[3] = this.userFeedBackPanel1;
		for (RsaQuizPanel panel : panels)
		{
			if (panel != null)
			{
				panel.setRsaQuizManger(this);
				panel.setVisible(false);
			}
		}
		this.startQuiz();
	}

	private void setPanelsVisible(boolean visible)
	{
		for (RsaQuizPanel panel : panels)
		{
			if (panel != null)
			{
				panel.setVisible(visible);
			}
		}
	}

	//
	//	Properties
	//
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

	@Override
	public User getUser()
	{
		return this.user;
	}

	@Override
	public void setUser(User user)
	{
		this.user = user;
	}

	public void loginAsGuest()
	{
		this.user = this.guestUser;
	}

	//
	//	Methods
	//
	@Override
	public void run()
	{
		this.setVisible(true);
		if (showSplashScreenFrame)
		{
			setSplashScreenVisible(true);
			this.splashScreenPanel1.run();
		}
		setSplashScreenVisible(false);
		setLanguageMenuVisible(true);
	}

	@Override
	public void reloadLocaleResource()
	{
		for (RsaQuizPanel panel : panels)
		{
			if (panel != null)
			{
				panel.reloadLocaleResource();
			}
		}
		this.loadQuestions(locale);
	}

	@Override
	public void setLanguageMenuVisible(boolean visible)
	{
		setPanelsVisible(false);
		this.languagePanel1.setVisible(visible);
	}

	@Override
	public void setQuizVisible(boolean visible)
	{
		setPanelsVisible(false);

		this.quizPanel.setVisible(visible);
		this.quizPanel.initQuiz();
	}

	@Override
	public void setFeedBackVisible(boolean visible)
	{
		setPanelsVisible(false);
		this.userFeedBackPanel1.showData();
		this.userFeedBackPanel1.setVisible(visible);
	}

	@Override
	public void setSplashScreenVisible(boolean visible)
	{
		this.splashScreenPanel1.setVisible(visible);
	}
	public List<RsaSignQuestion> rsaSignQuestions;

	@Override
	public List<RsaSignQuestion> getRsaSignQuestionBank()
	{
		return rsaSignQuestions;
	}

	public void setRsaSignQuestions(List<RsaSignQuestion> rsaSignQuestions)
	{
		this.rsaSignQuestions = rsaSignQuestions;
	}

	private void loadQuestions(Locale locale)
	{
		String directoryContextPath = "signs";
		try
		{
			this.rsaSignQuestions = RsaSignQuestionRepository.getAll(directoryContextPath, true);
		}
		catch (IOException ex)
		{
			Logger.getLogger(RsaQuizFrame.class.getName()).log(Level.SEVERE, null, ex);
		}
		catch (URISyntaxException ex)
		{
			Logger.getLogger(RsaQuizFrame.class.getName()).log(Level.SEVERE, null, ex);
		}
	}

	@Override
	public UserData getUserData()
	{
		return this.user.getUserData();
	}

	@Override
	public void startQuiz()
	{
		try
		{
			//TODO : final variable for quizSize
			this.user.getUserData().startQuiz();
		}
		catch (Exception ex)
		{
			Logger.getLogger(RsaQuizFrame.class.getName()).log(Level.SEVERE, null, ex);
		}
	}
	//
	//	Fields
	//
	private final RsaQuizPanel[] panels = new RsaQuizPanel[5];
	private final String defaultLocale = "en";
	private final User guestUser = new User("Guest");
	private Locale locale = new Locale(defaultLocale);
	private boolean showSplashScreenFrame = true;
	private User user = guestUser;

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        headingPanel1 = new io.github.rossmci.rsaquiz.HeadingPanel();
        splashScreenPanel1 = new io.github.rossmci.rsaquiz.SplashScreenPanel();
        languagePanel1 = new io.github.rossmci.rsaquiz.LanguagePanel();
        quizPanel = new io.github.rossmci.rsaquiz.QuizPanel();
        userFeedBackPanel1 = new io.github.rossmci.rsaquiz.UserFeedBackPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(750, 700));
        setSize(new java.awt.Dimension(750, 670));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        headingPanel1.setMaximumSize(new java.awt.Dimension(33267, 549));
        getContentPane().add(headingPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 610, -1));
        getContentPane().add(splashScreenPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 610, 590));
        getContentPane().add(languagePanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 54, 610, 530));

        quizPanel.setMaximumSize(new java.awt.Dimension(590, 580));
        quizPanel.setPreferredSize(new java.awt.Dimension(590, 670));
        getContentPane().add(quizPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 48, 610, 540));
        getContentPane().add(userFeedBackPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 54, 610, 530));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private io.github.rossmci.rsaquiz.HeadingPanel headingPanel1;
    private io.github.rossmci.rsaquiz.LanguagePanel languagePanel1;
    private io.github.rossmci.rsaquiz.QuizPanel quizPanel;
    private io.github.rossmci.rsaquiz.SplashScreenPanel splashScreenPanel1;
    private io.github.rossmci.rsaquiz.UserFeedBackPanel userFeedBackPanel1;
    // End of variables declaration//GEN-END:variables

}
