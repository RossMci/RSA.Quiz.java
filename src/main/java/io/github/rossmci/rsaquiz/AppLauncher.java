package io.github.rossmci.rsaquiz;

/**
 *
 * @author Ross Mcinerney
 */
public class AppLauncher
{

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args)
	{
		RsaQuiz rsaQuiz = new RsaQuiz();
		rsaQuiz.getSplashScreenFrame().setVisible(true);
		try
		{
			for(int i = 0; i <= 100; i++)
			{
				Thread.sleep(60);
				SplashScreenFrame.PercentjLabel.setText("" + i);
				SplashScreenFrame.ProgressBar.setValue(i);
			}
			rsaQuiz.getSplashScreenFrame().setVisible(false);
			rsaQuiz.getLanguageMenuFrame().setVisible(true);
		}
		catch(InterruptedException e)
		{

		}
	}
}
