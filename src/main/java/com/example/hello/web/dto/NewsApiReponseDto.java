package com.example.hello.web.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Date;

@Getter
@NoArgsConstructor
public class NewsApiReponseDto {

    private String title;
    private String originallink;
    private String link;
    private String description;
    private Date pubDate;

    public NewsApiReponseDto(String title, String originallink, String link, String description, Date pubDate) {
        this.title = title;
        this.originallink = originallink;
        this.link = link;
        this.description = description;
        this.pubDate = pubDate;
    }
}
