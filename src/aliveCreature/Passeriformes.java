package aliveCreature;

public class Passeriformes extends Birds {
    int syrinx; // سوتک

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

    public void signing() {
        if(syrinx == 1)
            System.out.println("singing from Ebi");

        else
            System.out.println("can't singing");


    }
}
