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
public class ComputerLab extends ClassRoom {
    private int numPC;
    
    
    public ComputerLab(){
        numPC = 0;
        
    }

    public ComputerLab(int numPC) {
        this.numPC = numPC;
    }

    public ComputerLab(int num, int cap,int numPC ) {
        super(num, cap);
        this.numPC = numPC;
    }

    public int getNumPC() {
        return numPC;
    }

    public void setNumPC(int numPC) {
        this.numPC = numPC;
    }
    public String getPrintDetails(){
        return super.getPrintDetails()+","+numPC;
    }

}
