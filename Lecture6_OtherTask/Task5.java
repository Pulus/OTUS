package Lecture6_OtherTask;

public class Task5 {
    public static int getPrimeNumbersSum(byte lowEdge, byte highEdge) {
        //TODO
        double result = 0;
        int count = 0;
        if ((lowEdge < highEdge) & (lowEdge>0) & (highEdge>0)){
            for (int i = lowEdge; i < highEdge; i++){
                if ((i%2)==0){
                    result += i;
                    count++;
                }
            }
            result = result/count;
        }
        return (int)result;
    }

    private Task5() {

    }

    public static void main(String[] args) {
        System.out.println("avg четных чисел у ряда с 1 до 10 должен равняться 6 - "
                + Task5.getPrimeNumbersSum((byte) 1, (byte) 10));
    }

}