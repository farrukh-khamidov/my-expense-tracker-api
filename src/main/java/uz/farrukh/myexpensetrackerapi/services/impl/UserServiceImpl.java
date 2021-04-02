package uz.farrukh.myexpensetrackerapi.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import uz.farrukh.myexpensetrackerapi.entities.User;
import uz.farrukh.myexpensetrackerapi.exceptions.EtAuthException;
import uz.farrukh.myexpensetrackerapi.repositories.UserRepository;
import uz.farrukh.myexpensetrackerapi.services.UserService;

import java.util.Optional;
import java.util.regex.Pattern;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User validateUser(String email, String password) throws EtAuthException {
        if (email != null) email = email.toLowerCase();
        Optional<User> optionalUser = userRepository.findByEmailAndPassword(email, password);
        if (!optionalUser.isPresent()) {
            throw new EtAuthException("Invalid email/password");
        }
        return optionalUser.get();
    }

    @Override
    public User registerUser(User user) throws EtAuthException {
        Pattern pattern = Pattern.compile("^(.+)@(.+)$");
        if (user.getEmail() != null) user.setEmail(user.getEmail());
        if (!pattern.matcher(user.getEmail()).matches()) throw new EtAuthException("Invalid email format");

        Integer count = userRepository.getCountByEmail(user.getEmail());
        if (count > 0)  throw new EtAuthException("Email already in use");

        return userRepository.save(user);
    }
}
