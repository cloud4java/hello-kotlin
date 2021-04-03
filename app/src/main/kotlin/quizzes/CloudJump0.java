package quizzes;

import java.util.ArrayList;
import java.util.List;

public class CloudJump0 {
	public static void main(String[] args) {
		int ar[] = { 0, 1, 0, 0, 0, 1, 0 };
//		int ar[] = { 0, 0, 1, 0, 0, 1 };

		System.out.println(jump(ar.length, ar));
	}

	static int jump(int n, int[] c) {
		List<Integer> res = new ArrayList<>();

		for (int i = 0; i < c.length; ) {
			if (i+2<c.length && c[i+2]==0) {
				i+=2;
				res.add(i);
			}else if (i+1< c.length&&c[i+1] == 0) {
				i++;
				res.add(i);
			}
			else {
				i++;
				//res.add(i);
			}
		}
		System.out.println(res);
		return res.size();
	}
	static int jump_3(int n, int[] ar) {
		List<Integer> res = new ArrayList<>();
//{ 0, 1, 0, 0, 0, 1, 0 };//3	
		for (int i = 0; i < ar.length; ) {
			if (i==0 && ar[i]==0) {
				res.add(ar[i++]);
			}else {
				if (i+2<ar.length && ar[i+2]==0) {
					i+=2;
					res.add(i);
				}else if (i+1< ar.length&&ar[i+1] == 0) {
					i++;
					res.add(i);
				}else {
					i++;
					res.add(i);
				}
			}
		}
		System.out.println(res);
		return res.size()-1;
	}
	
	public static int jump2(int n, int[] ar) {
		List<Integer> ix = new ArrayList<>();
		//int size = 0;
		for (int i = 1; i < ar.length /* && ar[i] == 0 */; i++) {
			if (ar[i] == 0) {
				ix.add(i);
			}
		}
		//System.out.println(ix);
		//size = ix.size();
		ix.clear();
		for (int i = 1; i < ar.length -1; i++) {
			if (ar[i]==0) {
				if (ar[i + 1] == 0/* && (i+1 > ar.length) */) {
					i = i + 1;
					ix.add(i);
				} else {
					ix.add(i);
				}
			}else {
				ix.add(++i);
			}
		}
		System.out.println(ix);
		return ix.size();//ix.size() < size?ix.size():size  ;
	}

	public static int jump1(int n, int[] ar) {
		List<Integer> ix = new ArrayList<>();

		for (int i = 0; i < ar.length; i++) {
			if (ar[i] == 0 && i + 1 != ar.length) {
				if (ar[i + 1] == 0/* && (i+1 > ar.length) */) {
					i = i + 1;
					ix.add(i);
				}
			} else {
				// i = i + 1;
				ix.add(i + 1);
			}
		}

		System.out.println(ix);
		return ix.size();
	}
}
