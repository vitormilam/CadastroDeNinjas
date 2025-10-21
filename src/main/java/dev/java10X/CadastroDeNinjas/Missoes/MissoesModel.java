package dev.java10X.CadastroDeNinjas.Missoes;


import com.fasterxml.jackson.annotation.JsonIgnore;
import dev.java10X.CadastroDeNinjas.Ninjas.NinjaModel;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity // Entity ele transforma uma classe em uma entidade do BD
@Table(name = "tb_missoes")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class MissoesModel {

    // Variáveis
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String nomeMissao;

    private char dificuldadeMissao;

    // Uma missão tem vários ninjas
    @OneToMany(mappedBy = "missoes")
    @JsonIgnore
    private List<NinjaModel> ninjas;


}
