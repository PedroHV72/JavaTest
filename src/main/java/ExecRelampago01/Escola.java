package ExecRelampago01;

public class Escola {
    private String nome;
    private Professor diretor;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Professor getDiretor() {
        return diretor;
    }

    public void setDiretor(Professor diretor) {
        this.diretor = diretor;
    }

    public String getDescricaoEscolaridadeDiretor() {
        if (this.diretor == null) {
            return "Escola sem diretor";
        }
        else {
            return this.diretor.getDescricaoEscolaridade();
        }
    }
}


