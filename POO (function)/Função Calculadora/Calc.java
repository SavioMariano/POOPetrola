public class Calculadora {
    public static void main(String[] args) {
        Calc();
    }
    public static void Calc(){
        System.out.println("Olá, bem vindo a calculadora aléatoria do PP");
        System.out.println("Os numeros e operadores são aléatorio");
        double num1 =(double) (Math.random()* 12 + 1); double num2 = (double) (Math.random()* 12 +1);
        int escolha = (int) (Math.random() * 4 + 1);
        
        if(escolha == 1){
            System.out.println("Resultado:\n" + (num1+num2));
        }else if(escolha == 2){
            System.out.println("Resultado:\n"+ (num1-num2));
        }else if (escolha == 3){
            System.out.println("Resultado:\n"+ (num1*num2));
        }else if (escolha == 4){
            System.out.println("Resultado:\n"+ (num1/num2));
        }else{
            System.out.println("opcão inválida");
        }
    }
 }

