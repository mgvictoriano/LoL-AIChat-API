package tech.mgaia.LoLChat.domain.exception;

public class ChampionNotFoundException extends RuntimeException {

    public ChampionNotFoundException(Long idChampion) {
        super("Champion %d not found.".formatted(idChampion));
    }
}