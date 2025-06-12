package method;

public class 정밀도 {
	public static void main(String[] args) {
		//double : 배정밀도 
		//float : 6자리(유효자리수)   double : 15자리(유효자리수)
		//0.00001     0.11111    유효자리수 1 1.0x10^-5, 유효자리수 5
		float f = 0.123456789123456f;
		double d = 0.123456789123456;
		
		System.out.println(f);
		System.out.println(d);
	}
}
