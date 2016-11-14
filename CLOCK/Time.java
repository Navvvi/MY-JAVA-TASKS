public class Time {
	int hour;
	int minute;
	int second;
	Time() {
		hour = 0;
		minute = 0;
		second = 0;
		
	}
	Time(int hour,int minute,int second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
		print();
	}
	void nextHour() {
		this.hour = this.hour+1;
		if(this.hour == 24) {
			this.hour = 0;
			this.minute = 0;
			this.second = 0;
		}
			print();
	}
	void nextMinute() {
		this.minute = this.minute+1;
		if(this.minute == 60) {
			this.hour += 1;
			this.minute = 0;
		if(this.hour == 24) 
			this.hour = 0;
	}
			print();
		}
	void nextSecond() {
		this.second = this.second+1;
		if(this.second == 60){
			this.minute += 1;
			this.second = 0; 
		if(this.minute == 60){
			this.hour += 1;
			this.minute = 0; 
		if(this.hour == 24)
			this.hour = 0;
	}
}
			print();
		}
	void previousHour() {
		this.hour = this.hour-1;
		if(this.hour < 0)
		
			this.hour = 23;
		
			print();
	}
	void previousMinute() {
		this.minute = this.minute-1;
		if (this.minute < 0)
		{
			this.minute = 59;
			this.hour -= 1; 
		if(this.hour < 0) 
			this.hour = 23;
		}
			print();

	
}

	void previousSecond() {
		this.second = this.second-1;
		if(this.second < 0) {
			this.second = 59;
			this.minute -= 1;
		if(this.minute < 0) {
			this.minute =59;
			this.hour -= 1;
			if(this.hour < 0) 
				this.hour =24;
			
		}

	}
			print();

	}

void print() {
	System.out.printf("%02d : %02d : %02d",this.hour,this.minute,this.second);
}

}


