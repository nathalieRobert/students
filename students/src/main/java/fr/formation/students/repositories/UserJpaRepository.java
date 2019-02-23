package fr.formation.students.repositories;

import java.util.List;

import javax.validation.Valid;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import fr.formation.students.dtos.UserUpdateDto;
import fr.formation.students.entities.User;

public interface UserJpaRepository extends JpaRepository<User, Long> {

    @Query("SELECT id, firstname, lastname FROM User user WHERE user.active = 1")
    List<User> getAllActiveUsers(boolean active);
}
