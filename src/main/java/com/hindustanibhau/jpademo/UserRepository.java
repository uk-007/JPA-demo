package com.hindustanibhau.jpademo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {
    //we don't write public class userRepository implements JPARepository {} because we dont have to implement methods of JPARepository
    //hibernate is doing that for us
}
