package com.natanalexandre.todosimple.TodoSimple.repositories;

import com.natanalexandre.todosimple.TodoSimple.models.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {


    List<Task> findByUser_Id(Long userId);
}
