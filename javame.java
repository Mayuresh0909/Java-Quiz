import java.util.Scanner;
class level1
{
 
public int firstlevel()

 {
int k = 0;
  Scanner scan1;  //MAIN SCANNER FOR LEVEL 1
  scan1 = new Scanner(System.in);

  System.out.println(" 1]Java is a ..... language"); //QUESTOIN 1
  System.out.println(" a)weakly typed\n\n b)strongly typed\n\n c)moderate typed \n\n d)none of these");
  System.out.println("Enter Your Answer:");
  char a = scan1.next().charAt(0);
  
  System.out.println(" 2]How many primitive data types are present in java language"); //QUESTION 2
  System.out.println(" a)6\n\n b)8 \n\n c)4 \n\n d) 10");
  System.out.println("Enter Your Answer:");
  char b = scan1.next().charAt(0);

  System.out.println(" 3]In Java arrays are ...... ");  //QUESTION 3
  System.out.println(" a)object\n\n b)object references\n\n c)primitive data types\n\n d)none of these"); 
  System.out.println("Enter Your Answer:");
  char c = scan1.next().charAt(0);
  
  System.out.println(" 4]Object is created  with new keyword at  "); //QUESTION 
  System.out.println("a)compile time \n\n b)run time\n\n c)depend on code\n\n d)none of these");
  System.out.println("Enter Your Answer:");
  char d = scan1.next().charAt(0);

  System.out.println(" 5]Which of the following is not a Java Keyword?");  //QUESTION 5
  System.out.println(" a) Integer\n\n b)try \n\n c)new \n\n d)import");
  System.out.println("Enter Your Answer:");
  char e = scan1.next().charAt(0);
 
  if(a == 'b')
  {
   k = k + 1;
  }
  if(b == 'b')
  {
   k = k + 1;
  }
  if(c == 'a')
  {
   k = k + 1;
  }
  if(d == 'a')
  {
   k = k + 1;
  }
  if(e == 'a')
  {
   k = k + 1;
  }
return k;
}
}
class level2
{

public int secondlevel()
{
int j = 0;
            System.out.println("Congratulations!!! You can now access LEVEL 2!");
			
			Scanner scan2;		//MAIN SCANNER FOR LEVEL 2
			scan2 = new Scanner(System.in);
		
			System.out.println(" 1]What is the range of short data type in Java?");	//QUESTOIN 1
			System.out.println(" a) -128 to 127\n\n b) -32768 to 32767\n\nc) -2147483648 to 2147483647\n\n d) None of the mentioned");
			System.out.println("Enter Your Answer:");
			char m = scan2.next().charAt(0);
			
			System.out.println(" 2]What is the range of byte data type in Java?"); //QUESTOIN 2
			System.out.println(" a) -128 to 127\n\n b) -32768 to 32767\n\nc) -2147483648 to 2147483647\n\nd) None of the mentioned");
			System.out.println("Enter Your Answer:");
			char n = scan2.next().charAt(0);
			
			System.out.println(" 3]Which of the following are legal lines of Java code?"); //QUESTOIN 3
			System.out.println("\t1. int w = (int)888.8; \n\t2. byte x = (byte)100L; \n\t3. long y = (byte)100; \n\t4. byte z = (byte)100L; \n\na) 1 and 2 \n\nb) 2 and 3 \n\nc) 3 and 4 \n\nd) All statements are correct");
			System.out.println("Enter Your Answer:");
			char o = scan2.next().charAt(0);
			
			System.out.println(" 4]An expression involving byte, int, and literal numbers is promoted to which of these?"); //QUESTOIN 4
			System.out.println(" a) int \n\nb) long\n\nc) byte\n\nd) float");
			System.out.println("Enter Your Answer:");
			char p = scan2.next().charAt(0);
			
			System.out.println("Which of these literals can be contained in float data type variable?"); //QUESTOIN 5
			System.out.println("a) -1.7e+308\n\n b) -3.4e+038 \n\nc) +1.7e+308 \n\nd) -3.4e+050");
			System.out.println("Enter Your Answer:");
			char q = scan2.next().charAt(0);
			
			
		
			if(m == 'b')
			{
			j = j + 1;
			}
			if(n == 'b')
			{
				j = j + 1;
			}
			if(o == 'a')
			{
				j = j + 1;
			}
			if(p == 'a')
			{
				j = j + 1;
			}
			if(q == 'a')
			{
				j = j + 1;
			}
return j;
}
}
class level3
{

public int thirdlevel()
{
int i = 0;
                                System.out.println("Congratulations!!! You can now access LEVEL 3!");
				
				Scanner scan3;		//MAIN SCANNER FOR LEVEL 3
				scan3 = new Scanner(System.in);
		
				System.out.println(" 1]Which data type value is returned by all transcendental math functions?");
				System.out.println("a) int \n\n b) float \n\n c) double\n\n d) long");
				System.out.println("Enter Your Answer:");
				char r = scan3.next().charAt(0);
				
				System.out.println(" 2]What will be the output of the following Java code?"); //QUESTOIN 2
				System.out.println("class average \n{public static void main(String args[])\n{\ndouble num[] = {5.5, 10.1, 11, 12.8, 56.9, 2.5};\ndouble result;\nresult = 0;\nfor (int i = 0; i < 6; ++i) \nresult = result + num[i];\nSystem.out.print(result/6);\n} \n}");
				System.out.println("a) 16.34\n\nb) 16.566666644\n\nc) 16.46666666666667\n\n d) 16.46666666666666 ");
				System.out.println("Enter Your Answer:");
				char s = scan3.next().charAt(0);
				
				System.out.println(" 3] Which of these operators is used to allocate memory to array variable in Java?");
				System.out.println("a) malloc\n\nb) alloc\n\nc) new\n\nd) new malloc"); 
				System.out.println("Enter Your Answer:");
				char t = scan3.next().charAt(0);
				
				System.out.println(" 4] Which of these is an incorrect array declaration?"); //QUESTOIN 4
				System.out.println(" a) int arr[] = new int[5]\n\nb) int [] arr = new int[5]\n\nc) int arr[] = new int[5]\n\nd) int arr[] = int [5] new");
				System.out.println("Enter Your Answer:");
				char u = scan3.next().charAt(0);
				
				System.out.println(" 5]Which of these is an incorrect Statement?"); //QUESTOIN 5
				System.out.println("a) It is necessary to use new operator to initialize an array\n\nb) Array can be initialized using comma separated expressions surrounded by curly braces\n\nc) Array can be initialized when they are declared\n\nd) None of the mentioned" );
				System.out.println("Enter Your Answer:");
				char v = scan3.next().charAt(0);
				
		
				if(r == 'b')
				{
					i = i + 1;
				}
				if(s == 'b')
				{
					i = i + 1;
				}
				if(t == 'a')
				{
					i = i + 1;
				}
				if(u == 'a')
				{
					i = i + 1;
				}
				if(v == 'a')
				{
					i = i + 1;
				}

return i;
}
}
public class javame
{
	public static void main(String[] args)
	{
	System.out.println("*****WELCOME TO JAVA QUIZ!*****");
	System.out.println("Please read the following instructions carefully!!!");
	System.out.println("1. There are 3 LEVELS in this quiz. 5 Quesitons per LEVEL to be solved.");
	System.out.println("2. You must have atleast score of 3 to attempt LEVEL 2");
	System.out.println("3. You must have atleast score of 4 to attempt LEVEL 3");
	System.out.println("4. You must have atleast score of 5 to win LEVEL 3");
	System.out.println("5. If you complete LEVEL 3, you win this Quiz!");
	System.out.println("");
	System.out.println("Let's Begin!!!\n\n");

        level1 one =new level1();
        int z=one.firstlevel();
        level2 two=new level2();
        int w=two.secondlevel();
        two.secondlevel();
        level3 t= new level3();
        int last=t.thirdlevel();
         
        if(z>3)
        {
        two.secondlevel();
 
        if(w>4)
        {
         t.thirdlevel();
        }
         else
            {
              System.out.println("sorry plss try again");
            }

        
        if(last>5)
        {
         System.out.println("Congratulations you are an java expert");
        }
         }

       
       
}
}