package com.home.repository;

import java.util.Random;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.home.model.Users;

public interface UserRepository extends JpaRepository<Users, Integer> {
	
	Random rand= new Random();
	int n = rand.nextInt(10);
	
	
	
	Users findByUsernameAndPassword(String un, String psw);
	
	@Query(value="select hospital_id from users where username=:un and password=:psw",nativeQuery = true)
	
	Integer userIdFind(@Param("un") String un, @Param ("psw") String psw);
	
	
@Query(value="update users set hospital_id=1 where username=:un and password=:psw and hospital.hospital_id=users.user_id",nativeQuery = true)
	
	void hospitalSave(@Param("un") String un, @Param ("psw") String psw);
	
}
