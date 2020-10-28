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
		//new RsaQuiz().run();
		// runs the RsaQuizFrame where the main program is displayed
		// I have seprated all the gui compoents into panels to keep the gui consisent in layout and size.
		new RsaQuizFrame().run();
	}
	
}
