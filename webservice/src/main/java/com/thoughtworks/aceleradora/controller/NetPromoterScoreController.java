package com.thoughtworks.aceleradora.controller;

import com.thoughtworks.aceleradora.domain.NetPromoterScore;
import com.thoughtworks.aceleradora.service.NetPromoterScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/net-promoter-score")
public class NetPromoterScoreController {

    private NetPromoterScoreService netPromoterScoreService;

    public NetPromoterScoreController(NetPromoterScoreService netPromoterScoreService) {
        this.netPromoterScoreService = netPromoterScoreService;
    }

    @PostMapping
    public ResponseEntity<?> saveScore(@RequestBody NetPromoterScore score) {
        System.out.println(">>>>>>>>>> " + score.getComments());
        System.out.println(">>>>>>>>>> " + score.getScore());

        return new ResponseEntity<>(HttpStatus.OK);
    }
}
