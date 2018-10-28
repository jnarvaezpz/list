package com.example.list.Musico;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MusicoService {

    @Autowired
    private MusicoRepository musicoRepository;

    public List<Musico> findAll(){
        return musicoRepository.findAll();
    }

}

