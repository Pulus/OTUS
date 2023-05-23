package Lecture6_OtherTask;

public class Task4 {
    public static long getFactorial(byte number) {
        // TODO
        long factor = 1;
        if (number > 0){
            for (int i = 1; i < number+1; i++){
                factor *= i;
                if (factor > Long.MAX_VALUE-(factor/(long)i)){
                    factor = 0;
                    break;
                };
            }

        } else if (number == 0) {
            factor = 1;
        } else {
            factor = 0;
        }
        return factor;
    }

    private Task4() {

    }

    public static void main(String[] args) {
        System.out.println("Факториал от 5 должен равняться 120 - " + Task4.getFactorial((byte) 50));
    }
}