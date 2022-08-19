package com.example.hello.service.search;

import com.example.hello.domain.TbSearch;
import com.example.hello.domain.repository.TbSearchRepository;
import com.example.hello.utils.NaverApiSearch;
import com.example.hello.web.dto.NewsApiReponseDto;
import com.example.hello.web.dto.NewsApiReponseInfoDto;
import com.example.hello.web.dto.SearchSaveRequestDto;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.rmi.CORBA.ValueHandler;
import javax.transaction.Transactional;
import java.util.Arrays;
import java.util.List;

@RequiredArgsConstructor
@Service
public class SearchService {

    private final TbSearchRepository tbSearchRepository;
    private final ObjectMapper mapper;

    @Transactional
    public Long save(SearchSaveRequestDto requestDto) {
        String result = tbSearchRepository.findSearch(requestDto.getSearch());
        if (result == null) {
            Long searchCheck = tbSearchRepository.save(requestDto.toEntity()).getId();
            return searchCheck;
        } else {
            Long searchCheck = tbSearchRepository.saveCnt(requestDto.getSearch());
            return searchCheck;
        }
    }

    public List<TbSearch> findAll() {
        return tbSearchRepository.findAll();
    }

    public List<NewsApiReponseDto> news(SearchSaveRequestDto requestDto) throws JsonProcessingException {
        NewsApiReponseInfoDto dto = mapper.readValue(NaverApiSearch.newsApi(requestDto.getSearch()), NewsApiReponseInfoDto.class);
        List<NewsApiReponseDto> dtos = dto.getItems();
        //return NaverApiSearch.newsApi(requestDto.getSearch());
        return dtos;
    }

}
