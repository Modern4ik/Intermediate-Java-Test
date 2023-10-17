import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class ToyMachine implements Iterable<Toy> {
    private ArrayList<Toy> toys = new ArrayList<>();

    public void addToyToMachine(Toy toy) {
        this.toys.add(toy);
    }

    public int getToysCount() {
        return this.toys.size();
    }

    public Toy tryToWinToy() {
        Random random = new Random();
        int chanceToWin = random.nextInt(0, 101);

        for (Toy toy : toys) {
            if (chanceToWin > toy.getToyChance()) {
                System.out.printf("Вы выиграли %s, Поздравляем!\n", toy.getToyName());
                toy.setToyCount(toy.getToyCount() - 1);

                return toy;
            }
        }

        Toy wonToy = this.toys.get(toys.size() - 1);
        wonToy.setToyCount(wonToy.getToyCount() - 1);

        return wonToy;
    }

    @Override
    public Iterator<Toy> iterator() {
        return this.toys.iterator();
    }

}
