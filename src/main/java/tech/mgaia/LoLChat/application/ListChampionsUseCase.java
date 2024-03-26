package tech.mgaia.LoLChat.application;

import tech.mgaia.LoLChat.domain.model.Champion;
import tech.mgaia.LoLChat.domain.ports.ChampionsRepository;

import java.util.List;


public record ListChampionsUseCase(ChampionsRepository championsRepository) {

    public List<Champion> findAll() {
        return championsRepository.findAll();
    }


}
