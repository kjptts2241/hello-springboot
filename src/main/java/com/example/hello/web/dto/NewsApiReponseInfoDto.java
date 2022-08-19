package com.example.hello.web.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Getter
@NoArgsConstructor
public class NewsApiReponseInfoDto {

    private Date lastBuildDate;
    private int total;
    private int start;
    private int display;
    private List<NewsApiReponseDto> items;

    public NewsApiReponseInfoDto(Date lastBuildDate, int total, int start, int display, List<NewsApiReponseDto> items)
    {
        this.lastBuildDate = lastBuildDate;
        this.total = total;
        this.start = start;
        this.display = display;
        this.items = items;
    }
}
