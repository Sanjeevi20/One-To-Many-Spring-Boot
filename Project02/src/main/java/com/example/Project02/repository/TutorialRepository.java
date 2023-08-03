package com.example.Project02.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Project02.model.Tutorial;
// import com.example.Project02.model.Tutorial;

public interface TutorialRepository extends JpaRepository<Tutorial, Long> {
    
}