package br.com.ordensservico.aberturaordensservico.Service;

import org.springframework.stereotype.Service;
import br.com.ordensservico.model.Setor;
import br.com.ordensservico.repository.SetorRepository;

@Service
public class SetorService {

    private final SetorRepository SetorRepository;

    public SetorService(SetorRepository setorRepository) {
        this.setorRespository = setorRepository;
    }

    public Setor cadastrar (Setor setor) {
        return setorRepository.save(setor);
    }
}