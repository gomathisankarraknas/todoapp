import java.io.File.*;
import java.io.*;
import java.util.Date;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import javax.swing.JTextField;
public class hello
{
	public static void main(String args[])
	{

		SimpleDateFormat sdd= new SimpleDateFormat("dd/MM/yyyy");
		
		Date d= new Date();
		sdd.format(d);
		String da=sdd.format(d);
		System.out.println("Today date is "+da);
		BufferedReader br = null;
		FileReader fr = null;

		try {

			
			fr = new FileReader("temp.txt");
			br = new BufferedReader(fr);

			String sCurrentLine;

			while ((sCurrentLine = br.readLine()) != null) {
				String arr[]=sCurrentLine.split("#");
				//System.out.println("from print"+arr[0]);
				if(arr[0].equals(da))
				{
					String arr1[]=arr[1].split(",");
					for(int i=0;i<arr1.length;i++)
					{
						System.out.println(arr1[i]);
					}
				}
				
			}

		} catch (IOException e) {

			e.printStackTrace();

		} finally {

			try {

				if (br != null)
					br.close();

				if (fr != null)
					fr.close();

			} catch (IOException ex) {

				ex.printStackTrace();

			}
	}
	System.out.println("Add Remainders? type add to continue");
	Scanner sc1 = new Scanner(System.in);
	String choice = sc1.nextLine();
	String con="";
	do
	{
	if(choice.equals("add"))
	{
	new hello(). getdata();
	}
	System.out.println("Add More Remainders? type yes to continue");
	Scanner sc2 = new Scanner(System.in);
	 con = sc2.nextLine();
	}while(con.equals("yes"));
	System.out.println("Have a Good day!");
	}	
	public void getdata()
	{
	Scanner myObj = new Scanner(System.in);  
    System.out.println("Enter The date you want to add reminders");

    String da = myObj.nextLine();
	System.out.println("Enter The reminder");
	String remain = myObj.nextLine(); 
    System.out.println("your reminders are successfully set--->" +da+"---->"+ remain);
	String newdate=da+"#"+remain+"\n";
	String fileName = "temp.txt"; 
        try { 
            BufferedWriter out = new BufferedWriter( 
                          new FileWriter(fileName, true)); 
            
            out.close(); 
        } 
        catch (IOException e) { 
            System.out.println("Exception Occurred" + e); 
        } 
		try { 
  
 
            BufferedWriter out = new BufferedWriter( 
                   new FileWriter(fileName, true)); 
            out.write(newdate); 
            out.close(); 
        } 
        catch (IOException e) { 
            System.out.println("exception occoured" + e); 
        }		
}
}