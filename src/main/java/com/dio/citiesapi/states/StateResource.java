package com.dio.citiesapi.states;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/states")
public class StateResource {

    @Autowired
    private StateRepository stateRepository;

    @GetMapping
    public Page<State> states(Pageable page) {
        return stateRepository.findAll(page);
    }
}
