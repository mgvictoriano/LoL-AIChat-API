package tech.mgaia.LoLChat.application;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import tech.mgaia.LoLChat.domain.model.Champions;

import java.util.List;

@SpringBootTest
public class ListChampionsUseCaseIntegrationText {

    @Autowired
    private ListChampionsUseCase listChampionsUseCase;

    @Test
    public void testListChampions() {
        List<Champions> champions = listChampionsUseCase.findAll();
        Assertions.assertEquals(55, champions.size());
    }

}
