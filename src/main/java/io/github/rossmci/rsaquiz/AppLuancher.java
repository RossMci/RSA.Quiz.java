package io.github.rossmci.rsaquiz;
/**
 *
 * @author Ross Mcinerney
 */
public class AppLuancher
{

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args)
	{
		SplashScreenFrame rSASplash = new SplashScreenFrame();
		OptionsJFrame OptionsJFrame = new OptionsJFrame();
		rSASplash.setVisible(true);
		try
		{
			for(int i=0;i<=100;i++){
				Thread.sleep(60);
					SplashScreenFrame.PercentjLabel.setText(""+i);
					SplashScreenFrame.ProgressBar.setValue(i);
			}
			rSASplash.setVisible(false);
			OptionsJFrame.setVisible(true);
		}
		catch(InterruptedException e) 
		{
			
		}
	}
}
