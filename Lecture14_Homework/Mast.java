package Lecture14_Homework;

public class Mast {
    public static void main(String[] args) {
        try{
            try {
                int x = 2 / 0;
                System.out.println(x);
            }catch (Exception e){
                System.out.println("Внимание возникла ошибка:" + e);
            }
            LowerClass.addException();
        } catch (Exception e){
            System.out.println("Внимание возникла ошибка:" + e) ;
        } finally {
            System.out.println("Сообщение из всегда выполняемой части.");
        }
    }
}
