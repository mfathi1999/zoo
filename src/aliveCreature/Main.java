package aliveCreature;

import javax.swing.border.EmptyBorder;

//class test1{
//    private int ab = 2 ;
//    void pr()
//    {
//        System.out.println("BIB");
//    }
//
//}
//class test2 extends test1{
//    @Override
//    void pr() {
//        super.pr();
//    }
//}
public class Main {

    public static void main(String[] args) {
	// write your code here
	//test
//        System.out.println("Hello mmad!");
//        test2 t = new test2();
//        t.pr();b
//        Emberizidae z1 = new Emberizidae("lemon");

        Emberizidae z1 = new Emberizidae(1,1,1,1,1,1,"lemon",1,1);
        z1.breathing();
        z1.fly();
        z1.layingEggs();
//        z1.layingEggs();
        z1.mating();
        z1.migrate();
//        z1.migrate();
        z1.move();
        z1.nutrition();
        z1.seedEater();
        z1.signing();
    }
}
