package domain;

import enuns.TipoFrete;

public class NormalStrategy implements Frete{
    TipoFrete tipo;

    // public NormalStrategy(TipoFrete tipo) {
    //     this.tipo = tipo;
    // }

    @Override
    public Double calcularFrete(Long distancia) {
     
        return distancia + 10D;
    }
    
    @Override
    public Boolean tipoFrete() {
        return TipoFrete.NORMAL.equals(tipo);
        
    }

 
    
}
