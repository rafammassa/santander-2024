public class ExemploBreakContinue {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i == 3) {
                continue;  //pula o número
            }
            if (i == 7){
                break;  //interrompe o código
            }
            System.out.println(i);
        }
    }
}
