package com.bootcoding.match.controller;
import com.bootcoding.match.model.Player;
import com.bootcoding.match.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class PlayerController
{
    @Autowired
    PlayerService playerService;

//    @GetMapping("/player")
//    public List<Player> getAllPlayers()
//    {
//    return playerService.getAllPlayers();
//    }




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
}
