package io.github.rossmci.rsaquiz;

import java.util.Random;

public class Stackoverflow
{

	/**
	 * Shuffle an Array using the Fisher-Yates method. Code got from * @see
	 * <a href="https://stackoverflow.com/questions/1519736/random-shuffling-of-an-array">Stackoverflow</a>
	 *
	 * @param array The array to shuffle
	 */
	public static void fisherYatesShuffleArray(int[] array)
	{
		int index;
		Random random = new Random();
		for (int i = array.length - 1; i > 0; i--)
		{
			index = random.nextInt(i + 1);
			if (index != i)
			{
				array[index] ^= array[i];
				array[i] ^= array[index];
				array[index] ^= array[i];
			}
		}
	}
}
