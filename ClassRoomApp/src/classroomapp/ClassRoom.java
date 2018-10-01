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
public class ClassRoom {
    protected int num;
    protected int cap;
    
    
    
    public ClassRoom(){
        num = 0;
        cap = 0;
    }

    public ClassRoom(int num, int cap) {
        this.num = num;
        this.cap = cap;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getCap() {
        return cap;
    }

    public void setCap(int cap) {
        this.cap = cap;
    }
    public String getPrintDetails(){
        return "ClassRoom:"+num+","+cap;
    }

    

    
    
}
