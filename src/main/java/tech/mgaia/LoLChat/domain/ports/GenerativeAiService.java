package tech.mgaia.LoLChat.domain.ports;

public interface GenerativeAiService {

    String generateContent(String objective, String context);

}
