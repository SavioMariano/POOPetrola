public class Calc {
    public static void Soma(int x,int y){
        System.out.println( x+y );
}
    public static void Subtração(int x, int y){
        System.out.println(x-y);
}
    public static void Divisão(double x, double y){
        System.out.println(x/y);
}
    public static void Multiplicação(int x, int y){
        System.out.println(x*y);
}
    public static void main(String[] args) {
        System.out.println("Olá, bem vindo a calculadora aléatoria do PP");
        System.out.println("Os numeros e operadores são aléatorio");
        int num1 =(int) (Math.random()* 12 + 1); int num2 = (int) (Math.random()* 12 +1);
        int escolha = (int) (Math.random() * 4 + 1);
        switch (escolha) {
            case 1:
        Soma(num1,num2);
        break;
            case 2:
        Subtração(num1,num2);
        break;
            case 3:
        Divisão(num1,num2);
        break;
            case 4:
        Multiplicação(num1, num2);
        break;  
    
        }
    }
}
