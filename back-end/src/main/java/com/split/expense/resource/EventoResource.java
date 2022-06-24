package com.split.expense.resource;

import com.split.expense.domain.Evento;
import com.split.expense.repository.EventoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/eventos")
public class EventoResource {

    @Autowired
    private EventoRepository eventoRepository;

    @RequestMapping(method = RequestMethod.GET)
    public List<Evento> listar(){

        return eventoRepository.findAll();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Optional<Evento> buscar(@PathVariable("id") Long id){

        return eventoRepository.findById(id);
    }

}
