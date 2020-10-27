/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.rossmci.rsaquiz;

import java.util.List;
import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.fail;

/**
 *
 * @author Ross Mcinerney
 */
public class RsaQuizBuilderTest
{

	public RsaQuizBuilderTest()
	{
	}

	/**
	 * Test of buildQuestions method, of class RsaQuizBuilder.
	 */
	public void testBuildQuestions() throws Exception
	{
		System.out.println("buildQuestions");
		RsaQuizBuilder instance = new RsaQuizBuilder();
		List<RsaSignQuestion> expResult = null;
		List<RsaSignQuestion> result = instance.buildQuestions();
		assertEquals(expResult, result);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}


	/**
	 * Test of generateRandomWrongAnswers method, of class RsaQuizBuilder.
	 */
	public void testGenerateRandomWrongAnswers_List()
	{
		System.out.println("generateRandomWrongAnswers");
		List<RsaSignQuestion> rsaSignQuestionList = null;
		RsaQuizBuilder.generateRandomWrongAnswers(rsaSignQuestionList);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of generateRandomWrongAnswers method, of class RsaQuizBuilder.
	 *
	 * @throws java.lang.Exception
	 */
	public void testGenerateRandomWrongAnswers_RsaSignQuestion_List() throws Exception
	{
		System.out.println("generateRandomWrongAnswers");
		RsaQuizBuilder instance = new RsaQuizBuilder();
		List<RsaSignQuestion> rsaSignQuestionList = instance.buildQuestions();

		RsaSignQuestion rsaSignQuestion = rsaSignQuestionList.get(5);

		RsaQuizBuilder.generateRandomWrongAnswers(rsaSignQuestion, rsaSignQuestionList);


		// TODO review the generated test code and remove the default call to fail.
	}


}
