package com.example.hello.domain.repository;

import com.example.hello.domain.TbFood;
import com.example.hello.domain.TbSearch;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface TbSearchRepository extends JpaRepository<TbSearch, Long> {
    @Query(value = "INSERT INTO `tb_search` (`search`) VALUES (?) ON DUPLICATE KEY UPDATE cnt = cnt + 1", nativeQuery = true)
    public Long saveCnt(String search);

    @Query(value = "SELECT `search` FROM `tb_search` WHERE search = ?", nativeQuery = true)
    public String findSearch(String search);

}

