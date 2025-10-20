package dev.java10X.CadastroDeNinjas.Ninjas;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ninjas")
public class NinjaController {

    /*
    * Principais Annotations do Spring
    * @GetMapping -> Pegar Informações
    * @PostMapping -> Mandar informações
    * @PutMapping -> Alterar Informações
    * @PatchMapping -> Altera Informações
    * @DeleteMapping -> Deletar as Informações
    *
    * */

    @GetMapping("/")
    public String home(){
        return "Essa é a home do site";
    }

    @GetMapping("/boasvindas")
    public String boasVindas(){
        return  "Boas-vindas";
    }



    // CRUD - Create, Read, Update, Delete

    // Adicionar ninja (CREATE -> POST)
    @PostMapping("/criar")
    public String criarNinja(){
        return "Ninja criado";
    }

    // Mostrar todos os ninjas (READ -> GET)
    @GetMapping("/listar")
    public String mostrarTodosNinjas(){
        return "Mostrar ninja";
    }

    // Mostrar ninja por ID (READ -> GET)
    @GetMapping("/listarID")
    public String mostrarTodosNinjasPorId(){
        return  "Mostrar Ninja por ID";
    }


    // Alterar dados dos ninjas (UPDATE -> PUT)
    @PutMapping("/alterarID")
    public String alterarNinjaPorId(){
        return "Alterar ninja por ID";
    }


    // Deletar ninja (DELETE -> DELETE)
    @DeleteMapping("/deletarID")
    public String deletarNinjaPorId(){
        return "Ninja deletado";
    }







}
