package com.example.hello.service.user;

import com.example.hello.domain.TbUser;
import com.example.hello.domain.repository.TbUserRepository;
import com.example.hello.web.dto.UserSaveRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class UserService {

    private final TbUserRepository tbUserRepository;

    public TbUser findUser(UserSaveRequestDto requestDto) {
        return tbUserRepository.findUser(requestDto.getEmail(), requestDto.getUserpw(), requestDto.getName());
    }
}
