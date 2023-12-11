package A3Unifacs.sd.UnifacsA3.dtos;

import jakarta.validation.constraints.NotBlank;

public record ClienteDto(@NotBlank String nome_cliente, @NotBlank String cpf) {

}
