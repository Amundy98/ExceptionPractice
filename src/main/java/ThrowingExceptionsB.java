import java.io.File;
import java.io.IOException;

public class ThrowingExceptionsB {
    public static void main(String[] args) {
        //can handle this exception by adding throws to main method or handling
//        createNewFileRethrow();
        divideByZero();
    }

//    public static void createNewFileRethrow() throws IOException {
//        File file = new File("resources/nonexistent.txt");
//        file.createNewFile();
//        }


        ///exercise
    public static void divideByZero(){
       try{
           int c = 30/0;
       }catch (ArithmeticException e){
           System.out.println("Division is fun.");
       }
    }
}

