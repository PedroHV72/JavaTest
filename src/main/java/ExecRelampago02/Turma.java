package ExecRelampago02;

import java.util.ArrayList;
import java.util.List;

public class Turma {

    private Professor professor;
    private List<Aluno> alunosList = new ArrayList<Aluno>();

    public Turma(Disciplina Teste_de_Software) {
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public void matricular(Aluno aluno) {
        this.alunosList.add(aluno);
    }

    public List<String> getNomesAlunos() {
        List<String> lista = new ArrayList<String>();
        for (Aluno aluno : this.alunosList) {
            lista.add(aluno.getNome());
        }
        return lista;
    }

    public String getNomeProfessor() {
        if (this.professor == null) {
            return "Turma sem professor";
        }
        return this.professor.getNome();
    }

    public boolean excluirAluno(Aluno aluno) {
        return this.alunosList.remove(aluno);
    }

    public boolean verificarAlunoTurma(Aluno aluno) {
        return this.alunosList.contains(aluno);
    }

}
