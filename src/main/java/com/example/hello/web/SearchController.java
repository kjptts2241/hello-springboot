package com.example.hello.web;

import com.example.hello.service.search.SearchService;
import com.example.hello.web.dto.SearchSaveRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RequiredArgsConstructor
@RestController
public class SearchController {

    private final SearchService searchService;

    @PostMapping("/api/v1/search")
    public Long save(@RequestBody SearchSaveRequestDto requestDto) {
        return searchService.save(requestDto);
    }

//    @GetMapping("/api/v1/searchlist")
//    public List<TbSearch> searchList() {
//        return searchService.findAll();
//    }

    @PostMapping("/api/v1/news")
    public String news(@RequestBody SearchSaveRequestDto requestDto) {
        return searchService.news(requestDto);
    }
}
