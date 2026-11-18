package padroesestruturais.composite;

public abstract class ItemArmazenamento {

    private String descricao;

    public ItemArmazenamento(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public abstract String getItem();
}
