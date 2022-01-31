package com.steven.events.repositories;

import org.springframework.data.repository.CrudRepository;

import com.steven.events.models.Message;

public interface MessageRepository extends CrudRepository<Message, Long>{

}