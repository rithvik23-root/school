package com.school.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.school.entity.Questions;
@Repository
public interface QuestionsRepository extends JpaRepository<Questions,Long> {

}
