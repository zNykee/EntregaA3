package A3Unifacs.sd.UnifacsA3.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record EstoqueDto(@NotNull Long  quantidade, @NotBlank String nome_estoque) {
}
