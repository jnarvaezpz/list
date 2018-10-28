package com.example.list.Musico;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/musico")
public class MusicoController {

    @Autowired
    private MusicoService musicoService;

    @GetMapping("/list")
    public List<String> findAll(){
        return musicoService.findAll()
                .stream()
                .map(Musico::getNombre)
                .collect(Collectors.toList());
    }
}
