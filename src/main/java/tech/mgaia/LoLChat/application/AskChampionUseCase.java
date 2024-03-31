package tech.mgaia.LoLChat.application;

import tech.mgaia.LoLChat.domain.model.Champion;
import tech.mgaia.LoLChat.domain.ports.ChampionsRepository;

import java.util.List;


public record ListChampionsUseCase(ChampionsRepository repository) {

    public String askChampion(Long idChampion, String question) {

        Champion Champion = repository.findById(idChampion).orElseThrow(() -> new ChampionNotFoundException(idChampion));

        return champion.generateContextByQuestion(question);
    }


}
