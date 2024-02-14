package br.com.ufpb.computacaoplugada.ComputacaoPlugadaBackend.repository;


import br.com.ufpb.computacaoplugada.ComputacaoPlugadaBackend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
