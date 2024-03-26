package tech.mgaia.LoLChat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import tech.mgaia.LoLChat.application.ListChampionsUseCase;
import tech.mgaia.LoLChat.domain.ports.ChampionsRepository;

@SpringBootApplication
public class LoLChatApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoLChatApplication.class, args);
	}

	@Bean
	public ListChampionsUseCase provideListChampionsUseCase(ChampionsRepository championsRepository) {
		return new ListChampionsUseCase(championsRepository);
	}

}
