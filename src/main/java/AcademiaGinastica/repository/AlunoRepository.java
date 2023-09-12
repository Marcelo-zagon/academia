package AcademiaGinastica.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import AcademiaGinastica.entity.Aluno;

@Repository
public interface AlunoRepository  extends JpaRepository <Aluno, Long> {
}
