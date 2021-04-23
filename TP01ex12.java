import java.util.Scanner;

public class TP01ex12 {
//Gabriel Kenji Utiyama CB3012069
//Gustavo Barbosa da Silva CB3010627
    
/* 12. Calcular e exibir o volume de um cone a partir dos valores da altura e do raio da
base que serão digitados. */

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        double volC, h, r;
        
        System.out.print("Digite o valor da altura do cone: "  );
        h = Double.parseDouble(ler.nextLine());
        
       
        System.out.print("Digite o valor do raio da base: "  );
        r = Double.parseDouble(ler.nextLine());
           


        volC = (Math.PI * Math.pow(r,2) * h)/3;
        
        System.out.printf("O volume do cone e de %.1f %n",  volC);
        
    }
    
}
