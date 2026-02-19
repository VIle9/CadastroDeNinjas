package dev.java10x.cadastrodeninjas.Ninjas;

import org.springframework.web.bind.annotation.*;

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
}
