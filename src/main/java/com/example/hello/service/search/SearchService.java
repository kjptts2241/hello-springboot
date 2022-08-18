package com.example.hello.service.search;

import com.example.hello.domain.TbSearch;
import com.example.hello.domain.repository.TbSearchRepository;
import com.example.hello.utils.NaverApiSearch;
import com.example.hello.web.dto.SearchSaveRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@RequiredArgsConstructor
@Service
public class SearchService {

    private final TbSearchRepository tbSearchRepository;

    @Transactional
    public Long save(SearchSaveRequestDto requestDto) {
        String result  = tbSearchRepository.findSearch(requestDto.getSearch());
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

    public String news(SearchSaveRequestDto requestDto) {
        return NaverApiSearch.newsApi(requestDto.getSearch());
    }

}
