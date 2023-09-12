package AcademiaGinastica.controller;

import AcademiaGinastica.entity.AvaliacaoFisica;
import AcademiaGinastica.entity.form.AvaliacaoFisicaForm;
import AcademiaGinastica.service.impl.AvaliacaoFisicaServiceImpl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/avaliacoes")
public class AvaliacaoFisicaController {


    @Autowired
    private AvaliacaoFisicaServiceImpl service;

    @PostMapping
    public AvaliacaoFisica create(@RequestBody AvaliacaoFisicaForm form) {
        return service.create(form);
    }


}
