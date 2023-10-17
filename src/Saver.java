import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Saver {
    public static void saveToTxt(ArrayList<Toy> won){
        try(FileWriter fileWriter = new FileWriter("WonRes.txt", false)){
            for (Toy toy : won){
                fileWriter.write(toy.getToyName() + "\n");
            }
        }catch (IOException exc){
            System.out.println("Ошибка записи в файл!");
        }
    }
}
