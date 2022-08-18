package com.example.hello.service.food;

import com.example.hello.domain.TbFood;
import com.example.hello.domain.repository.TbFoodRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class FoodService {

    private final TbFoodRepository tbFoodRepository;

    public TbFood findFoodRand() {
        return tbFoodRepository.findFoodRand();
    }
}
