package A3Unifacs.sd.UnifacsA3.controllers;

import A3Unifacs.sd.UnifacsA3.dtos.AtualizarEstoqueDto;
import A3Unifacs.sd.UnifacsA3.dtos.EstoqueDto;
import A3Unifacs.sd.UnifacsA3.model.Estoque;
import A3Unifacs.sd.UnifacsA3.repositories.EstoqueRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EstoqueControllers {

    @Autowired
    private EstoqueRepository repository;


    @PostMapping("/cadastrarestoque")
    @Transactional
    public void cadastrar(@RequestBody @Valid EstoqueDto dados) {
        repository.save(new Estoque(dados));

    }

    @GetMapping("/listarestoque")
    public List<Estoque> listar() {
        return repository.findAll();
    }

    @PutMapping("/atualizarestoque")
    @Transactional
    public void atualizar(@RequestBody @Valid AtualizarEstoqueDto dados) {
        var estoque = repository.getReferenceById(dados.estoque_id());
        estoque.atualizarEstoque(dados);

    }

    @DeleteMapping("/excluirestoque/{id}")
    @Transactional
    public void excluir(@RequestBody @PathVariable Long id) {
        repository.deleteById(id);
    }


}
