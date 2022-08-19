package com.example.hello.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity
public class TbUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(length = 100, nullable = false)
    private String email;

    @Column(length = 500, nullable = false)
    private String userpw;

    @Column(length = 100, nullable = false)
    private String name;

    @Builder
    public TbUser(String email, String userpw, String name) {
        this.email = email;
        this.userpw = userpw;
        this.name = name;
    }

}
