package com.bootcoding.match.service;
import com.bootcoding.match.model.Player;
import com.bootcoding.match.utils.CountryNameGenerator;
import com.bootcoding.match.utils.PlayerNameGenerator;
import com.bootcoding.match.utils.PlayerTypeGenerator;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PlayerService
{
    private static final int MAX_LIMIT=11;

    public List<Player> getAllPlayers()
    {
        List<Player> players=new ArrayList<>();
        for (int i=0; i<MAX_LIMIT;i++)
        {
            Player player=buildTeamPlayer();
            players.add(player);
        }
        return players;
    }

    private Player buildTeamPlayer()
    {
        Player player = new Player();
        player.setName(PlayerNameGenerator.getName());
        player.setCountryName(CountryNameGenerator.getCountryName());
        player.setType(PlayerTypeGenerator.getplayerType());
        return player;
    }
}
