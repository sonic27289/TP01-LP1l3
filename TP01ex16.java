import java.util.Scanner;

public class TP01ex16 {
//Gabriel Kenji Utiyama CB3012069
//Gustavo Barbosa da Silva CB3010627
    
/*16. Entrar via teclado com o valor de um �ngulo em graus, calcular e exibir as
seguintes fun��es trigonom�tricas: seno, cosseno, tangente e secante deste �ngulo.
Lembre-se que uma fun��o trigonom�trica trabalha em radianos.*/
    
    public static void main(String[] args) {
       
        Scanner ler = new Scanner(System.in);
        double grau;
        
        System.out.print("Digite o valor do angulo: "  );
        
        grau = Double.parseDouble(ler.nextLine());
        
        double a = Math.toRadians(grau);

        System.out.print("\nA Seno de " + grau + " e " +  Math.sin(a) );
        System.out.print("\nA Coseno de " + grau + " e " +  Math.cos(a));
        System.out.print("\nA Tangente de " + grau + " e " + Math.tan(a));
        System.out.print("\nA Secante de " + grau + " e " + (1/Math.cos(a)) + "\n");
    }
    
}