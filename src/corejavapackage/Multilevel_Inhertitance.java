package corejavapackage;

class Rachana{
	 void add()
	 {
		 System.out.println("Add");
	 }
	 void sub()
	 {
		 System.out.println("Sub");
	 }

}
class Cherika extends Rachana {
	void mul()
	 {
		 System.out.println("Mul");
	 }
	 void div()
	 {
		 System.out.println("Div");
	 }
	
}
public class Multilevel_Inhertitance extends Cherika{
 void mod()
 {
	 System.out.println("Mod");
 }
	public static void main(String[] args) {
		Multilevel_Inhertitance m1 = new Multilevel_Inhertitance();
		m1.add();
		m1.sub();
		m1.mul();
		m1.div();
		m1.mod();

	}

}
