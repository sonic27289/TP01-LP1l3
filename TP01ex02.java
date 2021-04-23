import java.util.Scanner;

public class TP01ex02 {
//Gabriel Kenji Utiyama CB3012069
//Gustavo Barbosa da Silva CB3010627
    
//2. Calcular e exibir a área de um quadrado, a partir do valor de sua aresta que será digitado.
    
    public static void main(String[] args) 
    {
        Scanner ler = new Scanner(System.in);
        double L, area;
        
        

        System.out.print("Digite o valor da aresta do quadrado: "  );
        L = Double.parseDouble(ler.nextLine());
        
        area = L*L;
        System.out.printf("A area do quadrado e %.1f metros quadrados",  area);
        
    }
    
}
