//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        int maximo =20;
        String nome = "Dante";

        System.out.printf("Hello and welcome!\n");
        System.out.printf("Meu nome é "+nome+"\n");

        for (int i = 1; i <= maximo; i++) {
            if (i%2 == 0){
                System.out.println(i + " é par");
            }
            else{
                System.out.println(i + " é ímpar");
            }
        }

        int a;
        int b = 2;
        a = 3;
        int soma = a + b;
        int subtracao = a - b;
        int multiplicacao = a * b;
        float divisao = (float) a / b;



        System.out.println("Soma de a + b é :" +soma);
        System.out.println("Subtração de a - b é :" +subtracao);
        System.out.println("Multiplicação de a x b é :" +multiplicacao);
        System.out.println("Divisao de a / b é :" +divisao);
       }
}