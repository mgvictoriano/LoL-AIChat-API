package tech.mgaia.LoLChat.domain.ports;

import tech.mgaia.LoLChat.domain.model.Champions;

import java.util.List;
import java.util.Optional;

public interface ChampionsRepository {

    List<Champions> findAll();

    Optional<Champions> findById(Long id);
}
