public class ppa1Function {
	
	public double[] splitTheTip(double dinnerAmmount, int guestNumb) {
		double total = dinnerAmmount * 1.15;				//adds the tip to the bill
		total = Math.round(total * 100.0) / 100.0;			//Rounds the total after tip to the nearest 2 decimal place.
		int splitInt = (int) (total / guestNumb * 100.0);	//cast as int to remove floating point error
		double split = splitInt / 100.0;					//turn back into a double
		double[] answer = {split, 0.0};						//create a return array with the answer
		return answer;
	}
	
	public String bodymass(int inches, int feet) {
		
		return null;
	
	}
	
	public int retirementAge(int currentAge, double AnnualSalary, double prcntSaved, double goal) {
	
		return 0;
	
	}
	
	public double shortestDistance(double x1, double y1, double x2, double y2) {
		
		return 0;
	
	}
}
