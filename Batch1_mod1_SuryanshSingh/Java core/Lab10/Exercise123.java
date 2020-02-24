package Lab10;

public class Exercise123 {
public static void main(String[] args) {
	PowerOF p=(a,b)->Math.pow(a, b);
	System.out.println(p.powerOf(2,2));
	Space sp=(a)->a.replace("", " ").trim();
	
	System.out.println(sp.space("Suryansh"));
	UsrPsw up=(a,b)->(a=="Suryansh" && b=="Damon");
	System.out.println(up.usrpsw("Suryansh", "Damon"));
}
}
interface PowerOF{
	double powerOf(double a,double b);
	
}
interface Space{
	String space(String a);
}
interface UsrPsw{
	boolean usrpsw(String a,String b);
}