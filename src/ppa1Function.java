
public class ppa1Function {
	
	public double[] splitTheTip(double dinnerAmmount, int guestNumb) {
		double total = dinnerAmmount * 1.15;
		double evenSplit = total / guestNumb;
		evenSplit= Math.round(evenSplit * 100.0) / 100.0; //Rounds the total after tip to the nearest 2 decimal place.
		double[] answer = {evenSplit, 0.0};
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
