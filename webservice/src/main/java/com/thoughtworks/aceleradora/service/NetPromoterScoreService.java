package com.thoughtworks.aceleradora.service;

import com.thoughtworks.aceleradora.repository.NetPromoterScoreRepository;
import org.springframework.stereotype.Service;

@Service
public class NetPromoterScoreService {

    private NetPromoterScoreRepository repository;

    public NetPromoterScoreService (NetPromoterScoreRepository repository){
        this.repository = repository;
    }

}