package dev.java10x.cadastrodeninjas.Missoes;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MissoesService {

    public final MissoesRepository repository;

    public MissoesService(MissoesRepository repository) {
        this.repository = repository;
    }

    public MissoesModel criar(MissoesModel missao){
        return repository.save(missao);
    }

    public List<MissoesModel> listar(){
        return repository.findAll();
    }

    public MissoesModel buscarPorId(Long id){
        return repository.findById(id).orElseThrow(() -> new RuntimeException("Missão não encontrada"));
    }

    public void deletar(Long id){
        repository.deleteById(id);
    }
}
