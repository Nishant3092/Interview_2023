package com.nishant.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nishant.model.User;




@Repository("userRepository")
public interface UserRepository extends JpaRepository<User,Long> {

	User findByEmail(String email);
}
