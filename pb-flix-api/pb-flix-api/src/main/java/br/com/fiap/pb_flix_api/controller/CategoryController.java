package br.com.fiap.pb_flix_api.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.fiap.pb_flix_api.model.Category;

@RestController // component
public class CategoryController {
    
    //lstar todas as categorias
    //GET :8080/categories -> jason
    @GetMapping(path = "/categories")    
    public List<Category> index(){
            return List.of(
                new Category(1L, "Ação",""),
                new Category(2L, "Comédia",""),
                new Category(3L, "Terror","")
            );
        }
    //cadatar categoria

    //apagar categoria
    
    //editar categoria

}
