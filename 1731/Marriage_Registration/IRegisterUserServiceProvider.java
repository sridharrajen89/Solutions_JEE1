package htc.test.user;

import java.sql.SQLException;

public interface IRegisterUserServiceProvider {
     public boolean  createUser(RegisteredUser obj) throws DuplicateUserException, SQLException;
}
