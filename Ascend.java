// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {

		int lim = Integer.parseInt(args[0]);

		int a = (int)(lim * Math.random());
		int b = (int)(lim * Math.random());
		int c = (int)(lim * Math.random());

		int minNum = Math.min(a, b); //בירור קטן זמני A B
		int maxNum = Math.max(a , b);//בירור גדול זמני A B
		int midNum = Math.min(maxNum , c);//   בירור הקטן בין הגדול הזמני לc 

		midNum = Math.max(midNum, minNum); //בירור בין האמצעי לקטן הזמני
		minNum = Math.min(minNum, c);
		maxNum = Math.max(maxNum, c);

		
		System.out.println(a + " " + b +" "+ c);
		System.out.println(minNum + " " + midNum +" "+ maxNum);
	}
}
