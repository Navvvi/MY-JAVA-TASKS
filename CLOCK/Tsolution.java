import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Tsolution {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("1.NEXT_HOUR\n2.NEXT_MINUTE\n3.NEXT_SECOND");
		System.out.println("4.PREVIOUS_HOUR\n5.PREVIOUS_MINUTE\n6.PREVIOUS_SECOND");
		System.out.println("WHAT DO YOU WANT?????");
		int choice = Integer.parseInt(bf.readLine());
		Time timeOb = new Time();
		System.out.println("GIVE YOUR TIME");
		String currentTime = bf.readLine();
		String time[] = currentTime.split(":");
		int currentHour = Integer.parseInt(time[0]);
		int currentMinute = Integer.parseInt(time[1]);
		int currentSecond = Integer.parseInt(time[2]);
		timeOb = new Time(currentHour,currentMinute,currentSecond);
		switch(choice) {
		case 1:
			System.out.println("\nNEXT HOUR......");
			timeOb.nextHour();
			break;
		case 2:
			System.out.println("\nNEXT MINUTE......");
			timeOb.nextMinute();
			break;
		case 3:
			System.out.println("\nNEXT SECOND......");
		    timeOb.nextSecond();
			break;
		case 4:
			System.out.println("\nPREVIOUS HOUR......");
			timeOb.previousHour();
			break;
		case 5:
			System.out.println("\nPREVIOUS MINUTE......");
			timeOb.previousMinute();
			break;
		case 6:
			System.out.println("\nPREVIOUS SECOND......");
			timeOb.previousSecond();
			break;
		default:
			System.out.println("\nINVALID SELECTION");
	}

}

}





