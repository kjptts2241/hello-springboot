package com.example.hello.web.dto;

import com.example.hello.domain.TbFood;
import com.example.hello.domain.TbSearch;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class FoodSaveRequestDto {

    private int id;
    private String name;
    private String img;

    @Builder
    public FoodSaveRequestDto(String name, String img) {
        this.name = name;
        this.img = img;
    }

    public TbFood toEntity() {
        return TbFood.builder()
                .name(name)
                .img(img)
                .build();
    }
}
