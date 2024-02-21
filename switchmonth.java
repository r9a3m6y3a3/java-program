package switchmonth;

public class switchmonth {

	public static void main(String[] args) {
		int num =12;
		String month;
		
		switch (num)
		{
		case 1:
			month ="January";
			break;
		case 2:
			month="February";
			break;
		case 3:
			month="March";
			break;
		case 4:
			month="April";
			break;
		case 5:
			month="June";
			break;
		case 6:
			month="July";
			break;
		case 7:
			month="August";
			break;
		case 8:
			month="September";
			break;
		case 9:
			month="October";
		case 10:
			month="November";
		case 11:
			month="May";
			break;
		case 12:
			month="December";
			break;
			default:
				month="Unknown";
				break;
		}
		System.out.println("MONTH="+month);
		}
		// TODO Auto-generated method stub

	}


