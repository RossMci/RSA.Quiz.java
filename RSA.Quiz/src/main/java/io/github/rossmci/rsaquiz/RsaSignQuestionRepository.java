package io.github.rossmci.rsaquiz;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

public class RsaSignQuestionRepository
{
   // gets all the images paths and names  also puts into an arraylist 
	public static ArrayList<RsaSignQuestion> getAll(File directory, boolean descendIntoSubDirectories) throws IOException
	{
		ArrayList<RsaSignQuestion> resultList = new ArrayList<>();
		File[] directoryFiles = directory.listFiles();
		for (File file : directoryFiles)
		{
			if (file.isFile())
			{
				RsaSignQuestion image = new RsaSignQuestion();
				image.setIndex(resultList.size());
				image.setCategory(directory.getName());
				image.setPath(file.getCanonicalPath());
				image.setImageName(file.getName());
				image.setAnswer(file.getCanonicalPath());
				resultList.add(image);
			}
			else if (descendIntoSubDirectories && file.isDirectory())
			{
				ArrayList<RsaSignQuestion> tmp = RsaSignQuestionRepository.getAll(file, true);
				if (tmp != null)
				{
					resultList.addAll(tmp);
				}
			}
		}
		return resultList;
	}
  // gets all the uri and  loads the images and adds them to the array list
	public static List<RsaSignQuestion> getAll(String directoryContextPath, boolean descendIntoSubDirectories) throws IOException, URISyntaxException
	{
		ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
		URI contextURI = new URI(classLoader.getResource(directoryContextPath).toString());
		String filePath = contextURI.getPath();
		File directory = new File(filePath);

		return RsaSignQuestionRepository.getAll(directory, descendIntoSubDirectories);
	}
   // prints all the images
	public static void main(String[] args) throws IOException, URISyntaxException
	{
		String directoryContextPath = "signs";
		var imgList = getAll(directoryContextPath, true);
		System.out.println(imgList.size());
		//System.out.println(imgList);

		//imgList.forEach(rsaImage -> System.out.println(rsaImage.toString()));
	}
}
