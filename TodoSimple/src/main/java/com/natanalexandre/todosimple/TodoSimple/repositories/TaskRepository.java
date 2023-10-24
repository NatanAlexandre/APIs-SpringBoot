package com.natanalexandre.todosimple.TodoSimple.repositories;

import com.natanalexandre.todosimple.TodoSimple.models.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {



}
