package fr.formation.students.services;

import org.springframework.stereotype.Service;

import fr.formation.students.dtos.UserCreateDto;
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

}
