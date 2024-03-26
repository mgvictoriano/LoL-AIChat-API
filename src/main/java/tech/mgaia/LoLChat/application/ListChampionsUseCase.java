package tech.mgaia.LoLChat.application;

import tech.mgaia.LoLChat.domain.model.Champions;
import tech.mgaia.LoLChat.domain.ports.ChampionsRepository;

import java.util.List;


public record ListChampionsUseCase(ChampionsRepository championsRepository) {

    public List<Champions> findAll() {
        return championsRepository.findAll();
    }


}
