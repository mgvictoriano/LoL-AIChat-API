package tech.mgaia.LoLChat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import tech.mgaia.LoLChat.application.AskChampionUseCase;
import tech.mgaia.LoLChat.application.ListChampionsUseCase;
import tech.mgaia.LoLChat.domain.ports.ChampionsRepository;
import tech.mgaia.LoLChat.domain.ports.GenerativeAiService;

@EnableFeignClients
@SpringBootApplication
public class LoLChatApplication {

    public static void main(String[] args) {
        SpringApplication.run(LoLChatApplication.class, args);
    }

    @Bean
    public ListChampionsUseCase provideListChampionsUseCase(ChampionsRepository championsRepository) {
        return new ListChampionsUseCase(championsRepository);
    }

    @Bean
    public AskChampionUseCase provideAskChampionUseCase(ChampionsRepository repository,
                                                        GenerativeAiService service) {
        return new AskChampionUseCase(repository, service);
    }

}
