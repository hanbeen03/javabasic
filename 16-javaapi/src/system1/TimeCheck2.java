package system1;

import java.util.Scanner;

public class TimeCheck2 {
	// tryCatch구문의 소요시간을 구해주세요
	//여러분들이 직접 원하는 종류의 예외를 발생시켜주세요.
	public static void main(String[] args) {
		long start;
		long end;
		String temp;
		Scanner sc = new Scanner(System.in);
		
		start = System.currentTimeMillis();
		
		try {
			System.out.println("try");
			while(true) {
				temp = sc.nextLine();
				
				if(temp.equals("end")) {
					break;
				} else if (temp.equals("exception")) {
					throw new NullPointerException();
				} else {
					continue;
				}
				
			}
			
			
		} catch (NullPointerException n) {
			System.out.println("catch 1");
			n.printStackTrace();
		} catch (Exception e) {
			System.out.println("catch 2");
			e.printStackTrace();
		} finally {
			System.out.println("finally");
		}
		
		end = System.currentTimeMillis();
		
		System.out.println("tryCatch 소요시간 : " + (end - start));
	}
	
}
