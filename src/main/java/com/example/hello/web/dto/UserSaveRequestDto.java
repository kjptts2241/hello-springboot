package com.example.hello.web.dto;

import com.example.hello.domain.TbSearch;
import com.example.hello.domain.TbUser;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;


@Getter
@NoArgsConstructor
public class UserSaveRequestDto {

    private int id;
    private String email;
    private String userpw;
    private String name;

    @Builder
    public UserSaveRequestDto(String email, String userpw, String name) {
        this.email = email;
        this.userpw = userpw;
        this.name = name;
    }

    public TbUser toEntity() {
        return TbUser.builder()
                .email(email)
                .userpw(userpw)
                .name(name)
                .build();
    }
}
