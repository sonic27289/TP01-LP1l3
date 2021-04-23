import java.util.Scanner;

public class TP01ex06 {
//Gabriel Kenji Utiyama CB3012069
//Gustavo Barbosa da Silva CB3010627

//6. Calcular e exibir a média aritmética de quatro valores quaisquer que serão digitados
    
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double N1, N2, N3, N4, Media;
        
        

        System.out.print("Digite o valor da primeira nota: "  );
        N1 = Double.parseDouble(ler.nextLine());

        System.out.print("Digite o valor da segunda nota: "  );
        N2 = Double.parseDouble(ler.nextLine());

        System.out.print("Digite o valor da terceira nota: "  );
        N3 = Double.parseDouble(ler.nextLine());

       System.out.print("Digite o valor da quarta nota: "  );
        N4 = Double.parseDouble(ler.nextLine());
        
        Media = (N1 + N2 + N3 + N4)/4;
        
        System.out.printf("A media das notas e %.1f %n",  Media);
        
    }
    
}
