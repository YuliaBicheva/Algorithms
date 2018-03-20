package brain.teaser;

import java.util.Random;
public class Task1 {
	
	public static void main(String[] args) {
		Task1 task = new Task1();
		int i = 0;
		long start = System.currentTimeMillis();
		while(i++ < 1000000) {
			int n = task.getNumber();
			System.out.println("NUMBER: " + n + "; isEven: " + (n % 2 == 0) + ", should be: true");
		}
		System.out.println("Finished in " + (System.currentTimeMillis() - start) + "ms!");
	}

	public int getNumber() {
		int result = 0;
		int prev = -1;

		for(int i = 0; i < 4; i++){
			int mult = (int)Math.pow(10, i);
			int num;
			do{
				num = getRandomNum();
			} while(prev == num || (i == 0 && num % 2 != 0));
			result += num * mult;
		}
		return result;
	}
	
	public int getRandomNum() {
		return new Random().nextInt(10);
	}
}
