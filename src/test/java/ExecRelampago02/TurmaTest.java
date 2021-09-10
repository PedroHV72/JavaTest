package ExecRelampago02;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TurmaTest {

    @Test
    void deveRetornarNomeProfessorTurma() {
        Turma turma = new Turma(new Disciplina("Teste de Software"));
        Professor professor = new Professor("Marco");
        turma.setProfessor(professor);

        assertEquals("Marco", turma.getNomeProfessor());
    }

    @Test
    void deveRetornarTurmaSemProfessor() {
        Turma turma = new Turma(new Disciplina("Teste de Software"));

        assertEquals("Turma sem professor", turma.getNomeProfessor());
    }

    @Test
    void deveExcluirAlunoTurma() {
        Turma turma = new Turma(new Disciplina("Web Sites Dinâmicos"));
        Aluno aluno = new Aluno("Pedro");
        turma.matricular(aluno);

        assertTrue(turma.excluirAluno(aluno));
    }

    @Test
    void deveRetornarVerdadeiroAlunoTurma() {
        Turma turma = new Turma(new Disciplina("Web Sites Dinâmicos"));
        Aluno aluno = new Aluno("Marco");
        turma.matricular(aluno);

        assertTrue(turma.verificarAlunoTurma(aluno));
    }

    @Test
    void deveRetornarFalsoAlunoTurma() {
        Turma turma = new Turma(new Disciplina("Web Sites Dinâmicos"));
        Aluno aluno = new Aluno("Marco");

        assertFalse(turma.verificarAlunoTurma(aluno));
    }
}
