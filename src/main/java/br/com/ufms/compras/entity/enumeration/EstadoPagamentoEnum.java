package br.com.ufms.compras.entity.enumeration;

public enum EstadoPagamentoEnum {
    PENDENTE("Pedente"),
    QUITADO("Quitado"),
    CANCELADO("Cancelado");

    String descricao;

    EstadoPagamentoEnum(String descricao){
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
