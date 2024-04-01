package tech.mgaia.LoLChat.domain.model;

public record Champion(
        Long id,
        String name,
        String role,
        String lore,
        String imageUrl) {


    public String generateContextByQuestion(String question) {

        return """
                Pergunta: %s
                Nome do Campeão: %S
                Função: %s
                Lore (História): %s
                """.formatted(question, this.name, this.role, this.lore);
    }

}

