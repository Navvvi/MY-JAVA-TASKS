package org;
import com.Circle;
import com.Rectangle;
import com.Triangle;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Solution
{
	public static void main(String args[]) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("1.circle    2.rectangle  3.triangle ");
		System.out.println("choice: ");
		int choice =Integer.parseInt(bf.readLine());
		switch(choice){
			case 1:
			Circle cObject=new Circle();
			cObject.radius=Double.parseDouble(bf.readLine());
			cObject.Area();
			break;
			case 2:
			Rectangle Robject=new Rectangle();
		    Robject.length=Double.parseDouble(bf.readLine());
		    Robject.breadth=Double.parseDouble(bf.readLine());
			Robject.Area();
			//Robject.Area(Robject.breadth);
			break;
			case 3:
			Triangle Tobject=new Triangle();
		    Tobject.base=Double.parseDouble(bf.readLine());
		    Tobject.height=Double.parseDouble(bf.readLine());
			Tobject.Area();
			//Tobject.Area(Tobject.height);
			break;
			default:
			System.out.println("Invalid Selection");

		}
	}
}