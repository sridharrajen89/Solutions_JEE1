package j2ee1.corejava.exam1;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BookDAOImpl implements IBookServiceProviderDAO {

	Connection con;
	ResultSet rs;

	public BookDAOImpl() {
		try {
			con = new DBConnector().getConnection();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void insertBook(Book book) throws DuplicateBookIDException, SQLException {
		
		CallableStatement stmt = con.prepareCall("{call insertbookrecord(?,?,?,?)}");
		stmt.setInt(1, book.getBookId());
		stmt.setString(2, book.getBookCategory());
		stmt.setString(3, book.getBookName());
		stmt.setString(4, book.getAuthorName());
		int recCount = stmt.executeUpdate(); // execute the stored procedure
		if (recCount != 0)
			throw new DuplicateBookIDException();
	}

}
