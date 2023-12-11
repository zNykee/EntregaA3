package A3Unifacs.sd.UnifacsA3.dtos;


import jakarta.validation.constraints.NotNull;

public record AtualizarClienteDto (@NotNull Long cliente_id ,  String nome_cliente, String cpf){
}
