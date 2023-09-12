package AcademiaGinastica.controller;

import AcademiaGinastica.service.impl.MatriculaServiceImpl;
import AcademiaGinastica.entity.Matricula;
import AcademiaGinastica.entity.form.MatriculaForm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import javax.validation.Valid;
import java.util.List;
@RestController
@RequestMapping("/matriculas")
public class MatriculaController {

    @Autowired
    private MatriculaServiceImpl service;

    @PostMapping
    public Matricula create(@Valid @RequestBody MatriculaForm form) {
        return service.create(form);
    }

    @GetMapping
    public List<Matricula> getAll() {
        return service.getAll( );
    }

}
