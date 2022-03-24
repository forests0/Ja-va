package ch08;

public class TypeConversion {

	public static void main(String[] args) {
		double dNum = 1.2;
		float fNum = 0.8F;
		
		int iNum1 = (int)dNum + (int)fNum;
		System.out.println(iNum1);
		int iNum2 = (int)(dNum + fNum); 
		System.out.println(iNum2);
	}

}
