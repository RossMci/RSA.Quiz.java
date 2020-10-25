package io.github.rossmci.rsaquiz;

import static io.github.rossmci.rsaquiz.RsaSignQuestionRepository.getAll;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author Ross Mcinerney
 */
public class RsaQuizBuilder
{

	public static void main(String[] args) throws Exception
	{
		System.out.println("generateRandomWrongAnswers");
		RsaQuizBuilder instance = new RsaQuizBuilder();
		List<RsaSignQuestion> rsaSignQuestionList = instance.buildQuestions();

		for (RsaSignQuestion rsaSignQuestion : rsaSignQuestionList)
		{
			if (rsaSignQuestion.getPath().equalsIgnoreCase(rsaSignQuestion.getWrongImageNameOption1())
					|| rsaSignQuestion.getPath().equalsIgnoreCase(rsaSignQuestion.getWrongImageNameOption2())
					|| rsaSignQuestion.getWrongImageNameOption1().equalsIgnoreCase(rsaSignQuestion.getWrongImageNameOption2()))
			{
				System.out.println("");
				System.out.println(rsaSignQuestion.getIndex());

				System.out.println(rsaSignQuestion.getPath());
				System.out.println(rsaSignQuestion.getWrongImageNameOption1());
				System.out.println(rsaSignQuestion.getWrongImageNameOption2());

			}
		}
		System.out.println("end test generateRandomWrongAnswers");

	}

	List<RsaSignQuestion> buildQuizBank()
	{
		//TODO:  Build questions with wrong answers

		return null;
	}

	public List<RsaSignQuestion> buildQuestions() throws IOException, URISyntaxException
	{
		String directoryContextPath = "signs";
		List<RsaSignQuestion> rsaSignQuestionList = getAll(directoryContextPath, true);

		generateRandomWrongAnswers(rsaSignQuestionList);
		return rsaSignQuestionList;
	}

	public List<RsaSignQuestion> buildQuiz1() throws IOException, URISyntaxException
	{
		ArrayList<RsaSignQuestion> QuizBank = new ArrayList<>();
		String directoryContextPath = "signs";
		var imgList = getAll(directoryContextPath, true);
		imgList.forEach(rsaImage -> QuizBank.add(rsaImage));

		return null;
//TODO:  Build N questions for a user
	}

	public static void generateRandomWrongAnswers(List<RsaSignQuestion> rsaSignQuestionList)
	{
		for (RsaSignQuestion rsaSignQuestion : rsaSignQuestionList)
		{
			generateRandomWrongAnswers(rsaSignQuestion, rsaSignQuestionList);
		}
	}

	public static void generateRandomWrongAnswers(RsaSignQuestion rsaSignQuestion, List<RsaSignQuestion> rsaSignQuestionList)
	{
		int questionIndex = rsaSignQuestion.getIndex();
		int randomIndex1;
		int randomIndex2;

		//FIXME:Unique Random not working 
		do
		{
			Random random = new Random();
			randomIndex1 = random.nextInt(rsaSignQuestionList.size());
			randomIndex2 = random.nextInt(rsaSignQuestionList.size());
		}
		while (questionIndex == randomIndex1 || questionIndex == randomIndex2 || randomIndex1 == randomIndex2);

		rsaSignQuestion.setWrongImageNameOption1(rsaSignQuestionList.get(randomIndex1).getPath());
		rsaSignQuestion.setWrongImageNameOption2(rsaSignQuestionList.get(randomIndex2).getPath());

	}
}
