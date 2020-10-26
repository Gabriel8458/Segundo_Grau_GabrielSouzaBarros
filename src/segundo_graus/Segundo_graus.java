package segundo_graus;
import java.util.Scanner;

public class Segundo_graus {

    public static void main(String[] args) {
        Scanner entrada;
        double A, B, C, delta = 0, bquad, x1, x2, raizd;
        
        entrada = new Scanner(System.in);
        
        System.out.print("Digite o valor de a: ");
        A = entrada.nextDouble();
        System.out.print("Digite o valor de b: ");
        B = entrada.nextDouble();
        System.out.print("Digite o valor de c: ");
        C = entrada.nextDouble();
        
        if (A!=0){
            bquad = Math.pow(B, 2);
            delta = bquad-4*A*C;
        }
        
        if(delta>0){
            raizd=Math.sqrt(delta);
         x1=(-B+raizd)/(2*A);
         x2=(-B-raizd)/(2*A);
         
         System.out.print("As raízes da sua equação são: "+x1);
         System.out.println(" e "+x2);
        }
        
        else{
         System.out.println("A equação não possui resultados reais.");
        }
        

    }
    
}
