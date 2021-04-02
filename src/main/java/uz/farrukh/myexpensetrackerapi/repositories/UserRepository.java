package uz.farrukh.myexpensetrackerapi.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import uz.farrukh.myexpensetrackerapi.entities.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer> {

    Optional<User> findByEmailAndPassword(String email, String password);

    Integer getCountByEmail(String email);

}
