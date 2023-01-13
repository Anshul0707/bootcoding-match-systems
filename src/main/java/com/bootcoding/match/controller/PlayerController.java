package com.bootcoding.match.controller;
import com.bootcoding.match.model.Player;
import com.bootcoding.match.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PlayerController
{
    @Autowired
    PlayerService playerService;

    @GetMapping("/getAllPlayers")
    public List<Player> getAllPlayers()
    {
    return playerService.getAllPlayers();
    }


    @GetMapping("/player/{name}")
    public Player getPlayerName(@PathVariable("name") String name)
    {
     List<Player> allPlayer = playerService.getAllPlayers();
        for(Player player : allPlayer)
        {
            if(player.getName().equals(name))
            {
                return player;
            }
        }
        return null;
    }

    @GetMapping("/rest/player/get/{id}")
    public Player getEmployeeByID(@PathVariable("id") int id)
    {
        List<Player> allPlayer = playerService.getAllPlayers();
        for(Player player : allPlayer)
        {
            if(player.getName().equals(id))
            {
                return player;
            }
        }
        return null;
    }


    //build create/update player..
    @PostMapping("/createPlayer")
    public Player createPlayer(@RequestBody Player player) {
        return player;
    }

    //delete player by name..
    @DeleteMapping("/player/delete/{name}")
    public Player deletePlayerByName(@PathVariable("name") String name)
    {

        return  null;
    }

}
