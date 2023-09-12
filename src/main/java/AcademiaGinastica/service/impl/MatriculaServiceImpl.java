package AcademiaGinastica.service.impl;

import AcademiaGinastica.entity.Aluno;
import AcademiaGinastica.entity.Matricula;
import AcademiaGinastica.entity.form.MatriculaForm;
import AcademiaGinastica.repository.AlunoRepository;
import AcademiaGinastica.repository.MatriculaRepository;
import AcademiaGinastica.service.IMatriculaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MatriculaServiceImpl implements IMatriculaService {

    @Autowired
    private MatriculaRepository matriculaRepository;

    @Autowired
    private AlunoRepository alunoRepository;

    @Override
    public Matricula create(MatriculaForm form) {
        Matricula matricula = new Matricula();
        Aluno aluno = alunoRepository.findById(form.getAlunoId()).get();

        matricula.setAluno(aluno);

        return matriculaRepository.save(matricula);
    }

    @Override
    public Matricula get(Long id) {
        return matriculaRepository.findById(id).get();
    }

    @Override
    public List<Matricula> getAll() {
        return null;
    }



    @Override
    public void delete(Long id) {

    }
}
