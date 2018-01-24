import java.sql.SQLException;

public interface IRegisterUserServiceProvider {
	Boolean createUser(RegisterUser user) throws SQLException;

}
