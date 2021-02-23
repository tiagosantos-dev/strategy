package domain;

import enuns.TipoFrete;

public class SedexStrategy implements Frete{
    TipoFrete tipo;
   
    // public SedexStrategy(TipoFrete tipo) {
    //     this.tipo = tipo;
    // }
    
    @Override
    public Double calcularFrete(Long distancia) {
        return distancia * 3D;
    }

    @Override
    public Boolean tipoFrete() {
        return TipoFrete.SEDEX.equals(tipo);

    }
}
