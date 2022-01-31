package com.steven.events.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.steven.events.models.Event;

public interface EventRepository extends CrudRepository<Event, Long>{
	List<Event> findByState(String state);
	List<Event> findByStateIsNot(String state);
}