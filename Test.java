package com.cjc.ims.app.client;
import com.cjc.ims.app.serviceimpl.*;
import java.util.*;

public class Test{

public static void main(String args[]){

Scanner sc = new Scanner(System.in);
Karvenagar k = new Karvenagar();

do{
System.out.println("Enter choice 1: Add Course \n"+"\t2: View Course\n"+"\t3: Add Faculty \n"+"\t4: View Faculty\n"+"\t5: Add Batch\n"+"\t6: View Batch\n"+"\t7: Add Student\n"+"\t8: View Student\n"+"\t9 : Exit");

      System.out.println("---------------------------------------");

int ch = sc.nextInt();
if(ch==1){
      k.addCourse();
      System.out.println("---------------------------------------");
}else if(ch==2){
      k.viewCourse();
      System.out.println("---------------------------------------");
}else if(ch==3){
      k.addFaculty();
      System.out.println("---------------------------------------");
}else if(ch==4){
      k.viewFaculty();
      System.out.println("---------------------------------------");
}else if(ch==5){
      k.addBatch();
      System.out.println("---------------------------------------");
}else if(ch==6){
      k.viewBatch();
      System.out.println("---------------------------------------");
}else if(ch==7){
      k.addStudent();
      System.out.println("---------------------------------------");
}else if(ch==8){
      k.viewStudent();
      System.out.println("---------------------------------------");
}else if(ch==9){
      System.out.println("Exiting...");
      System.out.println("---------------------------------------");
      break;
}

}while(true);



      
}

}