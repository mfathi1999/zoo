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
//<<<<<<< HEAD
	// write your code here
	//test
//        System.out.println("Hello mmad!");
//        test2 t = new test2();
//        t.pr();b
//        Emberizidae z1 = new Emberizidae("lemon");
//=======
//
//>>>>>>> da119932cac0b04899b8d55622a08a1176c417e1

        Emberizidae z1 = new Emberizidae(1,1,1,1,1,1,"lemon",1,1);
        System.out.println("yrouz ye zard pare limooee to tabiat migasht");
        System.out.println("ye banoo ro did ye del na sad del asheghesh shod \n ba ham bishatr ashna shodan zar pareh mard barash intori avaz khoond");
        z1.signing();
        System.out.println("ba ham hamnafas shodan intori :|");
        z1.breathing();
        System.out.println("baadesh parvaz kardan ba ham va mohajerat karan canada ba found tahsili :/");
        z1.fly();
        z1.migrate();
        System.out.println("ba ham too kelisa mosalmoona ezdevaj kardan ))");
        z1.mating();
        z1.layingEggs();
        System.out.println("ejareh khonashoon ziad boud raftan kabk");
        z1.move("kabk");
        System.out.println("ba ham ghaza khordan roozegar toolani");
        z1.nutrition();
        System.out.println("dooneh spicel ham mikhordan");
        z1.seedEater();
    }
}
