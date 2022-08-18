package com.example.hello.web.dto;

import com.example.hello.domain.TbSearch;
import lombok.*;

@Getter
@NoArgsConstructor
public class SearchSaveRequestDto {

    private int id;
    private String search;

    @Builder
    public SearchSaveRequestDto(String search) {
        this.search = search;
    }

    public TbSearch toEntity() {
        return TbSearch.builder()
                .search(search)
                .build();
    }
}
