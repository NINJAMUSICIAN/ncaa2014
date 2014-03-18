import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;

public class ReadNCAA {

	public static ArrayList<Team> teams = new ArrayList<Team>();

	public static void main(String[] args)  throws FileNotFoundException {
		Scanner reader = new Scanner(new File("ncaa2014.csv"));

		while (reader.hasNextLine()) {
			String next = reader.nextLine();
			String[] values = next.split(",");

			if (values.length > 1) {
				Team t = new Team(values[0], Integer.parseInt(values[1]), Double.parseDouble(values[2]));
				teams.add(t);
			}

			for (String s : values) {
				System.out.print(s + " ");
			}

			System.out.println();
		}
	}

}