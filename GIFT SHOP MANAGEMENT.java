import java.io.*;
import java.util.*;
class Pratyush
{
	static int cusEnt=0,ch,ch1,ch3 = 0;
	static Thread t;
	static String name="",pd1,pd2,pd3,pd4,pd5,pd6,pw,a="", choice = "",cadd="",cdate="";
	static boolean flag;
	static void start()
	{
	Scanner sc=new Scanner(System.in);
	clear();
	System.out.println("\n\n\n");
    System.out.println("\t\t*************************************************");
    System.out.println("\t\t**************   ***************   **************");
    System.out.println("\t\t*************   *****************   *************");
    System.out.println("\t\t************   ***W.E.L.C.O.M.E***   ************");
    System.out.println("\t\t***********   ******** T.O ********   ***********");
    System.out.println("\t\t**********   *** P.R.A.T.Y.U.S.H ***   **********");
    System.out.println("\t\t*********   *******  G.I.F.T  *******   *********");
    System.out.println("\t\t*******   ********** S.H.O.P **********   *******");
    System.out.println("\t\t******   *******************************   ******");
    System.out.println("\t\t*****   *********************************   *****");
    System.out.println("\t\t****   ***********************************   ****");
    System.out.println("\t\t***   *************************************   ***");
    System.out.println("\t\t**   ***************************************   **");
    System.out.println("\t\t*   *****************************************   *");
    System.out.println("\t\t*************************************************");
	System.out.println();
    for(int i=0;i<name.length();i++)
    {
      System.out.print(name.substring(i,i+1)+" ");
      for(long j=0;j<=1000000;j++);
    }
    System.out.println("\n\n\n\n\n");
    for(long j=0;j<=100000000;j++);
  processing(); 
System.out.println("Enter a number to proceed");
int ch2=sc.nextInt();
clear();
}
public static void processing()
 {
	  t=new Thread()
	{  
		   public void run()
		   {
				System.out.print("\t\t\t\tProcessing---------");
				for(int n=0;n<=100;n++)
				{
					 if(n<10){
					 System.out.print(n+"%");
					 System.out.print("\b\b");
					 }
					 else if(n>=10 && n<=99){
					 System.out.print(n+"%");
					 System.out.print("\b\b\b");
					 }
					else
					{
						System.out.println(n+"%");
					}  
						try{t.sleep(50);} catch(Exception e){}
				}  
			}
    };
  t.start();
 }
 static void clear()
  {   for(int i=1;i<=56; ++i)
     System.out.println();
  }
 static void option()
{
Scanner sc=new Scanner(System.in);
System.out.println("\n\n\n");
System.out.print("\n\t\t          ##################################");
System.out.print("\n\t\t          **********************************");
System.out.print("\n\t\t          * PRESS 1 IF YOU ARE A OWNER     *");
System.out.print("\n\t\t          * PRESS 2 IF YOU ARE A CUSTOMER  *");
System.out.print("\n\t\t          * PRESS 3 FOR EXIT               *");
System.out.print("\n\t\t          **********************************");
System.out.print("\n\t\t          ##################################");
for(int i=0; i<=9; ++i) System.out.println();
System.out.print("\t\t\t   Enter your Choice :- ");
}
// OWNER PART 
static void option1()
{
Scanner sc=new Scanner(System.in);
System.out.println("\n\t\t\t||****====****====****====**** ||");
System.out.println("\n\t\t\t||    SELECT YOUR CHOICE       ||");	
System.out.println("\n\t\t\t||****====****====****====**** ||");
System.out.println("\n\t\t\t||    1---->ADD GIFT           ||");
System.out.println("\n\t\t\t||    2---->REMOVE GIFT        ||");  
System.out.println("\n\t\t\t||    3---->EDIT GIFT          ||");  
System.out.println("\n\t\t\t||    4---->PRODUCT DETAILS    ||");
System.out.println("\n\t\t\t||    5---->CUSTOMER INFO      ||");
System.out.println("\n\t\t\t||    6---->BACK               ||");
System.out.println("\n\t\t\t||****====****====****====**** ||");
System.out.println("\n\t\t\t||    ENTER CHOICE             ||");
System.out.println("\n\t\t\t||****====****====****====**** ||");
System.out.println();
}
static void add()throws IOException
{
	BufferedReader bj=new BufferedReader(new InputStreamReader(System.in));
	File f=new File("Gift.dat");
	DataOutputStream dos = new DataOutputStream(new FileOutputStream(f,true));
	System.out.print("Product Event: "); 
    String pd1=bj.readLine();
    System.out.print("Product Name : ");
    String pd2=bj.readLine();
    System.out.print("Product code : ");
    pd3=bj.readLine();
    System.out.print("Product Manufacturer : ");
    String pd4=bj.readLine();
    System.out.print("Product Price: ");
    double pd5=Double.parseDouble(bj.readLine());
    System.out.print("ADD NO OF STOCK : ");
    int pd6=Integer.parseInt(bj.readLine());
	System.out.print("Product Discount: ");
	double disc=Double.parseDouble(bj.readLine());
    dos.writeUTF(pd1);
    dos.writeUTF(pd2);
    dos.writeUTF(pd3);
    dos.writeUTF(pd4);
    dos.writeDouble(pd5);
    dos.writeInt(pd6);
	dos.writeDouble(disc);
    dos.close();
	clear();
}
	static void remove() throws IOException
  {
    clear();
    BufferedReader br = new  BufferedReader(new InputStreamReader(System.in));
    File f1=new File("Gift.dat");
	DataInputStream dis=new DataInputStream (new FileInputStream(f1));
	File f2=new File("Product.dat");
	DataOutputStream dos=new DataOutputStream (new FileOutputStream(f2));
	double p5=0, disc=0; int p6=0,f=0;
	String p1,p2,p3,p4,oc,prn;
    boolean ch=false;
    System.out.println("\t\tR E M O V E   P R O D U C T");
    System.out.println("\t\t*****   *****");
    System.out.print("Enter Event  :-> ");
    oc=br.readLine();
	clear();
    System.out.print("Enter Product Name  :-> ");
    prn=br.readLine();
    try
    {
       while(true)
       {
			p1=dis.readUTF();
			p2=dis.readUTF();
			p3=dis.readUTF();
			p4=dis.readUTF();
			p5=dis.readDouble();
			p6=dis.readInt();
			disc=dis.readDouble();
			if(prn.equalsIgnoreCase(p2) && oc.equalsIgnoreCase(p1) && f==0)
			{
				System.out.println("Product Occasion     :-> "+p1);
				System.out.println("Product Name         :-> "+p2);
				System.out.println("Product code           :-> "+p3);
				System.out.println("Product Manufacturer :-> "+p4);
				System.out.println("Product Price :-> "+p5);
				System.out.println("Product Stock :-> "+p6);
				System.out.println("Product discount :-> "+disc);
				System.out.print("\nCan we proceed to DELETE [Enter Y/N] :-> ");
				char ans1=br.readLine().toUpperCase().charAt(0);
				if (ans1=='Y')
				{
					f=1;
					ch=true;
				}
			}
			if (f!=1)
			{
				dos.writeUTF(p1);
				dos.writeUTF(p2);
				dos.writeUTF(p3);
				dos.writeUTF(p4);
				dos.writeDouble(p5);
				dos.writeInt(p6);
				dos.writeDouble(disc);
			}
			f=0;
		}
    }
    catch(EOFException e1){}
    if (!ch)
    System.out.println("\n\n Sorry.....NOT FOUND.....");
    else
    System.out.println("\n\n Data Updation Over............");
    dos.close();
    dis.close();
    f1.delete();
    File f3 = new File("Gift.dat");
    f2.renameTo(f3);
    System.out.print("Press ENTER to GO BACK....");
    br.readLine();
	clear();	
  }
	static void editpro() throws IOException
	{
		clear();
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		File f1=new File("Gift.dat");
		DataInputStream dis=new DataInputStream (new FileInputStream(f1));
		File f2=new File("Product.dat");
		DataOutputStream dos=new DataOutputStream (new FileOutputStream(f2));
		String oc,pn,p1,p2,p3,p4; double p5=0, disc=0; int p6=0, f=0;

		System.out.println ("\t\tE D I T P R O D U C T");

		System.out.println ("\t\t*******");

		System.out.println ("Enter the Occasion to EDIT :- ");
		oc=br.readLine();

		System.out.println ("Enter the Product Name to EDIT :- ");
		pn=br.readLine();

		try{
			while(true)
			{ 
				p1=dis.readUTF();
				p2=dis.readUTF();
				p3=dis.readUTF();
				p4=dis.readUTF();
				p5=dis.readDouble();
				p6=dis.readInt();
				disc=dis.readDouble(); 

				if (oc.equalsIgnoreCase(p1) && pn.equalsIgnoreCase(p2) && f==0)
				{

					System.out.println("Product Event :- "+p1);
					System.out.println("Product Name :-> "+p2);
					System.out.println("Product code :-> "+p3);
					System.out.println("Product Manufacturer :-> "+p4);
					System.out.println("Product Price :-> "+p5);
					System.out.println("Product Stock :-> "+p6);
					System.out.println("Product discount :-> "+disc);
					System.out.print("\nCan we proceed to EDIT [ Enter Y/N] :-> ");
					char ans=br.readLine().toUpperCase().charAt(0);
					if (ans=='Y')
					{
						f=1;
						System.out.println("\t\tENTER PRODUCT NEW ENTRIES");
						System.out.println("\t\t*********");

						System.out.print("\tEDIT the Product Name:- ");
						p2=br.readLine();

						System.out.print("\n\tEnter Product discount :-> ");
						disc=Double.parseDouble(br.readLine());

						System.out.print("\tEnter Product code :-> ");
						p3=br.readLine();

						System.out.print("\tEnter Product Manufacturer :-> ");
						p4=br.readLine();

						System.out.print("\tEnter NEW Price per UNIT :-> ");
						p5=Double.parseDouble(br.readLine());

						System.out.print("\tUpdate product STOCK :-> ");
						p6=Integer.parseInt(br.readLine());
					}
				}
				dos.writeUTF(p1);
				dos.writeUTF(p2);
				dos.writeUTF(p3);
				dos.writeUTF(p4);
				dos.writeDouble(p5);
				dos.writeInt(p6);
				dos.writeDouble(disc);
			}
		}
		catch(EOFException e1){}
		if (f==0)
		System.out.println("\n\nSorry.....NOT FOUND.....");
		else
		System.out.println("\n\nData Updation Over............");
		dos.close();
		dis.close();
		f1.delete();
		File f3 = new File("Gift.dat");
		f2.renameTo(f3);
		System.out.print("Press ENTER to GO BACK....");
		br.readLine();
		clear();
}
     static void showProductDetails() throws IOException
	{
     BufferedReader ob=new BufferedReader(new InputStreamReader(System.in));
     DataInputStream dis=new DataInputStream(new FileInputStream("Gift.dat"));
     String ocn,pd1,pd2,pd3,pd4;
     double pd5,disc;
     int f=0,i,pd6,c=0;
     System.out.print("Enter the Occasion:");
     ocn=ob.readLine();
     try
     {
       while(true)
       {
         pd1=dis.readUTF();
         pd2=dis.readUTF();
         pd3=dis.readUTF();
         pd4=dis.readUTF();
         pd5=dis.readDouble();
         pd6=dis.readInt();
		 disc=dis.readDouble();
         if(ocn.equalsIgnoreCase(pd1))
         {
            if (c==0)
            {
               clear();
               System.out.println("Occasion Entered: "+ocn);
               System.out.println("*--------------------------------------------------------------------------*");
               System.out.println("*Prod. Name     Product ID     Manufacturer     Price     Stock     Disount*");
               System.out.println("*--------------------------------------------------------------------------*");
            }
            System.out.print(" "+pd2);
            for(i=0;i < (18-(pd2.length()));i++)
              System.out.print(" ");
            System.out.print(pd3);
            for(i=0;i < (13-(pd3.length()));i++)
              System.out.print(" ");
            System.out.print(pd4);
            for(i=0;i < (10-(pd4.length()));i++)
            System.out.print(" ");
			for(i=0;i<5;i++)
			System.out.print(" ");
			System.out.print(pd5);
			for(i=0;i<(9-((Integer.toString(pd6).trim()).length()));i++)
			System.out.print(" ");
			System.out.print(pd6);
			for(i=0;i<(11-((Double.toString(disc).trim()).length()));i++)
			System.out.print(" ");
			System.out.println(disc+"%");
            f=1;
            c++;
            if (c==16)
			{
               c=0; System.out.print("Press Enter to Next...");
               ob.readLine();
            }
         }
       }
   }
   catch(EOFException e1){}
   if (f==0)
   {
      System.out.println("\n\nSorry.....PRODUCT NOT FOUND.....");
      System.out.print("Press Enter ................");
   }
   else
   {
      System.out.println("\n\nDisplay Over............");
      System.out.print("Press Enter ................");
   }
   ob.readLine();
   dis.close();
   clear();
  }
  static void readcus() throws IOException
  {
	BufferedReader ob=new BufferedReader(new InputStreamReader(System.in));
	String a="",b="",c="",d="";
	File f=new File("login.dat");
	DataInputStream dis=new DataInputStream(new FileInputStream(f));
	try
	{
		if(cusEnt>=0)
		{
			while(true)
			{
				a=dis.readUTF();
				b=dis.readUTF();
				c=dis.readUTF();
				d=dis.readUTF();
				System.out.println("-------------------------------------------------------------------------------");
				System.out.println("CUSTOMER NAME        PASSWORD       PHONE NO          MAIL ID                  ");
				System.out.println("-------------------------------------------------------------------------------");
				System.out.println(a+"		"+b+"	   "+c+"	  "+d);
			
			}
		}
		else System.out.println("NO CUSTOMER ENTRIES");
	}
	catch(EOFException e){}
	System.out.println("PRESS ENTER TO CONTINUE ");
	ob.readLine();
	clear();
  }
  // CUSTOMER PART
  static void option3() {
		Scanner rc=new Scanner(System.in);
		System.out.println("\n\t\t*******************************************************");
		System.out.println("\n\t\t*       CHOOSE ONE OF THE FOLLOWING                   *");
		System.out.println("\n\t\t*                                                     *");
		System.out.println("\n\t\t*     PRESS 1 FOR CREATING A NEW ACCOUNT              *");
		System.out.println("\n\t\t*     PRESS 2 FOR LOGING IN TO AN EXISTING ACCOUNT    *");
		System.out.println("\n\t\t*     PRESS 3 FOR RETURNING BACK                      *");
		System.out.println("\n\t\t*                                                     *");
		System.out.println("\n\t\t*******************************************************");
		for(int i=0; i<=9; ++i) System.out.println();
		System.out.print("\t\t\t   Enter your Choice :- ");
	}
	static void option4() 
	{
	System.out.println("\t\t-----------------------------------------------------------");
       System.out.println("\t\t|   ******     CHOOSE ONE OF THE FOLLOWING    ******     |");
       System.out.println("\t\t----------------------------------------------------------");
       System.out.println("\t\t----------------------------------------------------------");
       System.out.println("\t\t|                                                        |");
       System.out.println("\t\t|                                                        |");
       System.out.println("\t\t|        P R E S S   1   FOR    M A R R I A G E          |");
       System.out.println("\t\t|                                                        |");
       System.out.println("\t\t|                                                        |");
       System.out.println("\t\t|        P R E S S   2   FOR   B R A T O P A N A Y A N   |");
       System.out.println("\t\t|                                                        |");
       System.out.println("\t\t|                                                        |");
       System.out.println("\t\t|        P R E S S   3   FOR  B I R T H D A Y            |");
       System.out.println("\t\t|                                                        |");
       System.out.println("\t\t|                                                        |");
       System.out.println("\t\t|       P R E S S   4    FOR  P R E V I O U S   M E N U  |");
       System.out.println("\t\t|                                                        |");
       System.out.println("\t\t|                                                        |");
       System.out.println("\t\t----------------------------------------------------------");
		for(int i=0; i<=9; ++i) System.out.println();
		System.out.print("\t\t\t   Enter your Choice :- ");
	}

	static void login() throws IOException 
	{
		BufferedReader oc = new BufferedReader(new InputStreamReader(System.in));
		clear();
		Scanner sc = new Scanner(System.in);
		System.out.println();
		System.out.println("\n\t\t--------------------------------");
		System.out.println("\n\t\t|                              |");
		System.out.println("\n\t\t|	LOGIN PAGE             |");
		System.out.println("\n\t\t|                              |");
		System.out.println("\n\t\t|--------------------------------");
		System.out.println();
		for(int i=0; i<=9; ++i) System.out.println();
		System.out.println("Enter your name:");
		System.out.println();
		a = sc.next();
		clear();
		for(int i=0; i<=9; ++i) System.out.println();
		System.out.println();
		System.out.println("Enter your password:");
		System.out.println();
		String b = sc.next();
		clear();
		for(int i=0; i<=9; ++i) System.out.println();
		System.out.println("ENTER YOUR SHIPPING ADRESSS");
		cadd=oc.readLine();
		clear();
		for(int i=0; i<=9; ++i) System.out.println();
		System.out.println("ENTER TODAY'S DATE IN (DD/MM/YY)");
		cdate=oc.readLine();
		File f = new File("login.dat");
		DataInputStream ob = new DataInputStream(new FileInputStream(f));
		try {
			while (true) {

				String s1 = ob.readUTF();
				String s2 = ob.readUTF();
				String s3 = ob.readUTF();
				if (s1.equalsIgnoreCase(a) && s2.equalsIgnoreCase(b)) {
					System.out.println("LOGIN SUCCESSFUL");
					String state = s3;
					flag = true;
					System.out.println();
					break;
				}
			}
		} catch (Exception e) {
		}
		;
		if (flag == false) 
		{

			System.out.println("LOGIN FAILED PLEASE ENTER CORRECT DETAILS ..");
			signup();
		}

	}

	static void signup() throws IOException 
	{
		BufferedReader oc = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);
		clear();
		System.out.println();
		System.out.println("\n\t\t|--------------------------------");
		System.out.println("\n\t\t|                               |");
		System.out.println("\n\t\t|	       SIGNUP PAGE            |");
		System.out.println("\n\t\t|                               |");
		System.out.println("\n\t\t|--------------------------------");
		System.out.println(); 
		System.out.println("");
		System.out.println("Enter your Full name");
		a = sc.next();
		clear();
		for(int i=0; i<=9; ++i) System.out.println();
		System.out.println("Enter your new password");
		String b = sc.next();
		clear();
		for(int i=0; i<=9; ++i) System.out.println();
		System.out.println("Enter your phone number");
		String c = sc.next();
		clear();
		for(int i=0; i<=9; ++i) System.out.println();
		System.out.println("Enter your Mail id");
		String d = sc.next();
		clear();
		for(int i=0; i<=9; ++i) System.out.println();
		System.out.println("ENTER YOUR SHIPPING ADRESSS");
		cadd=oc.readLine();
		clear();
		for(int i=0; i<=9; ++i) System.out.println();
		System.out.println("ENTER TODAY'S DATE IN (DD/MM/YY)");
		cdate=oc.readLine();
		File f = new File("login.dat");
		DataOutputStream ob = new DataOutputStream(new FileOutputStream(f, true));
		ob.writeUTF(a);
		ob.writeUTF(b);
		ob.writeUTF(c);
		ob.writeUTF(d);
		System.out.println("");
		System.out.println("Thank you for signing in...");
		System.out.println();
		oc.readLine();
		flag = true;
		System.out.println("HELLO " + a + "\n" + "WELCOME TO PRATYUSH GIFT SHOP");
		oc.readLine();
		clear();
		userfun();
	}
	static void buy() throws IOException 
	{
		BufferedReader ob = new BufferedReader(new InputStreamReader(System.in));
		DataInputStream dis = new DataInputStream(new FileInputStream("Gift.dat"));
		DataOutputStream dos1 = new DataOutputStream(new FileOutputStream("Product.dat"));
		String pd1 = "", pd2 = "", pd3 = "", pd4 = "";
		double pd5 = 0, disc = 0;
		int f =0, i, pd6 = 0, q = 0, c = 0;
		try 
		{
			while (true) 
			{
				pd1 = dis.readUTF();
				pd2 = dis.readUTF();
				pd3 = dis.readUTF();
				pd4 = dis.readUTF();
				pd5 = dis.readDouble();
				pd6 = dis.readInt();
				disc = dis.readDouble();
				if (choice.equalsIgnoreCase(pd1) && (f == 0))
				{
						clear();
						System.out.println("Occasion Entered: " + pd1);
						System.out.println("*--------------------------------------------------------------------------*");
						System.out.println("*Prod. Name     Product ID     Manufacturer     Price     Stock     Disount*");
						System.out.println("*--------------------------------------------------------------------------*");
					System.out.print(" " + pd2);
					for (i = 0; i < (18 - (pd2.length())); i++)
						System.out.print(" ");
					System.out.print(pd3);
					for (i = 0; i < (13 - (pd3.length())); i++)
						System.out.print(" ");
					System.out.print(pd4);
					for (i = 0; i < (10 - (pd4.length())); i++)
						System.out.print(" ");
					for (i = 0; i < 5; i++)
						System.out.print(" ");
					System.out.print(pd5);
					for (i = 0; i < (9 - ((Integer.toString(pd6).trim()).length())); i++)
						System.out.print(" ");
					System.out.print(pd6);
					for (i = 0; i < (11 - ((Double.toString(disc).trim()).length())); i++)
						System.out.print(" ");
					System.out.println(disc+"%");
					System.out.print("Are the Information Correct to Purchase : [Y/N] : ");
					char ans = ob.readLine().toUpperCase().charAt(0);
					if (ans == 'Y') 
					{
						System.out.print("Enter Quantity : ");
						q = Integer.parseInt(ob.readLine());
						if (pd6 >= q) {
							DataOutputStream dos=new DataOutputStream(new FileOutputStream("Customer.dat"));
							dos.writeUTF(a);
							dos.writeUTF(cadd);
							dos.writeUTF(cdate);
							dos.writeUTF(pd1);
							dos.writeUTF(pd2);
							dos.writeUTF(pd3);
							dos.writeUTF(pd4);
							dos.writeDouble(pd5);
							dos.writeInt(q);
							dos.writeDouble(disc);
							dos.close();
							f=1;
							clear();
							System.out.println("PRESS ENTER TO CONTINUE TO BILLING->>>");
							ob.readLine();
							payBill();
						}
						else 
						{
							System.out.println("Stock not Avail.........");
							q = 0;
						}
					}
					dos1.writeUTF(pd1);
					dos1.writeUTF(pd2);
					dos1.writeUTF(pd3);
					dos1.writeUTF(pd4);
					dos1.writeDouble(pd5);
					dos1.writeInt(pd6 - q);
					dos1.writeDouble(disc);
					System.out.println("-------------------------------------------------------------------------------");
					System.out.print("Press Enter to Next...");
					ob.readLine();
				} else 
				{
					dos1.writeUTF(pd1);
					dos1.writeUTF(pd2);
					dos1.writeUTF(pd3);
					dos1.writeUTF(pd4);
					dos1.writeDouble(pd5);
					dos1.writeInt(pd6);
					dos1.writeDouble(disc);
				}
			}
		} catch (EOFException e1) {}
		if (f == 0) 
		{
			System.out.println("\n\nSorry.....THERE ARE NO MORE OTHER PRODUCTS ARE THERE IN OUR STORE.....");
			System.out.print("Press Enter ................");
		} else 
		{
			System.out.println("-------------------------------------------------------------------------------");
			System.out.println("\n\nUpdation Over............");
			System.out.print("Press Enter ................");
		}
		ob.readLine();
		dis.close();
		dos1.close();
		File ff1 = new File("Gift.dat");
		ff1.delete();
		File ff2 = new File("Product.dat");
		File ff3 = new File("Gift.dat");
		ff2.renameTo(ff3);
		clear();
		userfun();
	}
	static void userfun() throws IOException 
	{
		BufferedReader ob=new BufferedReader(new InputStreamReader(System.in));
		Scanner rc = new Scanner(System.in);
		option4();
		int uc = rc.nextInt();
		clear();
		switch (uc) 
		{
			case 1:
				clear();
				choice = "Marriage";
				buy();
				break;
			case 2:
				clear();
				choice = "BRATOPANAYAN";
				buy();
				break;
			case 3:
				clear();
				choice = "BIRTHDAY";
				buy();
				break;
			case 4:
				break;
		}
	}
	static void payBill() throws IOException
  {
    BufferedReader ob=new BufferedReader(new InputStreamReader(System.in));
    DataInputStream dis=new DataInputStream(new FileInputStream("Customer.dat"));
    String pd1,pd2,pd3,pd4,nm,cname,add,cpc,cpd,xx="";
    double pd5,ptotal=0.0,gtotal=0.0,cost=0.0,gst=0.18,disc;
    int f=0,i,q=0,c=0,no;
    System.out.print("Re-enter Customer's Name :");
    nm=ob.readLine();
    System.out.print("Re-enter Customer's Address : ");
    add=ob.readLine();
    System.out.print("Re-enter the Purchase Date in (DD/MM/YY) : ");
    cpd=ob.readLine();
    try
    {
       while(true)
       {
			a=dis.readUTF();
			cadd=dis.readUTF();
			cdate=dis.readUTF() ;
			pd1=dis.readUTF();
			pd2=dis.readUTF();
			pd3=dis.readUTF();
			pd4=dis.readUTF();
			pd5=dis.readDouble();
			q=dis.readInt();
			disc=dis.readDouble();
			if(a.equalsIgnoreCase(nm) && add.equalsIgnoreCase(cadd) && cpd.equalsIgnoreCase(cdate))
			{
				if(c==0)
				{ 
					clear();
					System.out.println("\t\t\t\t	B I L L I N G");
					System.out.println("\t\t\t\t	=============");
					System.out.println("Customer Name : "+a);
					System.out.print("Address       : "+cadd);
					for(i=0;i < (40-(cadd.length()));i++)
					System.out.print(" ");
					System.out.println("		DATE:" + cpd);
					System.out.println("------------------------------------------------------------------------------------------------------------");
					System.out.println("Prod. Name    Product ID      MANUFACTURER       QTY     PRICE        I.G.S.T       DISCOUNT       AMOUNT    ");
					System.out.println("------------------------------------------------------------------------------------------------------------");
				}
				f=1;
				System.out.print(pd2);
				for(i=0;i < (16-(pd2.length()));i++)
				System.out.print(" ");
				System.out.print(pd3);
				for(i=0;i < (18-(pd3.length()));i++)
				System.out.print(" ");
				System.out.print(pd4);
				for(i=0;i < (17-(pd4.length()));i++)
				System.out.print(" ");
				xx=Integer.toString(q); xx.trim();
				System.out.print(xx);
				for(i=0;i < (7-(xx.length()));i++)
				System.out.print(" ");
				xx=Double.toString(pd5); xx.trim();
				System.out.print(xx);
				for(i=0;i < (13-(xx.length()));i++)
				System.out.print(" ");
				System.out.print("18%");
				for(i=0;i < (15-(xx.length()));i++)
				System.out.print(" ");
				System.out.print(disc+"%");
				for(i=0;i < (14-(xx.length()));i++)
				System.out.print(" ");
	     		xx=Double.toString((q*pd5)); xx.trim();
				System.out.println(xx);
				cost=((q*pd5)+(pd5*(disc/100)));
				ptotal =cost+(cost*gst);gtotal+=ptotal;
				c++; 
				if(c==10)
			    {
					System.out.println("-----------------------------------------------------------------------------------------------------------");
					System.out.println("\t\t\t\t\t\t      Page Total = "+ptotal);
					ptotal=0.0;
					System.out.print("\t\t\t\t\t\t  Press Enter to NEXT >>>>");
					ob.readLine();
					c=0;
				}
            }
        }
      }
      catch(EOFException e1){}
      dis.close();
      if (f==0)
      {
         System.out.println("\n\nSorry WRONG ENTRY..... PLEASE TRY AGAIN.....");
         System.out.print("Press Enter ................");
      }
      else
      {
         System.out.println("------------------------------------------------------------------------------------------------------------");
         System.out.println("\t\t\t\t\t\t																			Grand Total = "+gtotal);
         System.out.println("------------------------------------------------------------------------------------------------------------");
         System.out.print("\t\t\t\t\t\t  PRESS ENTER TO CONTINUE TO PAYMENT PAGE >>>>");  
		 ob.readLine();
		 clear();
		 pay();
		 clear();
		 System.out.println("YOUR PAYMENT HAS BEEN DONE SUCCESSFUL");
		 System.out.println("YOUR ORDER WILL BE PLACED SOON WITHIN 6-7 DAYS");
	     System.out.println("THANKS FOR VISTING PRATYUSH GIFT SHOP");		 
      }
      
  } 
  static void pay() throws IOException
  {
	    BufferedReader oc=new BufferedReader(new InputStreamReader(System.in));
		Scanner sc=new Scanner(System.in);
		System.out.println("\n\t\tCHOOSE YOUR PAYMENT OPTION  ");
		System.out.println("\n\t\t============================");
		System.out.println();
		System.out.println("\n\t\tENTER 1 FOR DEBIT CARDS     ");
		System.out.println("\n\t\tENTER 2 FOR CREDIT CARDS    ");
		System.out.println("\n\t\tENTER 3 FOR PHONE PE        ");
		System.out.println("\n\t\tENTER 4 FOR GOOGLE PAY      ");
		System.out.println("\n\t\tENTER 5 FOR UPI ID          ");
		System.out.println("\n\t\tENTER 6 FOR CASH ON DELIVERY");
		for(int i=0; i<=9; ++i) System.out.println();
		System.out.print("\t\t\t   Enter your Choice :- ");
		int pay=sc.nextInt();
		switch(pay)
		{
			case 1:clear();
			System.out.println("ENTER YOUR BANK NAME:");
			String bn=oc.readLine();
			System.out.println("ENTER YOUR DEBIT CARD NO:");
			String dcn=oc.readLine();
			System.out.println("ENTER YOUR FULL NAME NO CARD:");
			String nc=oc.readLine();
			System.out.println("ENTER YOUR EXPIRY DATE OF YOUR CARD:");
			String ex1=oc.readLine();
			System.out.println("ENTER CVV NO ON THE BACK SIDE OF YOUR CARD:");
			String cv=oc.readLine();
			break;
			case 2:clear();
			System.out.println("ENTER YOUR BANK NAME:");
			String bnc=oc.readLine();
			System.out.println("ENTER YOUR CREDIT CARD NO:");
			int ccn=sc.nextInt();
			System.out.println("ENTER YOUR FULL NAME NO CARD:");
			String nc1=oc.readLine();
			System.out.println("ENTER YOUR EXPIRY DATE OF YOUR CARD:");
			String ex=oc.readLine();
			System.out.println("ENTER CVV NO ON THE BACK SIDE OF YOUR CARD:");
			String cv1=oc.readLine();
			break;
			case 3:clear();
			System.out.println("ENTER YOUR PHONE PE NO");
			int pp=sc.nextInt();
			System.out.println("ENTER YOUR UPI PIN");
			int up=sc.nextInt();
			break;
			case 4:clear();
			System.out.println("ENTER YOUR GOOGLE PAY NO");
			int gp=sc.nextInt();
			System.out.println("ENTER YOUR UPI PIN");
			int up1=sc.nextInt();
			break;
			case 5:clear();
			System.out.println("ENTER YOUR UPI ID");
			String ui=oc.readLine();
			System.out.println("ENTER YOUR UPI PIN");
			String up2=oc.readLine();
			case 6:clear();
			break;
			default :
				System.out.println("Invalid Option...");
                System.out.print("Press Enter and Re-Enter the option...");
		}
  }
   static void end()  
{
System.out.println("\n\n\n");
System.out.println("\t\t\t#########################################");
System.out.println("\t\t\t##                                     ##");
System.out.println("\t\t\t##    PROGRAMMED BY PRATYUSH MOHANTY   ##");
System.out.println("\t\t\t##                                     ##");
System.out.println("\t\t\t##        STD:X         SEC:B          ##");
System.out.println("\t\t\t##                                     ##");
System.out.println("\t\t\t##            ROLL NO.:23              ##");
System.out.println("\t\t\t##                                     ##");
System.out.println("\t\t\t##    GUIDED BY TUSHAR KANTI SASMAL    ##");
System.out.println("\t\t\t##                                     ##");
System.out.println("\t\t\t##       THANK YOU FOR VISITING.       ##");
System.out.println("\t\t\t##                                     ##");
System.out.println("\t\t\t##            VISIT AGAIN              ##");
System.out.println("\t\t\t##                                     ##");
System.out.println("\t\t\t#########################################");
for(int i=0; i<=9; ++i) System.out.println();
}
 static void exit()  
{
	end();
	System.exit(0);
} 
	static int passwordSaved;
	static void mainScreen() throws IOException 
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		Scanner sc=new Scanner(System.in);
		int ch=0;
		while(ch!=3)
		{
			clear();
			option();
			passwordSaved=0;
			ch=sc.nextInt();
			if(ch==1)
			{
				while(true)
				{	
					if(passwordSaved==0)
					{
						clear();
						System.out.print("Enter the PASSWORD to Continue : ");
						pw=br.readLine();
					
					if(pw.equalsIgnoreCase("BSHS"))
					{	
						passwordSaved=1;
						clear();
						int ch1=0;
						while(ch1!=6)
						{
							option1();
							ch1=sc.nextInt();
							switch(ch1)
							{			
								case 1: clear();add();
								break;
								case 2: clear();remove();
								break;
								case 3: clear();editpro();
								break;
								case 4: clear();showProductDetails();
								break;
								case 5: clear();readcus();
								break;
								case 6: clear(); mainScreen(); break;
								default :
								System.out.println("Invalid Option...");
								System.out.print("Press Enter and Re-Enter the option...");
							}
						}	
						
					}
					 else
					{
						clear();
						System.out.println("\t\t\tInvalid PASSWORD.....");
						System.out.print("\t\t\tRe-Enter the PASSWORD....");
						System.out.println("\n\n\n\n\n\n\n\n");
						for(long j=0;j<=300000000;j++);
						clear();
				} }
				}
			}
			else if(ch==2)
			{
				clear();
				int ch3=0;
				while(ch3!=3)
				{
					option3();
					ch3=sc.nextInt();
					if (ch3 == 1) 
					{
						clear();
						signup();
					} 
					else if (ch3 == 2) 
					{
						login();
						clear();
						userfun();
					} 
					else if (ch3 == 3) break;
					else System.out.println("PLEASE ENTER THE CORRECT NUMBER");
				}
			}
			else if(ch==3) 
			{
				clear();
				end();
				System.exit(0);
			} 
		}
	
	}
	 public static void main(String ar[])throws IOException
	{
		start();
		mainScreen();
	} 
}