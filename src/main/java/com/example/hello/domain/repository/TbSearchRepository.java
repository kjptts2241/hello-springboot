package com.example.hello.domain.repository;

import com.example.hello.domain.TbSearch;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface TbSearchRepository extends JpaRepository<TbSearch, Long> {

}

