import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class Bracket {

	private ArrayList<Team> teams = new ArrayList<Team>();
	private Team a;
	private Team b;
	private Random r;

	public Bracket() {
		r = new Random();
	}

	public static double probability(ArrayList<Team> teams) {
		double pab = 0;

		for(int i = 0; i < teams.size(); i++){
			Team a = teams.get(i);
			Team b = teams.get(i + 1);
	
			double pa = a.wp();
			double pb = b.wp();
	
			double pai = pa - (pa * pb);
			double pao = pa + pb - (2*pa*pb);
			pab = pai/pao;

			System.out.println(pab);
		}

		return pab;
	}

	public Team play(Team a, Team b) {
		ArrayList<Team> tw = new ArrayList<Team>();
		double win = r.nextDouble();
		if ((win * 100) > probability(tw)) {
			return a;
		} else {
			return b;
		}
	}
}
