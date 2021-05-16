package com.udaan.project.repositories;

import com.udaan.project.entities.QuestionEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuestionRepositories extends JpaRepository<QuestionEntity, Long> {
}
