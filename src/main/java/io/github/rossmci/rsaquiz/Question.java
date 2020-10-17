/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.rossmci.rsaquiz;

import java.io.File;
import javax.swing.ImageIcon;

/**
 *
 * @author Ross Mcinerney
 */
public class Question
{
	
	private ImageIcon correctIcon;
	private ImageIcon incorrect1Icon;
	private ImageIcon inCorrect2Icon;
	private String questionText;

	public Question(ImageIcon correctIcon, ImageIcon incorrect1Icon, ImageIcon inCorrect2Icon, String questionText)
	{
		this.correctIcon = correctIcon;
		this.incorrect1Icon = incorrect1Icon;
		this.inCorrect2Icon = inCorrect2Icon;
		this.questionText = questionText;
	}
	
	File folder= new File("");
	
	
}
