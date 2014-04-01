public class Simulator {
	
	private static final int SIMULATIONS = 1000;

	public static void main(String[] args) {
		Game bracket = new Game();
		bracket.simulate(SIMULATIONS);
		bracket.printResults(SIMULATIONS);
	}
}
