package com.example.hello.service.movie;

import com.example.hello.utils.MovieApi;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class MovieService {

    public List<String> movieList() {
        return MovieApi.movieApi();
    }
}
