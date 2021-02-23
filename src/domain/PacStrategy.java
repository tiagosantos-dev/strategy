package domain;

import enuns.TipoFrete;

public class PacStrategy implements Frete {
    TipoFrete tipo;
   
    // public PacStrategy(TipoFrete tipo) {
    //     this.tipo = tipo;
    // }

    @Override
    public Double calcularFrete(Long distancia) {
        return distancia + 50D;

    }

    @Override
    public Boolean tipoFrete() {
        return TipoFrete.PAC.equals(tipo);
    }
}
