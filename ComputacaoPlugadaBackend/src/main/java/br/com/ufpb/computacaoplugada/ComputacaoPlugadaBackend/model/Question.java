package br.com.ufpb.computacaoplugada.ComputacaoPlugadaBackend.model;
import jakarta.persistence.*;
import lombok.Data;


@Data
@Entity
public class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;


}
