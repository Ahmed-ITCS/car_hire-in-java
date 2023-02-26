import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner;
import java.io.FileWriter;   // Import the FileWriter class
//Scanner myReader = new Scanner(myObj);

class car{
    int platenum;
    String make;
    String model;
    String year;
    String color;
}


class Staff{
   // private
    //int id;
    void searchcars()
    {
        try {
             Scanner my = new Scanner(System.in);
        System.out.println("enter your car name : ");
        String name = myReader.nextLine();
        System.out.println("enter your price : ");
        String price = myReader.nextLine();
        string s = name+price;


      File myObj = new File("cars.txt");
      Scanner myReader = new Scanner(myObj);
      while (myReader.hasNextLine()) {
        String data = myReader.nextLine();
        if(data == s)
        {
            System.out.println("car found \n",data);
        }
      }
      myReader.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
    }
    void Addcar(car carobj)
    {
        FileWriter myWriter = new FileWriter("cars.txt");
        myWriter.write("1",carobj.platenum,carobj.make,carobj.model,carobj.year,carobj.color);
        myWriter.close();
        System.out.println("car Successfully added");
    }
    static void makecarrented(int id)
    {
        File myObj = new File("cars.txt");
      Scanner myReader = new Scanner(myObj);
      while (myReader.hasNextLine()) {
        int data = myReader.nextInt();
        String d = myReader.nextLine();
        if(data == id)
        {
            FileWriter myWriter = new FileWriter("rented.txt");
            myWriter.write(d);
            myWriter.close();
            System.out.println("Car Successfully rented\n");

        }
        else{

        }
    }
    void unrentcar(car carobj)
    {
        string s = obj.platenum+obj.make+obj.model+obj.year+obj.color;
        File myObj = new File("rented.txt");
        FileWriter myWriter = new FileWriter("unrented.txt");
      Scanner myReader = new Scanner(myObj);
      while (myReader.hasNextLine()) {
        String data = myReader.nextLine();
        if(data == s)
        {

        }
        else{
            myWriter.write(data);
        }
      }

      myObj.delete();
      myWriter.renameto("rented.txt");

    }

  
  }
  class customer{
    int customerid;
    static int id = 0;
    void customer()
    {
        id++;
        customerid = id;

    }
    void asktorentcar()
    {
        File myObj = new File("cars.txt");
      Scanner myReader = new Scanner(myObj);
      Scanner input = new Scanner(System.in);
      while (myReader.hasNextLine()) {
        String data = myReader.nextLine();
        System.out.println(data,"\n");


    }
    System.out.println("enter your car id","\n");
    int choice = input.nextInt();
    staff::makecarrented(choice);

  }
}


class Main{
    public static void main(String[] args) {
        
    }
}