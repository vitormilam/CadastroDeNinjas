package dev.java10X.CadastroDeNinjas.Ninjas;
import dev.java10X.CadastroDeNinjas.Missoes.MissoesModel;
import jakarta.persistence.*;

import java.util.List;


@Entity // Entity ele transforma uma classe em uma entidade do BD
@Table(name = "tb_cadastro_de_ninjas") // Define o nome da tabela
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

    // Construtores
    NinjaModel(){

    }

    NinjaModel(String nome, String email, int idade){
        this.nome = nome;
        this.email = email;
        this.idade = idade;
    }

    // Getters & Setters
    public String getNome(){
        return nome;
    }

    public String getEmail(){
        return email;
    }

    public int getIdade(){
        return idade;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }


}
