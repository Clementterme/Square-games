package com.example.demo.model;

import com.example.demo.service.GameCatalog;
import fr.le_campus_numerique.square_games.engine.GameFactory;
import fr.le_campus_numerique.square_games.engine.tictactoe.TicTacToeGameFactory;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;

@Service
public class GameCatalogImpl implements GameCatalog {

    private final Collection<GameFactory> gameFactories;

    public GameCatalogImpl() {

        this.gameFactories = List.of(
                new TicTacToeGameFactory()
        );
    }

    @Override
    public Collection<String> getGamesId() {

        return gameFactories.stream()
                .map(GameFactory::getGameFactoryId)
                .toList();
    }
}