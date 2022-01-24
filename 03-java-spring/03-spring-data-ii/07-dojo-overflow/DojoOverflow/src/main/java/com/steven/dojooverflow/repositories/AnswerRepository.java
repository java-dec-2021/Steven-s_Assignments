package com.steven.dojooverflow.repositories;

import org.springframework.data.repository.CrudRepository;

import com.steven.dojooverflow.models.Answer;

public interface AnswerRepository extends CrudRepository<Answer, Long>{
	
}