package aliveCreature;

public class Emberizidae extends Passeriformes{
    int conicalBeak; // منقار مخروطی
    String species; // گونه

    Emberizidae(int feather, int tip, int wing, int homeotHermy, int gizzard, int syrinx, String species) {
        super(feather, tip, wing, homeotHermy, gizzard, syrinx);
        this.species = species;
    }

//    public Emberizidae(String lemon) {
//        super();
//    }
//    String name;

    @Override
    public void fly() {
        super.fly();
    }

    @Override
    public void layingEggs() {
        super.layingEggs();
    }

    @Override
    public void migrate() {
        super.migrate();
    }

    @Override
    public void move() {
        super.move();
    }

    @Override
    public void nutrition() {
        super.nutrition();
    }

    @Override
    public void breathing() {
        super.breathing();
    }

    @Override
    public void mating() {
        super.mating();
    }

    @Override
    public void signing() {
        super.signing();
    }

    public void seedEater()
    {
        if(conicalBeak == 1)
            System.out.println("Eating seed with conical beak");
        else
            System.out.println("Can't eat any seed");
    }
}
