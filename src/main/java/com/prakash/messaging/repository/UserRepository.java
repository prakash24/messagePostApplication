package com.prakash.messaging.repository;

import org.springframework.data.repository.CrudRepository;

import com.prakash.messaging.model.User;

public interface UserRepository extends CrudRepository<User, Integer> {

}