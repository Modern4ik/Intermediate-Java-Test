import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {
        ToyMachine toyMachine = new ToyMachine();

        toyMachine.addToyToMachine(new Toy("Мячик", 35, 75.5));
        toyMachine.addToyToMachine(new Toy("Плюшевый Медведь", 10, 35.0));
        toyMachine.addToyToMachine(new Toy("Машинка", 5, 15.0));

        ArrayList<Toy> wonToys = new ArrayList<>();

        for (int i = 0; i < 5; i++){
            wonToys.add(toyMachine.tryToWinToy());
        }

        Saver.saveToTxt(wonToys);
    }
}
