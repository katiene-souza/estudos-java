package com.soulcode.soullib.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.soulcode.soullib.models.Cliente;
import com.soulcode.soullib.models.Emprestimo;
import com.soulcode.soullib.models.Livro;
import com.soulcode.soullib.repositories.ClienteRepository;
import com.soulcode.soullib.repositories.EmprestimoRepository;
import com.soulcode.soullib.repositories.LivroRepository;

@Controller // expor os mapeamentos
public class EmprestimoController {
    @Autowired
    private EmprestimoRepository emprestimoRepository;

    @Autowired
    private ClienteRepository clienteRepository;

    @Autowired
    private LivroRepository livroRepository;

    @GetMapping("/emprestimos")
    public ModelAndView paginaEmprestimos() {
        List<Emprestimo> emprestimos = emprestimoRepository.findAll();
        List<Cliente> clientes = clienteRepository.findAll();
        List<Livro> livros = livroRepository.findAll();

        ModelAndView mv = new ModelAndView("emprestimos");
        mv.addObject("listaEmprestimos", emprestimos);
        mv.addObject("listaClientes", clientes);
        mv.addObject("listaLivros", livros);

        return mv;
    }

    @PostMapping("/emprestimos/create")
    public String createEmprestimo(@RequestParam Integer idCliente, @RequestParam Integer idLivro,
            Emprestimo emprestimo) {
        try {
            Optional<Cliente> clienteOpt = clienteRepository.findById(idCliente);
            Optional<Livro> livroOpt = livroRepository.findById(idLivro);

            // É necessário que cliente e livro existam para que o emprestimo possa ser
            // criado
            if (clienteOpt.isPresent() && livroOpt.isPresent()) {
                Cliente cliente = clienteOpt.get();
                Livro livro = livroOpt.get();

                // O cliente é associado ao emprestimo
                emprestimo.setCliente(cliente);

                // O livro é associado ao empréstimo
                emprestimo.setLivroEmprestado(livro);

                emprestimoRepository.save(emprestimo);
            }
        } catch (Exception ex) {
            return "erro";
        }

        return "redirect:/emprestimos";
    }
}
