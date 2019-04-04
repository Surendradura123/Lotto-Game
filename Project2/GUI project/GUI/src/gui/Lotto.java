/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.io.Serializable;

/**
 *
 * @author x15007669
 */
public class Lotto implements Serializable {
        int l1n1, l1n2, l1n3, l1n4, l1n5;
        int l2n1, l2n2, l2n3, l2n4, l2n5;
        int l3n1, l3n2, l3n3, l3n4, l3n5;
        int SecretNum[], count1, count2, count3;
        String l1n1String, l1n2String, l1n3String, l1n4String, l1n5String;
        String l2n1String, l2n2String, l2n3String, l2n4String, l2n5String;
        String l3n1String, l3n2String, l3n3String, l3n4String, l3n5String;
    
        
        public Lotto(){
        l1n1=0;
        l1n2=0;
        l1n3=0;
        l1n4=0;
        l1n5=0;
        l2n1=0;
        l2n2=0;
        l2n3=0;
        l2n4=0;
        l2n5=0;
        l3n1=0; 
        l3n2=0; 
        l3n3=0; 
        l3n4=0; 
        l3n5=0;
        SecretNum = new int[5];
        count1 = 0;
        count2 = 0;
        count3 = 0;
        l1n1String = " "; 
        l1n2String=""; 
        l1n3String="";
        l1n4String=""; 
        l1n5String="";
        l2n1String="";
        l2n2String="";
        l2n3String="";
        l2n4String="";
        l2n5String="";
        l3n1String="";
        l3n2String="";
        l3n3String="";
        l3n4String="";
        l3n5String="";
        }

    public void setL1n1(int l1n1) {
        this.l1n1 = l1n1;
    }

    public void setL1n2(int l1n2) {
        this.l1n2 = l1n2;
    }

    public void setL1n3(int l1n3) {
        this.l1n3 = l1n3;
    }

    public void setL1n4(int l1n4) {
        this.l1n4 = l1n4;
    }

    public void setL1n5(int l1n5) {
        this.l1n5 = l1n5;
    }

    public void setL2n1(int l2n1) {
        this.l2n1 = l2n1;
    }

    public void setL2n2(int l2n2) {
        this.l2n2 = l2n2;
    }

    public void setL2n3(int l2n3) {
        this.l2n3 = l2n3;
    }

    public void setL2n4(int l2n4) {
        this.l2n4 = l2n4;
    }

    public void setL2n5(int l2n5) {
        this.l2n5 = l2n5;
    }

    public void setL3n1(int l3n1) {
        this.l3n1 = l3n1;
    }

    public void setL3n2(int l3n2) {
        this.l3n2 = l3n2;
    }

    public void setL3n3(int l3n3) {
        this.l3n3 = l3n3;
    }

    public void setL3n4(int l3n4) {
        this.l3n4 = l3n4;
    }

    public void setL3n5(int l3n5) {
        this.l3n5 = l3n5;
    }

    public void setL1n1String(String l1n1String) {
        this.l1n1String = l1n1String;
    }

    public void setL1n2String(String l1n2String) {
        this.l1n2String = l1n2String;
    }

    public void setL1n3String(String l1n3String) {
        this.l1n3String = l1n3String;
    }

    public void setL1n4String(String l1n4String) {
        this.l1n4String = l1n4String;
    }

    public void setL1n5String(String l1n5String) {
        this.l1n5String = l1n5String;
    }

    public void setL2n1String(String l2n1String) {
        this.l2n1String = l2n1String;
    }

    public void setL2n2String(String l2n2String) {
        this.l2n2String = l2n2String;
    }

    public void setL2n3String(String l2n3String) {
        this.l2n3String = l2n3String;
    }

    public void setL2n4String(String l2n4String) {
        this.l2n4String = l2n4String;
    }

    public void setL2n5String(String l2n5String) {
        this.l2n5String = l2n5String;
    }

    public void setL3n1String(String l3n1String) {
        this.l3n1String = l3n1String;
    }

    public void setL3n2String(String l3n2String) {
        this.l3n2String = l3n2String;
    }

    public void setL3n3String(String l3n3String) {
        this.l3n3String = l3n3String;
    }

    public void setL3n4String(String l3n4String) {
        this.l3n4String = l3n4String;
    }

    public void setL3n5String(String l3n5String) {
        this.l3n5String = l3n5String;
    }

    public int[] getSecretNum() {
        return SecretNum;
    }

    public int getCount1() {
        return count1;
    }

    public int getCount3() {
        return count3;
    }

    public int getL1n1() {
        return l1n1;
    }

    public int getL1n2() {
        return l1n2;
    }

    public int getL1n3() {
        return l1n3;
    }

    public int getL1n4() {
        return l1n4;
    }

    public int getL1n5() {
        return l1n5;
    }

    public int getL2n1() {
        return l2n1;
    }

    public int getL2n2() {
        return l2n2;
    }

    public int getL2n3() {
        return l2n3;
    }

    public int getL2n4() {
        return l2n4;
    }

    public int getL2n5() {
        return l2n5;
    }

    public int getL3n1() {
        return l3n1;
    }

    public int getL3n2() {
        return l3n2;
    }

    public int getL3n3() {
        return l3n3;
    }

    public int getL3n4() {
        return l3n4;
    }

    public int getL3n5() {
        return l3n5;
    }

    public int getCount2() {
        return count2;
    }

    public String getL1n1String() {
        return l1n1String;
    }

    public String getL1n2String() {
        return l1n2String;
    }

    public String getL1n3String() {
        return l1n3String;
    }

    public String getL1n4String() {
        return l1n4String;
    }

    public String getL1n5String() {
        return l1n5String;
    }

    public String getL2n1String() {
        return l2n1String;
    }

    public String getL2n2String() {
        return l2n2String;
    }

    public String getL2n3String() {
        return l2n3String;
    }

    public String getL2n4String() {
        return l2n4String;
    }

    public String getL2n5String() {
        return l2n5String;
    }

    public String getL3n1String() {
        return l3n1String;
    }

    public String getL3n2String() {
        return l3n2String;
    }

    public String getL3n3String() {
        return l3n3String;
    }

    public String getL3n4String() {
        return l3n4String;
    }

    public String getL3n5String() {
        return l3n5String;
    }
}

            

    
