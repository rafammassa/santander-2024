public class Operadores {
    public static void main(String[] args) {
        String concatenacao;

        concatenacao = 1+1+1+"1";
        System.out.println(concatenacao);

        concatenacao = 1+"1"+1+1; //após a mudança do tipo de variável (string) a concatenação para de somar como operação matemática
        System.out.println(concatenacao);

        concatenacao = 1+"1"+1+"1";
        System.out.println(concatenacao);

        concatenacao = "1"+1+1+1;
        System.out.println(concatenacao);

        concatenacao = "1"+(1+1+1);
        System.out.println(concatenacao);

        //negação

        int numero = 5;
        System.out.println(-numero);
        System.out.println(numero);
        System.out.println(--numero);
        System.out.println(numero);

        numero = - numero;
        System.out.println(numero);

        numero = numero * -1;
        System.out.println(numero);

        //incremento de número
        numero++;
        System.out.println(numero); //se o ++ vier depois, o número é impresso e depois incrementado

        boolean variavel = true;
        System.out.println(!variavel);
    }
}