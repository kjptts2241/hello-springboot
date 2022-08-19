package com.example.hello.web.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class MovieApiReponseDto {

    private String link;
    private String title;

    public MovieApiReponseDto(String link, String title) {
        this.link = link;
        this.title = title;
    }

}
