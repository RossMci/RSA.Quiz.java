package io.github.rossmci.rsaquiz;

/**
 *
 * @author Ross Mcinerney
 */
public class UserData
{

	Object user;
	int testSize = 20;
	int[] quizQuestion = new int[testSize];
	boolean[] quizQuestionResult = new boolean[testSize];// fill loop all false to begin

	public Object getUser()
	{
		return user;
	}

	public void setUser(Object user)
	{
		this.user = user;
	}

	public int getTestSize()
	{
		return testSize;
	}

	public void setTestSize(int testSize)
	{
		this.testSize = testSize;
	}

	public int[] getQuizQuestion()
	{
		return quizQuestion;
	}

	public void setQuizQuestion(int[] quizQuestion)
	{
		this.quizQuestion = quizQuestion;
	}

	public boolean[] getQuizQuestionResult()
	{
		return quizQuestionResult;
	}

	public void setQuizQuestionResult(boolean[] quizQuestionResult)
	{
		this.quizQuestionResult = quizQuestionResult;
	}

	public void startQuiz()
	{
		for (int i = 0; i < quizQuestionResult.length; i++)
		{
			quizQuestionResult[i] = false;
		}
		//creat an array
		String[] allQuestion = new String[1];
		//fill with for loop 0 to getRsaSignQuestion.size-1(offset by1)
		for (int i = 0; i < allQuestion.length; i++)
		{
			allQuestion[i] = "";
		}
		//shuffle - link to studenbt quiz link repo
		// filled with first 20of above array;
		for (int i = 0; i < quizQuestion.length; i++)
		{
			quizQuestion[i] = 1;
		}
		// fill the buttons in a random order
	}

	public void setImageQuestion()
	{

	}
	
	public void correctQuestion()
	{
	}
}
