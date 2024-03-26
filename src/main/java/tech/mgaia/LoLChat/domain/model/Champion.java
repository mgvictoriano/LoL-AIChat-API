package tech.mgaia.LoLChat.domain.model;

public record Champion(
        Long id,
        String name,
        String role,
        String imageUrl) {
}
