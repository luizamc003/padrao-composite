package padroesestruturais.composite;

public class Arquivo extends ItemArmazenamento {

    private int tamanho;

    public Arquivo(String descricao, int tamanho) {
        super(descricao);
        this.tamanho = tamanho;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public String getItem() {
        return "Arquivo: " + this.getDescricao() + " - tamanho: " + this.tamanho + "KB\n";
    }

}