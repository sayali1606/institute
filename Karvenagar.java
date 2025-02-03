package com.cjc.ims.app.serviceimpl;
import java.util.*;
import com.cjc.ims.app.servicei.*;
import com.cjc.ims.app.model.*;

public class Karvenagar implements Cjc{

Scanner sc = new Scanner(System.in);

List<Course> clist = new ArrayList<>();
List<Batch> blist = new ArrayList<>();
List<Faculty> flist = new ArrayList<>();
List<Student> slist = new ArrayList<>();

public void addCourse(){

System.out.println("How many courses do you want to add?");
int n = sc.nextInt();

for(int i =0;i<n;i++){
Course c = new Course();

System.out.println("Enter course name");
String name = sc.next();
c.setCname(name);

System.out.println("Enter course id"); 
int id = sc.nextInt();
c.setCid(id);

clist.add(c);
}
}


public void viewCourse(){
	clist.forEach((a)->{
		System.out.println("Course Id : "+a.getCid());
		System.out.println("Course Name : "+a.getCname());
			   });
}



public void addFaculty(){
System.out.println("How many faculties do you want to add?");
int n = sc.nextInt();

for(int i =0;i<n;i++){
Faculty f = new Faculty();

System.out.println("Enter faculty name");
String name = sc.next();
f.setFname(name);

System.out.println("Enter faculty id");
int fid = sc.nextInt();
f.setFid(fid);

outerloop:
while(true){
System.out.println("Enter course id");
int cid = sc.nextInt();

for(Course c : clist){
      if(c.getCid()==cid){
		f.setCourse(c);
                break outerloop;
        }else{
		System.out.println("Course Id does not exist");
        }
}
}

flist.add(f);
     }   
}

public void viewFaculty(){
//System.out.println(flist);
flist.forEach((f)->{
	System.out.println("Faculty name : "+f.getFname());
	System.out.println("Faculty Id : "+f.getFid());
	System.out.println("Course name : "+f.getCourse().getCname());
	System.out.println("Course id : "+f.getCourse().getCid());
});

}


public void addBatch(){

System.out.println("How many batches do you want to add?");
int n = sc.nextInt();

for(int i =0;i<n;i++){
         Batch b = new Batch();

         System.out.println("Enter batch name");
         String name = sc.next();
         b.setBname(name);

         System.out.println("Enter batch id");
         b.setBid(sc.nextInt());

         
        outerloop: 
	while(true){
	System.out.println("Enter faculty id");
	int fid = sc.nextInt();
    
	for(Faculty f:flist){
	   if(f.getFid()==fid){
	   b.setFaculty(f);
	   break outerloop;
	}else{
	   System.out.println("Invalid faculty id");
	}
       }
      }

        blist.add(b);
      }   
}




public void viewBatch(){
     Iterator<Batch> itr = blist.iterator();
     while(itr.hasNext()){
     Batch bt = itr.next();
     System.out.println("Batch name : "+bt.getBname());
     System.out.println("Batch id : "+bt.getBid());
     System.out.println("Faculty name : "+bt.getFaculty().getFname());
     System.out.println("Faculty id : "+bt.getFaculty().getFid());
     System.out.println("Course name : "+bt.getFaculty().getCourse().getCname());
     System.out.println("Course name : "+bt.getFaculty().getCourse().getCid());
      }
}


public void addStudent(){

System.out.println("How many student do you want to add?");
int n = sc.nextInt();

for(int i =0;i<n;i++){
Student s = new Student();

System.out.println("Enter student's name");
String name = sc.next();
s.setSname(name);

System.out.println("Enter student id");
int id = sc.nextInt();
s.setSid(id);

outerloop:
while(true){
     System.out.println("Enter batch id");
     int bid = sc.nextInt();
    
     for(Batch b : blist){
          if(b.getBid()==bid){
               s.setBatch(b);
               break outerloop;
        }else{
		System.out.println("Batch Id not found. ");
        }      
     }

}

slist.add(s);
  }
}



public void viewStudent(){

Iterator<Student> itr = slist.iterator();
while(itr.hasNext()){
      Student s = itr.next();
      System.out.println("Student name : "+s.getSname());
      System.out.println("Student Id : "+s.getSid());
      System.out.println("Batch name : "+s.getBatch().getBname());
      System.out.println("Batch Id : "+s.getBatch().getBid());
      System.out.println("Faculty name : "+s.getBatch().getFaculty().getFname());
      System.out.println("Faculty id : "+s.getBatch().getFaculty().getFid());
      System.out.println("Course name : "+s.getBatch().getFaculty().getCourse().getCname());
      System.out.println("Course id : "+s.getBatch().getFaculty().getCourse().getCid());   
}

}















 

}