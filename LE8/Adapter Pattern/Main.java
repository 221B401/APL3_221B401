public class Main
{
	public static void main(String[] args) {
		Crow crow = new IndianCrow();
		CrowAdapter crowadapter = new CrowAdapter(crow); //crow wears swan skin
		client(crowadapter); //Dating Function
	}
	
	public static void client(Swan swan){ //princess class
	    swan.eat(); //eating pearls
	    swan.swim(); //Flying high over the mountains which is a lie
	    swan.sing(); //so what if he doesn't sing nicely, you can't expect everything.....so princess considers crow a a swan
	}
}