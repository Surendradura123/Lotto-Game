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
public class BYODRoom extends ClassRoom {
    private int numPower;
    


public BYODRoom(){
   numPower =0;
}

    public BYODRoom(int numPower) {
        this.numPower = numPower;
    }

    public BYODRoom(int num, int cap,int numPower) {
        super(num, cap);
        this.numPower = numPower;
    }

    public int getNumPower() {
        return numPower;
    }

    public void setNumPower(int numPower) {
        this.numPower = numPower;
    }
    
    @Override
    public String getPrintDetails(){
        return super.getPrintDetails()+","+numPower;
    }

   
}

