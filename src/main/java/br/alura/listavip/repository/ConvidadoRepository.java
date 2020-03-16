package br.alura.listavip.repository;

import br.alura.listavip.model.Convidado;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ConvidadoRepository extends CrudRepository<Convidado, Long> {

    List<Convidado> findByNome(String nome);
}
