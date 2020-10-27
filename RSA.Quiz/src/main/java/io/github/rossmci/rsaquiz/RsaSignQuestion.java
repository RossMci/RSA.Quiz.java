package io.github.rossmci.rsaquiz;

import java.util.ArrayList;

public class RsaSignQuestion
{

	public RsaSignQuestion()
	{
	}

	public RsaSignQuestion(String imageName, String category, String path)
	{
		this.imageName = imageName;
		this.category = category;
		this.path = path;
	}

	/**
	 * @return the imageName
	 */
	public String getImageName()
	{
		return imageName;
	}

	/**
	 * @param imageName the imageName to set
	 */
	public void setImageName(String imageName)
	{
		this.imageName = imageName;
	}

	/**
	 * @return the category
	 */
	public String getCategory()
	{
		return category;
	}

	/**
	 * @param category the category to set
	 */
	public void setCategory(String category)
	{
		this.category = category;
	}

	/**
	 * @return the path
	 */
	public String getPath()
	{
		return path;
	}

	/**
	 * @param path the path to set
	 */
	public void setPath(String path)
	{
		this.path = path;
	}

	public int getIndex()
	{
		return index;
	}

	public void setIndex(int index)
	{
		this.index = index;
	}

	@Override
	public String toString()
	{
		return "RSAImage{" + "imageName=" + imageName + ", category=" + category + ", path=" + path + '}';
	}

	public boolean isSelectedAnswerCorrect(int selectedOptionIndex)
	{
		return getOptions().get(selectedOptionIndex).equalsIgnoreCase(getAnswer());
	}

	public ArrayList<String> getOptions()
	{
		return options;
	}

	public void setOptions(ArrayList<String> options)
	{
		this.options = options;
	}

	public String getAnswer()
	{
		return answer;
	}

	public void setAnswer(String answer)
	{
		this.answer = answer;
	}

	private ArrayList<String> options;
	private int index;
	private String imageName;
	private String answer;
	private String category;
	private String path;

	private String wrongImageNameOption1;
	private String wrongImageNameOption2;

}
