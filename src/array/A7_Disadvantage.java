package array;

public class A7_Disadvantage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a=new int[5];
		a[0]=1;
		a[1]=2;
		//a[2]=3;
		a[3]=4;
		a[4]=5;
		System.out.println(a.length);
		System.out.println(a[2]);//memory wastage ll be huge->disadvantage
		//once size is declared it cant be expand
	}

}
