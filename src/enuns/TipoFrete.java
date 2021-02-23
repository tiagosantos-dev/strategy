package enuns;

import domain.Frete;
import domain.NormalStrategy;
import domain.PacStrategy;
import domain.SedexStrategy;

public enum TipoFrete {
    NORMAL{
        @Override
        public Frete obterFrete() {
            return new  NormalStrategy();
        }
    },
    PAC{
        @Override
        public Frete obterFrete() {
            return new PacStrategy();
        }
    },
    SEDEX{
        @Override
        public Frete obterFrete() {
            return new SedexStrategy();
        }
    };
  
    public abstract Frete obterFrete();
}
