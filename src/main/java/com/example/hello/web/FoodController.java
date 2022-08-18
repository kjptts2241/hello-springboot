package com.example.hello.web;

import com.example.hello.domain.TbFood;
import com.example.hello.service.food.FoodService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class FoodController {

    private FoodService foodService;

    @GetMapping("/api/v1/randfood")
    public TbFood randFood() {
        return foodService.findFoodRand();
    }

}
