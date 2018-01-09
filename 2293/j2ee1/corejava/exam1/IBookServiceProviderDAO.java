package j2ee1.corejava.exam1;

import java.sql.SQLException;

public interface IBookServiceProviderDAO {
	public void insertBook(Book book) throws DuplicateBookIDException, SQLException;
}
