package fr.formation.students.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.formation.students.entities.User;

public interface UserJpaRepository extends JpaRepository<User, Long> {

}
