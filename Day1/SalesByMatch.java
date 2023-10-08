package Day1;

import java.util.ArrayList;
import java.util.List;

public class SalesByMatch {

	public static int sockMerchant(int n, List<Integer> ar) {
		// 10 20 20 10 10 30 50 10 20
		int count = 1;
		int result = 0;
		for (int j = 1; j < n; j++) {
			int key = ar.get(j);
			for (int i = j - 1; i >= 0; i--) {
				if (key < ar.get(i)) {
					ar.set(i + 1, ar.get(i));
					ar.set(i, key);
				}
			}
		}
		System.out.println(ar);

	
		for (int i = 0; i < n-1; i++) {
			if (ar.get(i) == ar.get(i+1)) {
				count++;
			} else {
				result += count / 2;
				count = 1;
			}
			if(i==n-2) {
				result += count / 2;
			}
		}
		return result;

	}
	   public static int simpleArraySum(List<Integer> ar) {
		    int sum=0;
		        for( int i=0;i<ar.size();i++){
		        sum+=ar.get(i);
		    }
		        return sum;

		    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> ar = new ArrayList<>();
		ar.add(1);
		ar.add(1);
		ar.add(3);
		ar.add(1);
		ar.add(2);
		ar.add(1);
		ar.add(3);
		ar.add(3);
		ar.add(3);
		ar.add(3);
		int sockMerchant = sockMerchant(9, ar);
		System.out.println(sockMerchant);
		
		int sum = simpleArraySum(ar);
		System.out.println(sum);
	}

}
