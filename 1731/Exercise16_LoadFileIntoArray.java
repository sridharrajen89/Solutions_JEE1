package htc.assignments;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

// Read List from Text file and copy to Issue which is an array

class Exercise16_LoadFileIntoArray
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new FileReader("C:\\\\HTC\\\\Test.txt"));
		ArrayList<Issue> issue = new ArrayList<Issue>();

		String line = null;

		while ((line = br.readLine()) != null) {
			String[] values = line.split(",");

			int issueId = Integer.parseInt(values[0]);
			String isueGeneratedDate = values[1];
			int issueCategory = Integer.parseInt(values[2]);
			String issueDescription = values[3];
			
			Issue addIssueDetails = new Issue (issueId,isueGeneratedDate,issueCategory,issueDescription);
			issue.add(addIssueDetails);
		}
		System.out.println(issue);
		br.close();
	}
}