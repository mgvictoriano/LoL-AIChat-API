package tech.mgaia.LoLChat.domain.model;

public record Champions(
        Long id,
        String name,
        String role,
        String imageUrl) {
}
