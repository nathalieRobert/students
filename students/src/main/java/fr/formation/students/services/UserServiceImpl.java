package fr.formation.students.services;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.stereotype.Service;

import fr.formation.students.dtos.UserCreateDto;
import fr.formation.students.dtos.UserDto;
import fr.formation.students.dtos.UserGetDto;
import fr.formation.students.dtos.UserUpdateDto;
import fr.formation.students.entities.User;
import fr.formation.students.repositories.UserJpaRepository;

@Service
public class UserServiceImpl implements UserService {

    private final UserJpaRepository repo;

    public UserServiceImpl(UserJpaRepository repo) {
	this.repo = repo;
    }

    @Override
    public void create(UserCreateDto dto) {
	User user = new User();
	user.setFirstname(dto.getFirstname());
	user.setLastname(dto.getLastname());
	user.setBirthdate(dto.getBirthdate());
	user.setActive(dto.isActive());
	repo.save(user);
    }

    @Override
    public void delete(Long id) {
	repo.deleteById(id);
    }

    @Override
    public Object findById(Long id) {
	return repo.findById(id);
    }

    @Override
    public List<User> findAllActiveUsers(boolean active) {
	return repo.getAllActiveUsers(active);
    }

    @Override
    public void update(@Valid UserUpdateDto user) {
	User userToUpdate = new User();
	userToUpdate.setId(user.getId());
	userToUpdate.setFirstname(user.getFirstname());
	userToUpdate.setBirthdate(user.getBirthdate());
	userToUpdate.setLastname(user.getLastname());
	userToUpdate.setActive(user.isActive());
	repo.saveAndFlush(userToUpdate);
    }
}
