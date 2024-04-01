package tech.mgaia.LoLChat.adapters.in;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tech.mgaia.LoLChat.application.ListChampionsUseCase;
import tech.mgaia.LoLChat.domain.model.Champion;

import java.util.List;

@RestController
@RequestMapping("/api/champions")
public record ListChampionsRestController(ListChampionsUseCase useCase) {

    @GetMapping
    public List<Champion> findAllChampions() {
        return useCase.findAll();
    }

}
