package padroesestruturais.composite;

import java.util.ArrayList;
import java.util.List;

public class Pasta extends ItemArmazenamento {

    private List<ItemArmazenamento> itens;

    public Pasta(String descricao) {
        super(descricao);
        this.itens = new ArrayList<ItemArmazenamento>();
    }

    public void addItem(ItemArmazenamento item) {
        this.itens.add(item);
    }

    public String getItem() {
        String saida = "";
        saida = "Pasta: " + this.getDescricao() + "\n";
        for (ItemArmazenamento item : itens) {
            saida += item.getItem();
        }
        return saida;
    }
}