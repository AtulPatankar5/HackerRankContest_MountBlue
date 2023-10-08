package Day1;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Breaking_records {
	public static List<Integer> breakingRecords(List<Integer> scores) {

		List<Integer> list = new ArrayList<>();
		int highest = scores.get(0);
		int lowest = scores.get(0);
		int max = 0;
		int min = 0;
		for (int i = 1; i < scores.size(); i++) {
			if (scores.get(i) > highest) {
				max++;
				highest = scores.get(i);
			}
			if (scores.get(i) < lowest) {
				min++;
				lowest = scores.get(i);
			}
		}
		list.add(max);
		list.add(min);
		return list;
	}

	public static void main(String[] args) throws IOException {
		List<Integer> ar = new ArrayList<>();
		ar.add(10);
		ar.add(5);
		ar.add(20);
		ar.add(20);
		ar.add(4);
		ar.add(5);
		ar.add(2);
		ar.add(25);
		ar.add(1);

		List<Integer> result = breakingRecords(ar);
		System.out.println(result);
	}

}
