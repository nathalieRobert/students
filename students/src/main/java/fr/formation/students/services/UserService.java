package fr.formation.students.services;

import java.util.List;

import javax.validation.Valid;

import fr.formation.students.dtos.UserCreateDto;
import fr.formation.students.dtos.UserDto;
import fr.formation.students.dtos.UserGetDto;
import fr.formation.students.dtos.UserUpdateDto;
import fr.formation.students.entities.User;

public interface UserService {

	void create(UserCreateDto user);

	void update(@Valid UserUpdateDto user);

	void delete(Long id);

	Object findById(Long id);

	Iterable<User> findAllActiveUsers(boolean active);



	

}
