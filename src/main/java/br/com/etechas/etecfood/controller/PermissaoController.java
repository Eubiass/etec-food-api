package br.com.etechas.etecfood.controller;

import br.com.etechas.etecfood.entity.Permissao;
import br.com.etechas.etecfood.entity.Usuario;
import br.com.etechas.etecfood.repository.PermissaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import br.com.etechas.etecfood.repository.UsuarioRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@RestController
@RequestMapping("/usuario")
// Classe responsável por gerenciar as requisições relacionadas aos usuários.
public class PermissaoController {

    @Autowired
    // Repositório usado para operações de CRUD com a entidade Usuario
    private PermissaoRepository permissaoRepository;

    @GetMapping
    public List<Permissao> listar(){
            return permissaoRepository.findAll();
        }

    @GetMapping("/{id}")
    public Permissao buscarPorId(@PathVariable Long id){
        var permissao = permissaoRepository.findById(id);
        if(permissao.isPresent())
            return permissao.get();
        return null;
    }
}
