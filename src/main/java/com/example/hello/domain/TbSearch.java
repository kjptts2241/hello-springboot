package com.example.hello.domain;

import lombok.*;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity
public class TbSearch {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 500, nullable = false)
    private String search;

    @Column(nullable = false)
    private int cnt;

    @Builder
    public TbSearch(String search) {
        this.search = search;
    }
}
