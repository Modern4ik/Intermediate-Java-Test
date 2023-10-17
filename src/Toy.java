public class Toy {

    private int id; // id
    private String name; // имя игрушки
    private int count; // кол-во
    private double chance; // шанс выпадения

    private static int counter;

    {
        this.id = ++counter;
    }

    public Toy(String name, int count, double chance) {
        this.name = name;
        this.count = count;
        this.chance = chance;
    }

    public int getToyId() {
        return this.id;
    }

    public void setToyId(int newId) {
        this.id = newId;
    }

    public String getToyName() {
        return this.name;
    }

    public void setToyName(String newName) {
        this.name = newName;
    }

    public int getToyCount() {
        return this.count;
    }

    public void setToyCount(int newCount) {
        this.count = newCount;
    }

    public double getToyChance() {
        return this.chance;
    }

    public void setToyChance(double newChance) {
        this.chance = newChance;
    }

    @Override
    public String toString(){
        return String.format("ID: %d | Название: \"%s\" | Кол-во: %d | Шанс выпадения: %.1f процентов", 
                                                    this.id, this.name, this.count, this.chance);
    }
}
