public class ppa1Function {

	public double[] splitTheTip(double dinnerAmmount, int guestNumb) {

		if (guestNumb <= 0) {
			double[] answer = { -1.0, -1.0 };
			return answer;
		}
		double total = dinnerAmmount * 1.15; // adds the tip to the bill
		total = Math.round(total * 100.0) / 100.0; // Rounds the total after tip to the nearest 2 decimal place.
		int splitInt = (int) (total / guestNumb * 100.0); // cast as int to remove floating point error
		double split = splitInt / 100.0; // turn back into a double
		int remainderInt = (int) ((total * 100) % guestNumb); // get the remainder in form of an int
		double remainder = remainderInt / 100.0; // makes the remainder back to a double to an double with only 2
													// decimals
		double[] answer = { split, remainder }; // create a return array with the answer
		return answer;
	}

	public double shortestDistance(double x1, double y1, double x2, double y2) {
		double dist = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow(y2 - y1, 2));
		int distInt = (int) (Math.round(dist * 10000)); // cast as an int saving 4 decimal places
		dist = distInt / 10000.0; // make it back into a double
		return dist;
	}

	public String bodymass(int feet, int inches, double weight) {
		double kilos = weight * 0.45;
		double totalInches = feet * 12 + inches;
		double meters = totalInches * 0.025;

		// check edge cases
		if (weight <= 30)
			return "weightless";
		else if (totalInches <= 24)
			return "heightless";

		// calculate BMI
		double bmi = kilos / Math.pow(meters, 2);
		// round to 2 decimal places
		int bmiInt = (int) Math.round(bmi * 100);
		bmi = bmiInt / 100.0;

		// turn into our return string
		String retString = "";
		if (bmi <= 18.5)
			retString = "Underweight|" + bmi;
		else if (bmi < 25)
			retString = "Normal Weight|" + bmi;
		else if (bmi < 30)
			retString = "Overweight|" + bmi;
		else
			retString = "Obese|" + bmi;

		return retString;

	}

	public int retirementAge(int currentAge, double AnnualSalary, double prcntSaved, double goal) {

		// test for edge cases
		if (goal == 0) {
			return currentAge;
		} else if (currentAge <= 15 || currentAge > 99) {
			return -1;
		} else if (AnnualSalary <= 0) {
			return -2;
		} else if (prcntSaved <= 0) {
			return -3;
		} else if (goal < 0) {
			return -4;
		}

		// calculate the age where the accumulated savings equals or surpasses the goal
		int iceAge = currentAge;
		double total = 0.0;
		do {
			total += (AnnualSalary * (prcntSaved / 100)) * 1.35;
			int temp = (int) (Math.round(total * 100.0));
			total = temp / 100.0;
			iceAge++;
			if (total >= goal) {
				break;
			}
		} while (iceAge <= 100);

		return iceAge;
	}
}
