package com.bootcoding.match.service;
import com.bootcoding.match.model.Team;
import com.bootcoding.match.utils.CountryNameGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;


@Service
public class TeamService
{
    @Autowired
    PlayerService playerService;

    private static final int MAX_LIMIT=2;

    public List<Team> getAllTeam()
   {
    ArrayList<Team> teams=new ArrayList<>();
       for (int i=0; i<MAX_LIMIT;i++)
       {
           Team team=buildTeam();
           teams.add(team);
       }
       return teams;
   }

    public Team buildTeam()
    {
        Team team = new Team();
        team.setTeamName(CountryNameGenerator.getCountryName());
        team.setPlayers(playerService.getAllPlayers());
        return  team;
    }
}
