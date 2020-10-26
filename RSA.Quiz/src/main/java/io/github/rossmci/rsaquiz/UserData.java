package io.github.rossmci.rsaquiz;

import java.util.List;

/**
 *
 * @author Ross Mcinerney
 */
public class UserData
{

	Object user;
	int testSize = 20;
	List<RsaSignQuestion> quizQuestions;
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

	public List<RsaSignQuestion> getQuizQuestions()
	{
		return quizQuestions;
	}

	public void setQuizQuestions(List<RsaSignQuestion> quizQuestions)
	{
		this.quizQuestions = quizQuestions;
	}

	public boolean[] getQuizQuestionResult()
	{
		return quizQuestionResult;
	}

	public void setQuizQuestionResult(boolean[] quizQuestionResult)
	{
		this.quizQuestionResult = quizQuestionResult;
	}

	public void startQuiz() throws Exception
	{
		this.quizQuestions = new RsaQuizBuilder().buildQuiz(this.testSize);

		
		for (int i = 0; i < quizQuestionResult.length; i++)
		{
			quizQuestionResult[i] = false;
		}
		
		//TODO Tried/Atttempted
		boolean[] questionsAnswered=new boolean[testSize];
		for (int i = 0; i < quizQuestionResult.length; i++)
		{
			quizQuestionResult[i] = false;
		}
	}


	public void setImageQuestion()
	{

	}

	public void correctQuestion()
	{
	}
}
