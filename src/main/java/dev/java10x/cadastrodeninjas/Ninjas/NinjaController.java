package dev.java10x.cadastrodeninjas.Ninjas;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ninjas")
public class NinjaController {

    private final NinjaService service;

    public NinjaController(NinjaService service) {
        this.service = service;
    }

    @PostMapping
    public NinjaModel criar(@RequestBody NinjaModel ninja) {
        return service.salvar(ninja);
    }

    @GetMapping
    public List<NinjaModel> listar(){
        return service.listar();
    }

    @GetMapping("/{id}")
    public NinjaModel buscarPorId(@PathVariable Long id){
        return service.buscarPorId(id);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id){
        service.deletar(id);
    }
}
