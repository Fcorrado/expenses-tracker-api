package florc.expensetrackerapi.services;

import florc.expensetrackerapi.domain.User;
import florc.expensetrackerapi.exceptions.EtAuthException;

public class UserServiceImpl implements UserService {
    @Override
    public User validateUser(String email, String password) throws EtAuthException {
        return null;
    }

    @Override
    public User registerUser(String firstName, String lastname, String email, String password) throws EtAuthException {
        return null;
    }
}
