import java.io.*;
import java.util.Scanner;

public class Bracket {

	private static Team a = new Team();
	private static Team b = new Team();

	public static double probability() {
		a = teams.next().name();
		b = a.next();

		double pa = a.wp();
		double pb = b.wp();

		double pai = pa - (pa * pb);
		double pao = pa + pb - (2*pa*pb);
		double pab = pai/pao;

		return pab;

	}

}