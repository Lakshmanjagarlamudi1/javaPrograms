import java.util.Scanner;


class StudentResult
{
float percent;
int result;

void calculate(int totmrk)
{


float prc = ((float)totmrk/6);
percent = prc;   // percentage variable intialisation


if(prc>=70 || prc <100)
{
System.out.println("===== NARESH EXMINATION BOARD==========");
  getResult();
  System.out.println("==FIRST CLASS==");
  }
else if(prc>=60 || prc<70)
{
System.out.println("===== NARESH EXMINATION BOARD==========");
  getResult(); // invoking non static  method in another non static method is allowed
  System.out.println("==SECOND  CLASS==");
}
else if(prc>=50 || prc<60) {

System.out.println("===== NARESH EXMINATION BOARD==========");
  getResult();
  System.out.println("==THIRD CLASS==");
}
else if(prc>=35 || prc<50) {

System.out.println("===== NARESH EXMINATION BOARD==========");
getResult();
  System.out.println("==FAIL==");
}
}

void getResult()
{
System.out.println("Total marks gained: "+result);
System.out.println("percentage : "+percent);
}
}
class StudentsMain {


public static void main(String[] args) {


int java ,c,python,oracle,html,css,total;

Scanner sc = new Scanner(System.in);


System.out.println("===== NARESH EXMINATION BOARD==========");
System.out.println("enter java marks: ");
java=sc.nextInt();

System.out.println("enter c language marks: ");
c=sc.nextInt();

System.out.println("enter python marks: ");
python=sc.nextInt();

System.out.println("enter oracle marks: ");
oracle=sc.nextInt();

System.out.println("enter html marks: ");
html=sc.nextInt();

System.out.println("enter css marks: ");
css=sc.nextInt();

total = java+c+python+oracle+html+css;

StudentResult std = new StudentResult();

     std.result=total; // result variable initialisation
 
     std.calculate(total); // invoke calculate method
     sc.close();  // closing the buffer pipe to avoid warnings
 
}


}

