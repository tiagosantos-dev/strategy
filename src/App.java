import java.util.Scanner;

import domain.Frete;
import enuns.TipoFrete;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Integer response = null;

        System.out.println("Informe o tipo de Frete");
        System.out.print("(0)NORMAL (1)PAC (2)SEDEX ?");
        response = scanner.nextInt();
        
        Frete frete = TipoFrete.values()[response].obterFrete();
      
        System.out.println( frete.calcularFrete(2000L));
        scanner.close();
    }
}
