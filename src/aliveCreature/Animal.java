package aliveCreature;

public abstract class Animal{
    int  multiCellular; //I think this param must be set to 0 or 1
//    private int attribute;  //maybe when draw diagram in visual paradigm this attribute added

    public abstract void move();
    public abstract void nutrition();
    public abstract void breathing();
    public abstract void mating();

}
