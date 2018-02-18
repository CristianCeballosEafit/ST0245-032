public class Fibonacci{
	public static void main(String[]args){
		System.out.println(serie(10));
	}
	
	public static int serie(int n){
		if(n > 1)return serie(n-1)+serie(n-2);
		else if(n == 1)return 1;
		else return 0;
	}
}