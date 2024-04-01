package tech.mgaia.LoLChat.application;

import tech.mgaia.LoLChat.domain.exception.ChampionNotFoundException;
import tech.mgaia.LoLChat.domain.model.Champion;
import tech.mgaia.LoLChat.domain.ports.ChampionsRepository;
import tech.mgaia.LoLChat.domain.ports.GenerativeAiService;


public record AskChampionUseCase(ChampionsRepository repository, GenerativeAiService genAiService) {

    public String askChampion(Long idChampion, String question) {

        Champion champion = repository.findById(idChampion)
                .orElseThrow(() -> new ChampionNotFoundException(idChampion));

        String context = champion.generateContextByQuestion(question);
        String objective = """
                Atue como um assistente com a habilidade de se comportar como os Campeões do League of Legends (LOL).
                Responsa perguntas incorporando a personalidade e estilo de um determinado Campeão.
                Segue a pergunta, o nome do Campeão e sua respectiva lore (história):
                
                """;

        return genAiService.generateContent(objective, context);
    }
}
