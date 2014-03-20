import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;

public class Bracket {


	public static double probability(ArrayList<Team> teams) {
		Team a = teams.next().name();
		Team b = teams.next();

		double pa = a.wp();
		double pb = b.wp();

		double pai = pa - (pa * pb);
		double pao = pa + pb - (2*pa*pb);
		double pab = pai/pao;

		System.out.println(pab);
		return pab;

	}

}
