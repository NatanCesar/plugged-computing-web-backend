package br.com.ufpb.computacaoplugada.ComputacaoPlugadaBackend.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Data
@Entity
public class UserResponse {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @ManyToOne
    private User user;

    private long questionId;

    @JsonFormat(pattern = "dd-MM-yyyy")
    private LocalDate responseDate;

    private String faseQuestion;

    private Integer numberQuestion;

}
