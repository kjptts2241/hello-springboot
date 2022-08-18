package com.example.hello;

import com.example.hello.domain.TbFood;
import com.example.hello.domain.TbSearch;
import com.example.hello.service.food.FoodService;
import com.example.hello.service.search.SearchService;
import com.example.hello.utils.MovieApi;
import com.example.hello.web.dto.FoodSaveRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@RequiredArgsConstructor
@Controller
public class indexController {

    private final SearchService searchService;
    private final FoodService foodService;

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/search")
    public String search() {
        return "search";
    }

    @GetMapping("/searchlist")
    public String searchList(Model model) {
        List<TbSearch> list = searchService.findAll();
        model.addAttribute("slist", list);
        return "searchlist";
    }

    @GetMapping("/foodlist")
    public String foodList(Model model) {
        List<TbFood> list = foodService.findAll();
        model.addAttribute("flist", list);
        return "foodlist";
    }

    @GetMapping("/foodrand")
    public String foodRand(Model model) {
        TbFood tbFood = foodService.findFoodRand();
        model.addAttribute("foodrand", tbFood);
        return "foodrand";
    }

    @GetMapping("/movie")
    public String movie(Model model) {
        List<String> movielist = MovieApi.movieApi();
        model.addAttribute("movielist", movielist);
        return "movie";
    }
}
