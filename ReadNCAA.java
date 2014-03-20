import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;

public class ReadNCAA {

	private static int teamsAdded = 0;

	public static ArrayList<Team> south = new ArrayList<Team>();
	public static ArrayList<Team> east = new ArrayList<Team>();
	public static ArrayList<Team> west = new ArrayList<Team>();
	public static ArrayList<Team> midWest = new ArrayList<Team>();
	public static ArrayList<Team> teams = new ArrayList<Team>();

	public static void main(String[] args)  throws FileNotFoundException {
		Scanner reader = new Scanner(new File("ncaa2014.csv"));

		while (reader.hasNextLine()) {
			String next = reader.nextLine();
			String[] values = next.split(",");

			if (values.length > 1) {
				Team t = new Team(values[0], Integer.parseInt(values[1]), Double.parseDouble(values[2]));
				teamsAdded++;				
				if(teamsAdded <= 16){
					south.add(t);
				}else if(teamsAdded > 16 && teamsAdded <= 32){
					east.add(t);
				}else if(teamsAdded > 32 && teamsAdded <= 48){
					west.add(t);
				}else if(teamsAdded > 48 && teamsAdded <= 64){
					midWest.add(t);
				}


			}

			for (String s : values) {
				System.out.print(s + " ");
			}
			Bracket.probability(teams);

		}
	}

}
