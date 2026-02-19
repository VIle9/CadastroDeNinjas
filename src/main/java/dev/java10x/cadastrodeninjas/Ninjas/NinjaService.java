package dev.java10x.cadastrodeninjas.Ninjas;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NinjaService {

    private final NinjaRepository repository;

    public NinjaService(NinjaRepository repository) {
        this.repository = repository;
    }

    // Criar ninja
    public NinjaModel salvar(NinjaModel ninja){
        return repository.save(ninja);
    }

    // Listar todos os ninjas
    public List<NinjaModel> listar(){
        return repository.findAll();
    }

    // Buscar por id
    public NinjaModel buscarPorId(Long id){
        return repository.findById(id).orElseThrow(() ->new RuntimeException("Ninja não encontrado!"));
    }

    public void deletar(Long id){
        repository.deleteById(id);
    }

}
