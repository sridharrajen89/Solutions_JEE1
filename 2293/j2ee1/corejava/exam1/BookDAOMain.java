package j2ee1.corejava.exam1;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class BookDAOMain {

	public static void main(String[] args) {
		Book book = new Book();
		BookDAOImpl bookDAO = new BookDAOImpl();

		try {
			FileInputStream fStream = new FileInputStream(
					"C:\\Dev\\Workspaces\\HTC_JavaTraining_WS\\Excercises_Proj\\src\\j2ee1\\corejava\\exam1\\book.txt");

			InputStreamReader iStream = new InputStreamReader(fStream);
			BufferedReader br = new BufferedReader(iStream);
			String strLine;
			while ((strLine = br.readLine()) != null) {
				String[] str = strLine.split(",");
				book.setBookId(Integer.parseInt(str[0]));
				book.setBookCategory(str[1]);
				book.setBookName(str[2]);
				book.setAuthorName(str[3]);
				bookDAO.insertBook(book);
			}

			br.close();

		} catch (Exception e) {
			e.printStackTrace();

		}
	}

}
