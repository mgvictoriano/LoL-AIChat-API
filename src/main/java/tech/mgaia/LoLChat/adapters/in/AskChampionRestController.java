package tech.mgaia.LoLChat.adapters.in;

import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;
import tech.mgaia.LoLChat.application.AskChampionUseCase;

@Tag(name = "Campeões", description = "Endpoints do domínio de Campeões do LOL.")
@RestController
@RequestMapping("/champions")
public record AskChampionRestController(AskChampionUseCase useCase) {

    @CrossOrigin
    @PostMapping("/{idChampion}/ask")
    public AskChampionResponse askChampion(@PathVariable Long idChampion, @RequestBody AskChampionRequest request) {
        String answer = useCase.askChampion(idChampion, request.question());
        return new AskChampionResponse(answer);
    }

    public record AskChampionRequest(String question) { }
    public record AskChampionResponse(String answer) { }
}
