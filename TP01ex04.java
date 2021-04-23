import java.util.Scanner;

public class TP01ex04 {
//Gabriel Kenji Utiyama CB3012069
//Gustavo Barbosa da Silva CB3010627

//4. A partir dos valores da base e altura de um triângulo, calcular e exibir sua área.
    
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double b, h, area;
        
        

        System.out.print("Digite a base do triangulo: "  );
        b = Double.parseDouble(ler.nextLine());

        System.out.print("Digite a altura do triangulo: "  );
        h = Double.parseDouble(ler.nextLine());

        
        area = (b*h)/2;
        
        System.out.printf("A area do triangulo e %.1f metros quadrados",  area);
        
    }
    
}
