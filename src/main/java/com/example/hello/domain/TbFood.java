package com.example.hello.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity
public class TbFood {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 256, nullable = false)
    private String name;

    @Column(length = 11, nullable = false)
    private String img;

    @Builder
    public TbFood(String name, String img) {
        this.name = name;
        this.img = img;
    }

}
