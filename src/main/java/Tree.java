import java.time.LocalDate;

public class Tree {
    private WoodSpecy specy;
    private float size;
    private int number;
    private int age;
    private LocalDate lastPrune;

    public Tree(WoodSpecy specy) {
        this.specy = specy;
    }

    public Tree(WoodSpecy specy, float size, int number) {
        this.specy = specy;
        this.size = size;
        this.number = number;
    }

    public WoodSpecy getSpecy() {
        return specy;
    }

    public void setSpecy(WoodSpecy specy) {
        this.specy = specy;
    }

    public float getSize() {
        return size;
    }

    public void setSize(float size) {
        this.size = size;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public LocalDate getLastPrune() {
        return lastPrune;
    }

    public void setLastPrune(LocalDate lastPrune) {
        this.lastPrune = lastPrune;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public LocalDate nextCut() {
        if (lastPrune == null) {
            throw new IllegalStateException("The last prune should be filled");
        }
        return lastPrune.plusYears(2);
    }

    public void prune() {
        lastPrune = LocalDate.now();
    }

    @Override
    public String toString() {
        return "Tree{" +
                "specy=" + specy +
                ", size=" + size +
                ", number=" + number +
                ", age=" + age +
                ", lastPrune=" + lastPrune +
                '}';
    }
}
