package dev.java10X.CadastroDeNinjas.Ninjas;
import dev.java10X.CadastroDeNinjas.Missoes.MissoesModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Entity // Entity ele transforma uma classe em uma entidade do BD
@Table(name = "tb_cadastro_de_ninjas") // Define o nome da tabela
@NoArgsConstructor
@AllArgsConstructor
@Data
public class NinjaModel {

    // Variaveis
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private String email;

    private int idade;

    // Um ninja tem uma única missão
    @ManyToOne
    @JoinColumn(name = "missoes_id") // Foreign Key ou Chave Estrangeira = Serve para conectar duas tabelas diferentes.
    private MissoesModel missoes;




}
