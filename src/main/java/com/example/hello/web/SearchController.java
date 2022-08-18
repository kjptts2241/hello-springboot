package com.example.hello.web;

import com.example.hello.domain.TbSearch;
import com.example.hello.service.search.SearchService;
import com.example.hello.web.dto.SearchSaveRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RequiredArgsConstructor
@RestController
public class SearchController {

    private final SearchService searchService;

    @PostMapping("/api/v1/saveOrNews")
    public String saveOrNews(@RequestBody SearchSaveRequestDto requestDto) {
        searchService.save(requestDto);
        return searchService.news(requestDto);
    }
}
