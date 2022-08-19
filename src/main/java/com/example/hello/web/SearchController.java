package com.example.hello.web;

import com.example.hello.service.search.SearchService;
import com.example.hello.web.dto.NewsApiReponseDto;
import com.example.hello.web.dto.NewsApiReponseInfoDto;
import com.example.hello.web.dto.SearchSaveRequestDto;
import com.fasterxml.jackson.core.JsonProcessingException;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RequiredArgsConstructor
@RestController
public class SearchController {

    private final SearchService searchService;

    @PostMapping("/api/v1/saveOrNews")
    public List<NewsApiReponseDto> saveOrNews(@RequestBody SearchSaveRequestDto requestDto) throws JsonProcessingException {
        searchService.save(requestDto);
        return searchService.news(requestDto);
    }
}
