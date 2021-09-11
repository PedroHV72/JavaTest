package ExecRelampago02;

import java.util.ArrayList;
import java.util.List;

public class Curso {

    private List<Turma> turmas;
    private List<Aluno> alunosList;

    public Curso() {
        this.turmas = new ArrayList<Turma>();
        this.alunosList = new ArrayList<Aluno>();
    }

    public void adicionarTurma(Turma turma) {
        this.turmas.add(turma);
    }

    public List<String> getTodosNomesProfessores() {
        List<String> professores = new ArrayList<String>();

        for (Turma turma : this.turmas) {
            if (!turma.getNomeProfessor().equals("Turma sem professor")) {
                professores.add(turma.getNomeProfessor());
            }
        }
        return professores;
    }

    public List<String> getTodosNomesAlunosTurma() {
        List<String> alunos = new ArrayList<String>();
        for (Turma turma : turmas) {
            alunos.addAll(turma.getNomesAlunos());
        }
        return alunos;
    }

    public boolean excluirTurma(Turma turma) {
        return this.turmas.remove(turma);
    }

    public boolean excluirAluno(Aluno aluno) {
        return this.alunosList.remove(aluno);
    }

    public void adicionarAluno(Aluno aluno) {
        this.alunosList.add(aluno);
    }

    public List<String> getNomesAlunosCurso() {
        List<String> alunos = new ArrayList<String>();
        for (Aluno aluno : this.alunosList) {
            alunos.add(aluno.getNome());
        }
        return alunos;
    }

    public List<String> getNomesAlunosTurmas() {
        List<String> alunos = new ArrayList<String>();
        for (Turma turma : turmas) {
            alunos.addAll(turma.getNomesAlunos());
        }
        return alunos;
    }

    public boolean verificarAlunoCurso(Aluno aluno) {
        return this.alunosList.contains(aluno);
    }

    public boolean verificarTurmaCurso(Turma turma) {
        return this.turmas.contains(turma);
    }

    public int getQuantidadeTurmas() {
        return this.turmas.size();
    }

}
