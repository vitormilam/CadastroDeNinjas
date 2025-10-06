package dev.java10X.CadastroDeNinjas.Ninjas;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
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

}
