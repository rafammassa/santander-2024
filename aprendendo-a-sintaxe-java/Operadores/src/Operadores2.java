public class Operadores2 {
    public static void main(String[] args) {
        int a,b;

        a = 5;
        b = 6;
        String resultado;

        if (a == b) {
            resultado = "verdadeiro";
        } else {
            resultado = "falso";
        }
        System.out.println(resultado);

        a = 6;
        String resultado2 = a==b ?"verdadeiro":"falso"; //forma resumida do ex acima
        System.out.println(resultado2);

        //operadores relacionais
        int numero1, numero2;
        numero1 = 1;
        numero2 = 2;

        if (numero1 > numero2){
            System.out.println("Número 1 > Número 2");
        }
        if (numero1 < numero2){
            System.out.println("Número 1 < Número 2");
        }

        boolean simNao = numero1 == numero2;
        System.out.println("São iguais? " + simNao);

        simNao = numero1 != numero2;
        System.out.println("São diferentes? " + simNao);

        String nome1 = "Rafaella";
        String nome2 = new String("Rafaella");
        System.out.println(nome1==nome2);
        System.out.println(nome1.equals(nome2));

        //E (&&) e OU (||)
        boolean condition1 = true;
        boolean condition2 = false;

        if (condition1 && condition2){
            System.out.println("As duas condições são verdadeiras!");
        } else if (condition1 || condition2) {
            System.out.println("Uma das condições é verdadeira!");
        } else {
            System.out.println("As condições são falsas!");
        }
    }
}
