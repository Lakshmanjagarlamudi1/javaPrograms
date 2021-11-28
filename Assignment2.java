import java.util.*;
	class BranchCheck{
		boolean k = false;
		boolean 
		Check(String br){
			switch(br){
				case "CSE":k=true;
				break;
				case "ECE":k=true;
				break;
				case "EEE":k=true;
				break;
				case "MEC":k=true;
			}
		return k;
		}
	}
class StuMarks{
	float obt_marks,pers;
	boolean b;
	String Remarks;
	
	
	void Calculate(){
	
		pers = obt_marks/6;
		if(b)
			Remarks = "Fail";
		else if(pers>35 && pers<50)
			Remarks = "Third Class";
		else if(pers>50 && pers<60)
			Remarks = "Second Class";
		else if(pers>60 && pers<70)
			Remarks = "First Class";
		else if(pers>70 && pers<100)
			Remarks = "Destinction";
		else{
			Remarks = "Fail";
		}
	}
	void getResult(){
		System.out.println("Your Total Parsentage : "+pers);
		System.out.println("Your Remarks :"+ Remarks);
	}
}
class StudentProgress{
	public static void main(String[] args){
	
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the StuName:");
		String stuName = sc.nextLine();
		System.out.println("Enter the StuBranch:");
		String branch = sc.nextLine().toUpperCase();
		
		BranchCheck bc = new BranchCheck();
		boolean k = bc.Check(branch);
		if(k){
			System.out.println("Enter Your Roll Number");
			String rollNo = sc.next();
			
		if(rollNo.length()==10){
		
		
		int Telugu, Sanskrit, English, Science, Social, Maths;
		System.out.println("Enter Telugu Marks");
		Telugu = sc.nextInt();
		System.out.println("Enter Sanskrit marks");
		Sanskrit = sc.nextInt();
		System.out.println("Enter English marks");
		English = sc.nextInt();
		System.out.println("Enter Science marks");
		Science = sc.nextInt();
		System.out.println("Enter Social Marks");
		Social = sc.nextInt();
		System.out.println("Enter Maths Marks");
		Maths = sc.nextInt();
		
		StuMarks marks = new StuMarks();
		String grade;
		
		if((Telugu>=0 && Telugu <=100) && (Sanskrit>=0 && Sanskrit <=100) && (English>=0 && English <=100) && (Science>=0 && Science <=100) && (Social>=0 && Social <=100) && (Maths>=0 && Maths <=100)){
		
			marks.obt_marks = Telugu + Sanskrit + English + Science + Social + Maths;
		if((Telugu <35) || (Sanskrit <35) || (English <35) || (Science <35) || (Social <35) || (Maths <35)){
			
			marks.b = true;
			System.out.println("StuName:"+ stuName);
			System.out.println("Branch:"+ branch);
			System.out.println("RollNo:"+ rollNo);
			System.out.println("TotMarks:"+ (marks.obt_marks));
			System.out.println(marks.obt_marks + " are the total marks out off 600");
			System.out.println("Fail");
		}
		else{
			System.out.println("StuName:"+ stuName);
			System.out.println("Branch:"+ branch);
			System.out.println("RollNo:"+ rollNo);
			System.out.println("TotMarks:"+ (marks.obt_marks));
			System.out.println(marks.obt_marks + " are the total marks out off 600");
			marks.Calculate();
			marks.getResult();
		}
		
			
	}
	else{
		System.out.println("Please Enter valid Marks");
		}
		
}
else{System.out.println("Please Enter valid Roll Number");
}
}
else{System.out.println("Please enter valid branch");}
}
}
