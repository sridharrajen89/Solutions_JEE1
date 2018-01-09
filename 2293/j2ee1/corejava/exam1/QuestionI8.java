package j2ee1.corejava.exam1;

import java.io.File;
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class QuestionI8 {

	/*
	 * to check if the given folder is empty
	 */
	private static boolean isDirEmpty(final Path directory) throws IOException {
	    try(DirectoryStream<Path> dirStream = Files.newDirectoryStream(directory)) {
	        return !dirStream.iterator().hasNext();
	    }
	}
	
	public static void listFilesWhichHasLengthLessThan2K(final File folder) {
	    for (final File fileEntry : folder.listFiles()) {
	        if (fileEntry.length() < 2000) {
	        	System.out.println(fileEntry.getName());
	        }
	    }
	}

	public static void main(String args[]){
		try {
			System.out.println("-------------"+QuestionI8.isDirEmpty(Paths.get("C:\\Dev\\Workspaces\\HTC_JavaTraining_WS\\Excercises_Proj\\New folder")));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		final File folder = new File("C:\\\\Dev\\\\Workspaces\\\\HTC_JavaTraining_WS\\\\Excercises_Proj");
		QuestionI8.listFilesWhichHasLengthLessThan2K(folder);
	}
}
