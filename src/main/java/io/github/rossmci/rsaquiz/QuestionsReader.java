package io.github.rossmci.rsaquiz;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class QuestionsReader
{

	public static ArrayList<RSAImage> getAllImages(File directory, boolean descendIntoSubDirectories) throws IOException
	{
		ArrayList<RSAImage> resultList = new ArrayList<>();
		File[] f = directory.listFiles();
		for (File file : f)
		{
			RSAImage image = new RSAImage();
			image.setCategory(directory.getName());
			image.setPath(file.getCanonicalPath());
			image.setImageName(file.getName());
			resultList.add(image);

			if (descendIntoSubDirectories && file.isDirectory())
			{
				ArrayList<RSAImage> tmp = getAllImages(file, true);
				if (tmp != null)
				{
					resultList.addAll(tmp);
				}
			}//end if
		}//end for
		if (resultList.size() > 0)
		{
			return resultList;
		}
		else
		{
			return null;
		}
	}

	public void Main() throws IOException
	{

		File folder = new File("signs/info_signs/");

		ArrayList<RSAImage> imgList = getAllImages(folder, true);

		System.out.println(imgList.size());

	}

}
