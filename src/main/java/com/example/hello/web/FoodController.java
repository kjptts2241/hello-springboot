package com.example.hello.web;

import com.example.hello.domain.TbFood;
import com.example.hello.service.food.FoodService;
import com.example.hello.web.dto.FoodSaveRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class FoodController {

    private FoodService foodService;

    @PostMapping("/api/v1/foodsave")
    public Long foodSave(@RequestBody FoodSaveRequestDto requestDto) {
        return foodService.save(requestDto);
    }
}
