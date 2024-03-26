package tech.mgaia.LoLChat.domain.ports;

import tech.mgaia.LoLChat.domain.model.Champion;

import java.util.List;
import java.util.Optional;

public interface ChampionsRepository {

    List<Champion> findAll();

    Optional<Champion> findById(Long id);
}
