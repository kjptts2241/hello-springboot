package com.example.hello.service.movie;

import com.example.hello.utils.MovieApi;
import com.google.gson.Gson;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.configurationprocessor.json.JSONArray;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class MovieService {

    public List<String> movieList() {

        String json = new Gson().toJson(MovieApi.movieApi());
        System.out.println(json);
        return MovieApi.movieApi();
    }
}
