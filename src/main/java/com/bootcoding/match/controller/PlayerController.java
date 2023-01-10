package com.bootcoding.match.controller;
import com.bootcoding.match.model.Player;
import com.bootcoding.match.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PlayerController
{
    @Autowired
    PlayerService playerService;

    @GetMapping("/player")
    public List<Player> getAllPlayers()
    {
    return playerService.getAllPlayers();
    }
}
