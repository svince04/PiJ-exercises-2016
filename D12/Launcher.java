public class Launcher {
    public static void main(String[] args){
		Launcher launcher = new Launcher();
		launcher.launch();
	}
	
	public void launch() {
		//System.out.println("Give me a string and I will calculate its hash code");
		//String str = System.console().readLine();
		//int hash = str.hashCode();
		int hash = 10;
		int smallHash = HashUtilities.shortHash(hash);
		System.out.println("0 < " + smallHash + " < 1000");
	}
}
		