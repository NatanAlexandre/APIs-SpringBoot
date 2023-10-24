package com.natanalexandre.todosimple.TodoSimple.repositories;


import com.natanalexandre.todosimple.TodoSimple.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
