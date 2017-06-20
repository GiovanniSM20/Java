package controller;

public class Ex_4Q9 {
public static void main(String[] args){
		
		double sort1 = Math.random();
		int resul1 =  (int) (sort1 * 100);
		System.out.println(resul1);
		
		double sort2 = Math.random();
		int resul2 =  (int) (sort2 * 100);
		System.out.println(resul2);
		
		if(resul1 > resul2){
			System.out.println("O maior número é "+resul1);
		} else{
			System.out.println("O maior número é "+resul2);
		}
		
	}

}
