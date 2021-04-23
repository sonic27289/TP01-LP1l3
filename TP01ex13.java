import java.util.Scanner;
class TP01ex13
{
    //Gabriel Kenji Utiyama CB3012069
    //Gustavo Barbosa da Silva CB3010627
    
    /*13. Calcular e exibir a velocidade final (em km/h) de um automóvel, a partir dos
valores da velocidade inicial (em m/s), da aceleração (m/s2) e do tempo de percurso
(em s) que serão digitados.*/
   
    public static void main(String[] args) 
    {
        double velocidadeInicial, aceleracao, tempo, velocidadeFinal ;
        
        velocidadeInicial = 0;
        aceleracao = 0;
        tempo = 0;
        Scanner ler = new Scanner(System.in);  
 
        System.out.println("Informe o valor da Velocidade Inicial {em m/s}: \n");
        velocidadeInicial = Double.parseDouble(ler.nextLine());
        System.out.println("Informe o valor da Aceleração {em m/s2}:  \n");
        aceleracao = Double.parseDouble(ler.nextLine());
        System.out.println("Informe o valor do Tempo do Percurso {em s}: \n");
        tempo = Double.parseDouble(ler.nextLine());
        velocidadeFinal = velocidadeInicial + (aceleracao * tempo);
        System.out.println("A velocidade final do veiculo é: " + velocidadeFinal + " km/h");
    }
}


