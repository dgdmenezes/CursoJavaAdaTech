//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        int maximo =100;

        System.out.printf("Hello and welcome!\n");

        for (int i = 1; i <= maximo; i++) {
            if (i%2 == 0){
                System.out.println(i + " é par");
            }
            else{
                System.out.println(i + " é ímpar");
            }

        }
    }
}