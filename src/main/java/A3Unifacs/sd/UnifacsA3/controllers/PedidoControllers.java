package A3Unifacs.sd.UnifacsA3.controllers;




import A3Unifacs.sd.UnifacsA3.dtos.PedidoDto;
import A3Unifacs.sd.UnifacsA3.model.Pedido;
import A3Unifacs.sd.UnifacsA3.repositories.PedidoRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PedidoControllers {

    @Autowired
    private PedidoRepository repository;


    @PostMapping("/cadastrarpedido")
    @Transactional
    public void cadastrar(@RequestBody @Valid PedidoDto dados){
            repository.save(new Pedido(dados));

    }
    @GetMapping("/listarpedido")
    public List<Pedido> listar() {
        return repository.findAll();
    }


    @DeleteMapping("/excluirpedido/{id}")
    @Transactional
    public void excluir(@RequestBody @PathVariable Long id){
        repository.deleteById(id);
    }



}
