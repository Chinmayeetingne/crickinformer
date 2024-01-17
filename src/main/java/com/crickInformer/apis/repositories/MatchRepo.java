package com.crickInformer.apis.repositories;

import com.crickInformer.apis.entities.Match;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MatchRepo extends JpaRepository<Match,Integer> {
    //match fetch karna chahta hoon
    //provide krr de -- teamHeading

    Optional<Match> findByTeamHeading(String teamHeading);
}
