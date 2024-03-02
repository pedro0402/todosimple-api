package com.example.todosimple.repositories;

import java.util.List;
import java.util.Optional;

import com.example.todosimple.models.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.swing.text.html.Option;

public interface TaskRepository extends JpaRepository<Task, Long> {
    List<Task> findByUser_Id(Long id);
//    -> nessa função o nome não pode ser
//    trocado, se não, não vai funcionar;

//    @Query(value = "SELECT t FROM Task t where t.user.id = :id")
//    List<Task> xyz(@Param("id") Long id);

//    @Query(value = "SELECT * FROM task t WHERE t.user_id = :id", nativeQuery = true)
//    List<Task> xyz(@Param("id") Long id);
}
