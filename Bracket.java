import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;

public class Bracket {


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
}
