package fr.formation.students.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.formation.students.dtos.UserCreateDto;
import fr.formation.students.dtos.UserDto;
import fr.formation.students.dtos.UserGetDto;
import fr.formation.students.dtos.UserUpdateDto;
import fr.formation.students.entities.User;
import fr.formation.students.services.UserService;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService service;

    public UserController(UserService service) {
	this.service = service;
    }

    @PostMapping("/create")
    protected void create(@Valid @RequestBody UserCreateDto user) {
	service.create(user);
    }

    @PutMapping("update/{id}")
    protected void update(@PathVariable("id") Long id, @Valid @RequestBody UserUpdateDto user) {
	service.update(user);
    }

    @DeleteMapping("/deleteUser/{id}")
    protected void delete(@PathVariable("id") Long id) {
	service.delete(id);
    }

    @GetMapping("/get/{id}")
    protected Object getUser(@PathVariable("id") Long id) {
	return service.findById(id); 
    }
    
    @GetMapping("/getAllActive/{active}")
    protected Iterable<User> active(@PathVariable("active") boolean active ) {
	    return service.findAllActiveUsers(active);
	    
	
	
    }
    
    
}
