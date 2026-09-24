import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner Recebe = new Scanner(System.in);
        
        System.out.println("Cálculos com dois números");
        System.out.println("Primeiro N°: ");
        double n1m = Recebe.nextDouble();
        
        System.out.println("Operação (| + | - | * | / | ^ | sqrt |)");
        String Op = Recebe.next();
        
        System.out.println("Segundo N°: ");
        double n2m = Recebe.nextDouble();
        
       if(Op.equals("sqrt")){
            double Res1 = Math.sqrt(n1m);
            double Res2 = Math.sqrt(n2m);
            System.out.println("A primeira raíz é: " + Res1);
            System.out.println("A segunda raíz é: " + Res2);
       }
        else{
            if(Op.equals("+")){
                double resultado = n1m+n2m;
              System.out.println("A soma gerou: " + resultado);
            }
            else if (Op.equals("-")){
                double resultado = n1m-n2m;
                System.out.println("A subtração gerou: " + resultado);
            } 
            else if (Op.equals("*")){
                double resultado = n1m*n2m;
                System.out.println("A multiplicação gerou: " + resultado);
            } 
            else if (Op.equals("/")){
                double resultado = n1m/n2m;
                System.out.println("A divisão gerou: " + resultado);
            } 
            else if (Op.equals("^")){
                double resultado = Math.pow(n1m, n2m);
                System.out.println("A potência é: " + resultado);
            } 
        }
        
        
        Recebe.close();
        
    }
}
