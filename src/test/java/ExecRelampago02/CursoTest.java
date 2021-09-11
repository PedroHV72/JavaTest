package ExecRelampago02;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CursoTest {

    @Test
    void deveRetornarNomesAlunosTurmas() {
        Curso curso = new Curso();
        Turma turma1 = new Turma(new Disciplina("Teste de Software"));
        Turma turma2 = new Turma(new Disciplina("Web Sites Dinâmicos"));
        Aluno aluno1 = new Aluno("Pedro");
        Aluno aluno2 = new Aluno("Henrique");
        turma1.matricular(aluno1);
        turma1.matricular(aluno2);
        curso.adicionarTurma(turma1);
        curso.adicionarTurma(turma2);

        List<String> alunos = Arrays.asList("Pedro", "Henrique");

        assertEquals(alunos, curso.getTodosNomesAlunosTurma());
    }

    @Test
    void deveRetornarNomesProfessoresComTurma() {
        Professor professor = new Professor("Marco");
        Professor professor2 = new Professor("Tássio");
        Turma turma1 = new Turma(new Disciplina("Teste de Software"));
        Turma turma2 = new Turma(new Disciplina("Web Sites Dinâmicos"));
        turma1.setProfessor(professor);
        turma2.setProfessor(professor2);
        Curso curso = new Curso();
        curso.adicionarTurma(turma1);
        curso.adicionarTurma(turma2);

        List<String> professores = Arrays.asList("Marco", "Tássio");

        assertEquals(professores, curso.getTodosNomesProfessores());
    }

    @Test
    void deveExcluirTurmaCurso() {
        Curso curso = new Curso();
        Turma turma = new Turma(new Disciplina("Laboratório de Empreendedorismo"));
        curso.adicionarTurma(turma);

        assertTrue(curso.verificarTurmaCurso(turma));
        assertTrue(curso.excluirTurma(turma));
        assertFalse(curso.verificarTurmaCurso(turma));
        assertEquals(0, curso.getQuantidadeTurmas());
    }

    @Test
    void deveExcluirAlunoCurso() {
        Curso curso = new Curso();
        Aluno aluno = new Aluno("Pedro");
        curso.adicionarAluno(aluno);

        assertTrue(curso.excluirAluno(aluno));
    }

    @Test
    void deveRetornarNomesAlunosCurso() {
        Curso curso = new Curso();
        Aluno aluno1 = new Aluno("Pedro");
        Aluno aluno2 = new Aluno("Henrique");
        curso.adicionarAluno(aluno1);
        curso.adicionarAluno(aluno2);

        List<String> alunos = Arrays.asList("Pedro", "Henrique");

        assertEquals(alunos, curso.getNomesAlunosCurso());
    }

    @Test
    void deveRetornarVerdadeiroTurmaCurso() {
        Curso curso = new Curso();
        Turma turma = new Turma(new Disciplina("Web Sites Dinâmicos"));
        curso.adicionarTurma(turma);

        assertTrue(curso.verificarTurmaCurso(turma));
    }

    @Test
    void deveRetornarFalsoTurmaCurso() {
        Curso curso = new Curso();
        Turma turma = new Turma(new Disciplina("Web Sites Dinâmicos"));

        assertFalse(curso.verificarTurmaCurso(turma));
    }

    @Test
    void deveRetornarVerdadeiroAlunoCurso() {
        Curso curso = new Curso();
        Aluno aluno = new Aluno("Pedro");
        curso.adicionarAluno(aluno);

        assertTrue(curso.verificarAlunoCurso(aluno));
    }

    @Test
    void deveRetornarFalsoAlunoCurso() {
        Curso curso = new Curso();
        Aluno aluno = new Aluno("Pedro");

        assertFalse(curso.verificarAlunoCurso(aluno));
    }

}
