package com.steven.events.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.steven.events.models.EventUser;

@Repository
public interface UserRepository extends CrudRepository<EventUser, Long>{
	EventUser findByEmail(String email);
}