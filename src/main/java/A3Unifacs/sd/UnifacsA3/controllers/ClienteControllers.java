package A3Unifacs.sd.UnifacsA3.controllers;


import A3Unifacs.sd.UnifacsA3.dtos.AtualizarClienteDto;
import A3Unifacs.sd.UnifacsA3.dtos.ClienteDto;
import A3Unifacs.sd.UnifacsA3.model.Cliente;
import A3Unifacs.sd.UnifacsA3.repositories.ClienteRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class ClienteControllers {

    @Autowired
    private ClienteRepository repository;

    @PostMapping("/cadastrarcliente")
    @Transactional
    public void cadastrar(@RequestBody @Valid ClienteDto dados) {
        repository.save(new Cliente(dados));
    }

    @GetMapping("/listarcliente")
    public List<Cliente> listar() {
        return repository.findAll();
    }


    @PutMapping("/atualizarcliente")
    @Transactional
    public void atualizar(@RequestBody @Valid AtualizarClienteDto dados) {
        var cliente = repository.getReferenceById(dados.cliente_id());
        cliente.atualizarCliente(dados);

    }

    @DeleteMapping("/excluircliente/{id}")
    @Transactional
    public void excluir(@RequestBody @PathVariable Long id) {
        repository.deleteById(id);
    }

}
