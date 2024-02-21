import java.util.Arrays;

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

        //Operadores Boolean
        boolean boleano = true;
        boleano = false;

        System.out.println("O boleano foi: " + boleano);
        //Recomendação do Java é usar CamelCase
        boolean fimDeSemana = true;
        boolean fazendoSol = true;
        boolean vamosAPraia = fimDeSemana && fazendoSol;

        System.out.println("Vamos à praia? " + vamosAPraia);

        //Tabela da Verdade
        //Operador && (and)
        //true && true = true
        //false && true = false
        //true && false = false
        //false && false = false

        //Operador || (or)
        //true  || true = true
        //false || true = true
        //true  || false = true
        //false || false = false

        // Ternário

        String mensagem = fimDeSemana?"É fim de semana": "Não é fim de semana";
        // argumentação ? executa a 1ª condição se True:executa a 2ª condição se False

        // Estruturas condicionais

        int nota = 70;
        int media = 70;

        if (nota >=media){
            System.out.println("Aluno tirou nota " + nota +" Está aprovado, pois é maior ou igual a" + media);
        }else{
            System.out.println("Aluno tirou nota " + nota + " Menor do que" + media + " logo está reprovado");
        }

        String graduacao = " ";
        // A 80, B 70, C 60, D 0

        if (nota >= 80){
            graduacao = "A";
        } else if (nota<80 && nota>=70) {
            graduacao = "B";
        } else if (nota<70&&nota>=60) {
            graduacao = "C";
        } else if (nota < 60 && nota >=0) {
            graduacao = "D";
        }else {
            graduacao = null;
        }

        System.out.println("Nota tirada :" + nota + " Logo Graduação " + graduacao);

        switch (graduacao){
            case "A":
            case "B":
                System.out.println("Aluno aprovado");
                break;
            case "C":
            case "D":
                System.out.println("Aluno reprovado");
                break;
            default:
                System.out.println("Nota inválida");
        }


    }
}