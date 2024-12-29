package com.gokdemir.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gokdemir.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}
