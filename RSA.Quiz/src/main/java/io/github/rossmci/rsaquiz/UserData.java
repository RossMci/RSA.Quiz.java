package io.github.rossmci.rsaquiz;

import java.util.List;

/**
 *
 * @author Ross Mcinerney
 */
public class UserData
{

	private int testSize = 20;
	private List<RsaSignQuestion> quizQuestions;
	private boolean[] userQuizResults = new boolean[testSize];// fill loop all false to begin
	private boolean[] questionsAnswered = new boolean[testSize];// fill loop all false to begin
	private int[] givenAnswers = new int[testSize];// fill loop all false to begin

	public int[] getGivenAnswers()
	{
		return givenAnswers;
	}

	public void setGivenAnswers(int[] givenAnswers)
	{
		this.givenAnswers = givenAnswers;
	}
	

	//TODO: possible WOrk

	public boolean[] getQuestionsAnswered()
	{
		return questionsAnswered;
	}

	public void setQuestionsAnswered(boolean[] questionsAnswered)
	{
		this.questionsAnswered = questionsAnswered;
	}

	public int getScore()
	{
		int score = 0;
		for (int index = 0; index < userQuizResults.length; index++)
		{
			if (userQuizResults[index])
			{
				score++;
			}

		}
		return score;
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

	public boolean[] getUserQuizResults()
	{
		return userQuizResults;
	}

	public void setUserQuizResults(boolean[] userQuizResults)
	{
		this.userQuizResults = userQuizResults;
	}

	public void startQuiz() throws Exception
	{
		this.quizQuestions = new RsaQuizBuilder().buildQuiz(this.testSize);

		for (int i = 0; i < testSize; i++)
		{
			userQuizResults[i] = false;
			questionsAnswered[i] = false;
			givenAnswers[i] =-1;
		}
	}
}
