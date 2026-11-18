package padroesestruturais.composite;

public class SistemaArquivos {

    private ItemArmazenamento armazenamento;

    public void setArmazenamento(ItemArmazenamento armazenamento) {
        this.armazenamento = armazenamento;
    }

    public String getArmazenamento() {
        if (this.armazenamento == null) {
            throw new NullPointerException("Computador sem arquivos");
        }
        return this.armazenamento.getItem();
    }
}