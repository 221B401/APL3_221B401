public class Main
{
	public static void main(String[] args) {
	    Two t=new Two(1);
	}
}

// Initiall it will throw an error constructor One in class One cannot be applied to given types;
// Two(int x){

// This issue can be solved by using super(x) in class two constructor. then the output issue
// In Class One
// In Class Two