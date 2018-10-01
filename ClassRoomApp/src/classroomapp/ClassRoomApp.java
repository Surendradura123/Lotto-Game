/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classroomapp;

/**
 *
 * @author x15007669
 */
public class ClassRoomApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ClassRoom c=new ClassRoom();
        c.setNum(2);
        c.setCap(49);
        System.out.println("ClassRoom:"+c.getNum()+","+c.getCap());
        System.out.println("ClassRoom:"+c.getPrintDetails());
        
        //using oerloaded constructor
        ClassRoom c1=new ClassRoom(3,50);
        System.out.println("ClassRoom:"+c1.getNum()+","+c1.getCap());
        System.out.println("ClassRoom:"+c1.getPrintDetails());
        
        
        BYODRoom b= new BYODRoom();
        b.setNum(5);
        b.setCap(60);
        b.setNumPower(60);
        System.out.println("BYODRoom:"+b.getPrintDetails());
        
       //overloaded constructor
        BYODRoom b1= new BYODRoom(4,50,50);
        System.out.println("BYODRoom:"+b1.getPrintDetails());
        
        ComputerLab l= new ComputerLab();
       l.setNum(5);
       l.setCap(40);
       l.setNumPC(40);
        System.out.println("ComputerLab:"+l.getPrintDetails());
        
       
        //overloaded constructor
        ComputerLab l1= new ComputerLab(3,50,50);
       System.out.println("ComputerLab:"+l1.getPrintDetails());
        
        
    }

    
        
}
