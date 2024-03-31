
@Tag(name = "Campeões", description = "Endpoint do dominio de Campeões do LoL")
@RestController
@RequestMapping(/Champions)
public record ListChampionsRestController(listChampionsUseCase useCase) {


@GettingMapping
public List<Champion> findAllChampions() {
    return useCase.findAll();
}




}