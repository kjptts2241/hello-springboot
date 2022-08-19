package com.example.hello.domain.repository;

import com.example.hello.domain.TbUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface TbUserRepository extends JpaRepository<TbUser, Long> {

    @Query(value = "SELECT * FROM `tb_user` WHERE email = ? AND userpw = ?", nativeQuery = true)
    public TbUser findUser(String email, String userpw, String name);

}
