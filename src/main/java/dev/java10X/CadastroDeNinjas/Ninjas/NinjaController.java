package dev.java10X.CadastroDeNinjas.Ninjas;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ninjas")
public class NinjaController {

    private NinjaService ninjaService;

    public NinjaController(NinjaService ninjaService) {
        this.ninjaService = ninjaService;
    }

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
    public NinjaModel criarNinja(@RequestBody NinjaModel ninja){
        return ninjaService.criarNinja(ninja);
    }

    // Mostrar todos os ninjas (READ -> GET)
    @GetMapping("/listar")
    public List<NinjaModel> mostrarTodosNinjas(){
        return ninjaService.listarNinjas();
    }

    // Mostrar ninja por ID (READ -> GET)
    @GetMapping("/listar/{id}")
    public NinjaModel mostrarTodosNinjasPorId(@PathVariable Long id){
        return  ninjaService.listarNinjasPorId(id);
    }


    // Alterar dados dos ninjas (UPDATE -> PUT)
    @PutMapping("/alterarID")
    public String alterarNinjaPorId(){
        return "Alterar ninja por ID";
    }


    // Deletar ninja (DELETE -> DELETE)
    @DeleteMapping("/deletar/{id}")
    public void deletarNinjaPorId(@PathVariable Long id){
        ninjaService.deletarNinjaPorId(id);
    }







}
