package com.bootcoding.match.service;

import com.bootcoding.match.model.Match;
import com.bootcoding.match.utils.IdGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MatchService
{
    @Autowired
    TeamService teamService;

//    public Match createMatch()
//    {
//        Match match = new Match();
//        match.setId(IdGenerator.getId());
////        match.setTeams(teamService.buildTeam());
//
//    }
}
