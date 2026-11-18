package padroesestruturais.composite;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ComputadorTest {

    @Test
    void deveRetornarArmazenamentoComputador() {
        Pasta pasta1 = new Pasta("Downloads");

        Pasta pasta2 = new Pasta("Documentos");
        Arquivo arquivo21 = new Arquivo("curriculo.pdf", 200);
        pasta2.addItem(arquivo21);

        Pasta pasta3 = new Pasta("Faculdade");
        Arquivo arquivo31 = new Arquivo("trabalho.docx", 120);
        Arquivo arquivo32 = new Arquivo("slides.pptx", 800);
        pasta3.addItem(arquivo31);
        pasta3.addItem(arquivo32);

        Pasta armazenamento = new Pasta("Meu Computador");
        armazenamento.addItem(pasta1);
        armazenamento.addItem(pasta2);
        armazenamento.addItem(pasta3);

        SistemaArquivos computador = new SistemaArquivos();
        computador.setArmazenamento(armazenamento);

        assertEquals("Pasta: Meu Computador\n" +
                "Pasta: Downloads\n" +
                "Pasta: Documentos\n" +
                "Arquivo: curriculo.pdf - tamanho: 200KB\n" +
                "Pasta: Faculdade\n" +
                "Arquivo: trabalho.docx - tamanho: 120KB\n" +
                "Arquivo: slides.pptx - tamanho: 800KB\n", computador.getArmazenamento());
    }

    @Test
    void deveRetornarExcecaoComputadorSemArquivos() {
        try {
            SistemaArquivos computador = new SistemaArquivos();
            computador.getArmazenamento();
            fail();
        }
        catch (NullPointerException e) {
            assertEquals("Computador sem arquivos", e.getMessage());
        }
    }
}