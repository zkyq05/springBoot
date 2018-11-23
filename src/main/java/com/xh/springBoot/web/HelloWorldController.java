package com.xh.springBoot.web;

import com.xh.springBoot.domain.PlayerRepository;
import com.xh.springBoot.domain.PositionRepository;
import com.xh.springBoot.domain.UserRepository;
import com.xh.springBoot.modle.Player;
import com.xh.springBoot.modle.Position;
import com.xh.springBoot.modle.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HelloWorldController {
    @Autowired
    PlayerRepository playerRepository;
    @Autowired
    UserRepository userRepository;
    @Autowired
    PositionRepository positionRepository;

    @RequestMapping("/hello")
    public String index() {
        return "Hello World";
    }
    @RequestMapping("/getUser")
    public List<User> getUser() {
        List<User> page=userRepository.findAll();
        return page;
    }
    @RequestMapping("/getPlayer")
    public List<Player> getPlayer() {
        List<Player> page=playerRepository.findAll();
        return page;
    }
    @RequestMapping("/getPos")
    public List<Position> getPos() {
        List<Position> page=positionRepository.findAll();
        return page;
    }
}
