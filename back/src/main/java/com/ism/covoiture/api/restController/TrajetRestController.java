package com.ism.covoiture.api.restController;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RequestMapping("trajets")
public interface TrajetRestController {
    @GetMapping("")
    ResponseEntity<?> findAll(@RequestParam(defaultValue = "5") int size,
                              @RequestParam(defaultValue = "0") int page);

    @GetMapping("/search")
    ResponseEntity<?> findAllByDepartDestination(@RequestParam() String depart, @RequestParam() String destination);
}
