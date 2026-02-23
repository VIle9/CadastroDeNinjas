package dev.java10x.cadastrodeninjas.Missoes;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/missoes")
public class MissoesController {

    public final MissoesService service;

    public MissoesController(MissoesService service) {
        this.service = service;
    }

    @PostMapping
    public MissoesModel criar(@RequestBody MissoesModel missao){
        return service.criar(missao);
    }

    @GetMapping
    public List<MissoesModel> listar(){
        return service.listar();
    }

    @GetMapping("/{id}")
    public MissoesModel buscarPorId(@PathVariable Long id){
        return service.buscarPorId(id);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id){
        service.deletar(id);
    }
}
