package br.com.ufpb.webBinarios.WebBinariosBackend.repository;


import br.com.ufpb.webBinarios.WebBinariosBackend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface    UserRepository extends JpaRepository<User, Long> {

}
