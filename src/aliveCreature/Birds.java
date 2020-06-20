package aliveCreature;

public class Birds extends Animal{
    int feather; // پر
    int tip;    //  نوک
    int wing;   //  بال
    int homeotHermy;//خونگرم
    int gizzard;//سنگدان

    Birds(int feather, int tip, int wing, int homeotHermy, int gizzard)
    {
        this.feather = feather;
        this.tip = tip;
        this.wing = wing;
        this.homeotHermy = homeotHermy;
        this.gizzard = gizzard;
    }
    //پرواز
    public void fly()
    {
        if(wing == 1)
        {
            System.out.println("Flying");
        }
        else
        {
            System.out.println("Can't Flaying");
        }
    }
    //تخم گذاری
    public void layingEggs()
    {
        System.out.println("laying Eggs");
    }

    public void migrate() {
        if (wing == 1 && feather == 1)
            System.out.println("Migration done!");

        else if(wing == 1)
            System.out.println("Bats should not migrate due to the spread of the Covid disease");

        else
            System.out.println("Can't be migrate.");
    }
    @Override
    public void move() {
        System.out.println("Moving to position");
    }

    @Override
    public void nutrition() {
        if(tip ==1 && gizzard ==1 && multiCellular == 1)
        {
            System.out.println("Eating seeds");
        }
        else if(tip ==1)
        {
            System.out.println("Eating food such as other birds");
        }
        else
            System.out.println("Can't eat any seed or foods:((");
    }

    @Override
    public void breathing() {
        if(homeotHermy == 1)
            System.out.println("Breathing");
        else
            System.out.println("Can't Breathing because haven't any lungs");
    }

    @Override
    public void mating() {
        if(multiCellular == 1)

            System.out.println("mating !!");
        else
            System.out.println("SingleCellular cant mate");
    }
}
