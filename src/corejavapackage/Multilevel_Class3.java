package corejavapackage;//Assignment 32

public class Multilevel_Class3 extends Multilevel_Class2{
	void mod1()
	 {
		 System.out.println("Mod");
	 }

	public static void main(String[] args) {
		Multilevel_Class3 m1 = new Multilevel_Class3();
		m1.add1();
		m1.sub1();
		m1.div1();
		m1.mul1();
		m1.mod1();
	}

}
