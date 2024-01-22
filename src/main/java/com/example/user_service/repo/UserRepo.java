package com.example.user_service.repo;

import com.example.user_service.entity.Userssz;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo  extends JpaRepository<Userssz,Long> {
    Userssz findByUserId(Long userid);
}
