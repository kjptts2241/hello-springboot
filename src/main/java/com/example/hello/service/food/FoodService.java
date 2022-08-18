package com.example.hello.service.food;

import com.example.hello.domain.TbFood;
import com.example.hello.domain.repository.TbFoodRepository;
import com.example.hello.web.dto.FoodSaveRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@RequiredArgsConstructor
@Service
public class FoodService {

    private final TbFoodRepository tbFoodRepository;

    public TbFood findFoodRand() {
        return tbFoodRepository.findFoodRand();
    }

    public List<TbFood> findAll() {
        return tbFoodRepository.findAll();
    }

    @Transactional
    public Long save(FoodSaveRequestDto requestDto) {
        return tbFoodRepository.save(requestDto.toEntity()).getId();
    }
}
