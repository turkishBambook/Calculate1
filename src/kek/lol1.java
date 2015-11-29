package kek;

import java.util.*;

class lol1{
		public static void main(String[] args){
			int f;
			int k;
			int z;
			String a = "+";
			String b = "-";
			String c = "*";
			String d = "/";
			String peppa;
			System.out.println("¬ведите первое число");
			Scanner scn = new Scanner(System.in);
			f = scn.nextInt();
			System.out.println("¬ведите второе число");
			k = scn.nextInt();
			System.out.println("¬ведите знак");
			peppa = scn.next();
			if (peppa.equals(a)){
				z = f + k;
				System.out.println(z);
			}
			if (peppa.equals(b)){
				z = f - k;
				System.out.println(z);
			}
			if (peppa.equals(c)){
				z = f * k;
				System.out.println(z);
			}
			if (peppa.equals(d)){
				z = f / k;
				System.out.println(z);
			}
		}
}
