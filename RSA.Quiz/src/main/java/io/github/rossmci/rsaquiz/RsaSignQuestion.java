package io.github.rossmci.rsaquiz;

import java.util.ArrayList;

public class RsaSignQuestion
{

	public RsaSignQuestion()
	{
	}
    // declare variables in the constructor
	public RsaSignQuestion(String imageName, String category, String path)
	{
		this.imageName = imageName;
		this.category = category;
		this.path = path;
	}

	/**
	 * @return the imageName
	 */
	// gets the image names
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
// gets the index
	public int getIndex()
	{
		return index;
	}
// sets the index 
	public void setIndex(int index)
	{
		this.index = index;
	}
    // changes the inbulit to changes it
	@Override
	public String toString()
	{
		return "RSAImage{" + "imageName=" + imageName + ", category=" + category + ", path=" + path + '}';
	}
     // this method determines if the slected anwser is the correct one 
	public boolean isSelectedAnswerCorrect(int selectedOptionIndex)
	{
		return getOptions().get(selectedOptionIndex).equalsIgnoreCase(getAnswer());
	}
   //gets the options from the array list 
	public ArrayList<String> getOptions()
	{
		return options;
	}
   // sets the options from the arraylist
	public void setOptions(ArrayList<String> options)
	{
		this.options = options;
	}
  // gets the answers
	public String getAnswer()
	{
		return answer;
	}
    //sets the answers
	public void setAnswer(String answer)
	{
		this.answer = answer;
	}
  // declared variables
	private ArrayList<String> options;
	private int index;
	private String imageName;
	private String answer;
	private String category;
	private String path;

	private String wrongImageNameOption1;
	private String wrongImageNameOption2;

}
