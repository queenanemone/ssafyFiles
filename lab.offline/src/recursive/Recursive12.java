package recursive;

public class Recursive12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(recursive(1));
	}
	
	//idx : 순서값
	//return : sum
	static int [] memo = new int[11];
	private static int recursive(int idx)
	{
		//basis part
		if (idx > 10)
		{
			//11번째 반복
			return 0;
		}
		
		//inductive part
		return memo[idx] = idx + recursive(idx + 1);
	}
}