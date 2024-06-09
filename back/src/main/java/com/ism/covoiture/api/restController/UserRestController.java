package com.ism.covoiture.api.restController;

import com.ism.covoiture.web.dto.request.UserCreateRequestDto;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("user")
public interface UserRestController {
    @PostMapping("")
    ResponseEntity<?> create(@RequestBody UserCreateRequestDto user);
}
