package com.example.mk1.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.mk1.entity.Tasks;

public interface TaskRepository extends JpaRepository<Tasks, Long> {
}