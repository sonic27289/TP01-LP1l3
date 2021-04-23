import java.util.Scanner;

public class TP01ex10 {
//Gabriel Kenji Utiyama CB3012069
//Gustavo Barbosa da Silva CB3010627

/* 10. Entrar via teclado com o valor de uma temperatura em graus Celsius, calcular e
exibir sua temperatura equivalente em Fahrenheit.*/

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        double c, f;
        
        System.out.print("Digite o valor de graus em celcius: "  );
        c = Double.parseDouble(ler.nextLine());
        
    
        f = (1.8 * c) + 32;


        
        System.out.printf(c + "C e igual a "+  f + "F");
        
    }
    
}
