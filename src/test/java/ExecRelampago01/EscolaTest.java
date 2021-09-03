package ExecRelampago01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EscolaTest {

    @Test
    void deveRetornarDescricaoEscolaridadeDiretor() {
        Professor diretor = new Professor();
        Escolaridade escolaridade = new Escolaridade("Mestrado");
        diretor.setEscolaridade(escolaridade);

        assertEquals("Mestrado", diretor.getDescricaoEscolaridade());
    }

    @Test
    void deveRetornarEscolaSemDiretor() {
        Escola escola = new Escola();

        assertEquals("Escola sem diretor", escola.getDescricaoEscolaridadeDiretor());
    }

}
