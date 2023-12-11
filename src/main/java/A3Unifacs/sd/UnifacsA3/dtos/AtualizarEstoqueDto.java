package A3Unifacs.sd.UnifacsA3.dtos;


import jakarta.validation.constraints.NotNull;

public record AtualizarEstoqueDto(@NotNull Long estoque_id ,  String nome_estoque, Long quantidade ) {
}
