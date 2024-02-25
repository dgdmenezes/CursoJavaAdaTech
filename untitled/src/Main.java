import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.TextStyle;
import java.util.Arrays;
import java.util.Locale;

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
    // Manipulação de String e Datas
    // Olá, {nome}. Hoje é {dia-da-semana}, BOM DIA.

    nome = "Dante";

        //ISO 8601
        LocalDate hoje = LocalDate.now();
        Locale brasil = new Locale("pt", "BR");
        String diaSemana = hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil);
        String saudacao;
        LocalDateTime agora = LocalDateTime.now();
        if(agora.getHour() >=0 && agora.getHour()<12){
            saudacao = "bom dia";
        }else if(agora.getHour()>=12 && agora.getHour()<18){
            saudacao = "boa tarde";
        }else {
            saudacao = "boa noite";
        }
        // Olá, {nome}. Hoje é {dia-da-semana}, BOM DIA.
        System.out.printf("Olá, %s. Hoje é %s, %s. %n", nome, diaSemana, saudacao.toUpperCase());

    //Laços Numéricos
    int multiplicador;
    for (int i=1; i<=10;i++){
        for (int j=1; j<=10; j++ ){
            System.out.println(j+" x "+i + " = " + j*i);
        }

    }

    // Vetores(Arrays) e Matrizes
    // em java não pode misturar o tipo do array, o tamanho é imutável

    int[] numeros = new int[5];
    String[] letras = {"A","B","D", "D"}; // nesta sintaxe não precisa declara o tamanho do array, mas ele permanece com tamanho fixo
        for (int i=0; i<numeros.length; i++){
            System.out.println(numeros[i]);
        }

        // funções

        saudacao("Dante Gomes", 37);

        int  resultado = soma(1,5);
        System.out.println(resultado);

    }

    public static void saudacao(String nome, int idade){
        System.out.println("Hello, "+ nome + " idade: " + idade);
    }

    public static int soma(int numero1, int numero2){
        int soma = numero1 + numero2;
        return soma;

    }

}