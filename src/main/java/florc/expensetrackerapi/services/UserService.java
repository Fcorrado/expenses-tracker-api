package florc.expensetrackerapi.services;

import florc.expensetrackerapi.domain.User;
import florc.expensetrackerapi.exceptions.EtAuthException;

public interface UserService {

    User validateUser(String email, String password) throws EtAuthException;

    User registerUser(String firstName, String lastname, String email, String password) throws EtAuthException;


}
