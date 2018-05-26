import java.util.*;
public class Applicant {
	public String name;
	public String dob;
	public int credit;
	public float threeMonthAvgInc;
	public float lastYearsTaxableInc;
	public float loanNeeded;
	public String uid;
	public static int index;
	
	public boolean isApproved() {
		return (credit > 600 && loanNeeded <= 5*lastYearsTaxableInc && threeMonthAvgInc >= 12000)? true : false;
	}
	

	public Applicant(String name, String dob, int credit, float threeMonthAvgInc, float lastYearsTaxableInc, float loanNeeded) {
		this.name = name;
		this.dob = dob;
		this.credit = credit;
		this.threeMonthAvgInc = threeMonthAvgInc;
		this.lastYearsTaxableInc = lastYearsTaxableInc; 
		this.loanNeeded = loanNeeded;
	}
	
	public String uidGen() {
		String ind = String.format("%02d", index);
		Random rand = new Random();
		int  n = rand.nextInt(999);
		StringBuilder sb = new StringBuilder();
		sb.append(ind);
		sb.append(name.charAt(0));
		sb.append(name.charAt(1));
		sb.append(n);
		String uid = sb.toString();
		
		index++;
		return uid;
	}
	
	public static void main(String[] args) {
		List<Applicant> appList = new ArrayList<>();
		
		
		boolean exit = false;
		while(!exit) {
			Scanner sString = new Scanner(System.in);
			Scanner sNum = new Scanner(System.in);
			
			try {
				//get user variables
				System.out.println("Enter your name");
				String name = sString.nextLine();
				System.out.println("Enter your dob");
				String dob = sString.nextLine();
				System.out.println("Enter your credit: ");
				int credit = sNum.nextInt();
				System.out.println("Enter your three month's average income: ");
				float threeMonthAvgInc = sNum.nextFloat();
				System.out.println("Enter your last year's taxable income: ");
				float lastYearsTaxableInc = sNum.nextFloat();
				System.out.println("Enter the loan you wish to obtain: ");
				float loanNeeded = sNum.nextFloat();
				
			
				
				Applicant a = new Applicant(name, dob, credit, threeMonthAvgInc, lastYearsTaxableInc, loanNeeded);
				a.uid = a.uidGen();
				
				appList.add(a);
				
				if (a.isApproved()) {
					System.out.println("Loan ID: "+ a.uid);
					System.out.println("Loan approved for $"+a.loanNeeded);
					
				} else {
					System.out.println("Denied.");
				}
				
				
				System.out.println("Type exit to exit. Type anything else to submit another application");
				String ex = sString.nextLine();
				if (ex.equals("exit")) { exit = true; }
				
				} catch (Exception e) {
				System.out.println("you messed up.");
				} finally {
				};
			

			
			
		}
		
	}
}
