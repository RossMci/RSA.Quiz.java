package io.github.rossmci.rsaquiz;

import static io.github.rossmci.rsaquiz.RsaSignQuestionRepository.getAll;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Collections;
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
//		String directoryContextPath = "signs";
//		List<RsaSignQuestion> rsaSignQuestionList = getAll(directoryContextPath, true);
//
//		buildBundle(rsaSignQuestionList);
//		//buildBundle(rsaSignQuestionList,"French");
//		//buildBundle(rsaSignQuestionList,"Irish");

	}
	//gets  all the names of the images in order to put into the bundles
	public static void buildBundle(List<RsaSignQuestion> rsaSignQuestions)
	{
		String output = "";
		for (RsaSignQuestion rsaSignQuestion : rsaSignQuestions)
		{
			output += rsaSignQuestion.getImageName().replaceAll(".gif", "").replaceAll(" ", "");
			output += "=";
			output += rsaSignQuestion.getImageName().replaceAll(".gif", "");
			output += System.lineSeparator();
		}
		System.out.println(output);
	}
	//gets  all the names of the images in order to put into the bundles for locales
	public static void buildBundle(List<RsaSignQuestion> rsaSignQuestions, String language)
	{
		String output = "";
		for (int index = 0; index < rsaSignQuestions.size(); index++)
		{
			RsaSignQuestion rsaSignQuestion= rsaSignQuestions.get(index);
			
			output += rsaSignQuestion.getImageName().replaceAll(".gif", "").replaceAll(" ", "");
			output += "=";
			output += language+index;
			output += System.lineSeparator();
		}
		System.out.println(output);

	}
	// this is the old way I checked what index image questions were at.
	public static void oldCheck() throws IOException, URISyntaxException
	{
		System.out.println("generateRandomWrongAnswers");
		RsaQuizBuilder instance = new RsaQuizBuilder();
		List<RsaSignQuestion> rsaSignQuestionList = instance.buildQuestions();

		for (RsaSignQuestion rsaSignQuestion : rsaSignQuestionList)
		{
			{
				System.out.println("");
				System.out.println(rsaSignQuestion.getIndex());

				System.out.println(rsaSignQuestion.getPath());

			}
		}
		System.out.println("end test generateRandomWrongAnswers");
	}

	List<RsaSignQuestion> buildQuizBank()
	{
		//TODO:  Build questions with wrong answers

		return null;
	}
   // builds the questions for the quiz before the quiz starts
	public List<RsaSignQuestion> buildQuestions() throws IOException, URISyntaxException
	{
		String directoryContextPath = "signs";
		List<RsaSignQuestion> rsaSignQuestionList = getAll(directoryContextPath, true);

		generateRandomWrongAnswers(rsaSignQuestionList);
		return rsaSignQuestionList;
	}
      // gets the number of questions from 0 to numberOfquestions
	public List<RsaSignQuestion> buildQuiz(int numberOfQuestions) throws IOException, URISyntaxException
	{
		List<RsaSignQuestion> rsaSignQuestionList = buildQuestions();

		//TODO: maybe clone list first;
		Collections.shuffle(rsaSignQuestionList);

		List<RsaSignQuestion> quiz = rsaSignQuestionList.subList(0, numberOfQuestions);

		return quiz;
	}
    // genarates wrong question too be put into the quiz so wrong answers can be shuffled later
	public static void generateRandomWrongAnswers(List<RsaSignQuestion> rsaSignQuestionList)
	{
		for (RsaSignQuestion rsaSignQuestion : rsaSignQuestionList)
		{
			generateRandomWrongAnswers(rsaSignQuestion, rsaSignQuestionList);
		}
	}
     // shuffles the wrong answers between the options in the quiz
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
		String option2 = rsaSignQuestionList.get(randomIndex1).getPath();
		String option3 = rsaSignQuestionList.get(randomIndex2).getPath();

		ArrayList<String> options = new ArrayList<>();
		options.add(rsaSignQuestion.getAnswer());
		options.add(option2);
		options.add(option3);

		Collections.shuffle(options);

		rsaSignQuestion.setOptions(options);

	}
}
