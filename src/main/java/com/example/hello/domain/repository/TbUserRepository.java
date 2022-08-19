package com.example.hello.domain.repository;

import com.example.hello.domain.TbUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface TbUserRepository extends JpaRepository<TbUser, Long> {

}
