package uz.farrukh.myexpensetrackerapi.services;


import uz.farrukh.myexpensetrackerapi.entities.User;
import uz.farrukh.myexpensetrackerapi.exceptions.EtAuthException;

public interface UserService {
    User validateUser(String email, String password) throws EtAuthException;

    User registerUser(User user) throws EtAuthException;
}
