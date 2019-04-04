/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.io.Serializable;

/**
 *
 * @author x14105586
 */
public class LottoPlus implements Serializable{
    
    int num1, num2, num3, num4, num5, SecretLotto[], SecretLottoPlus1[], SecretLottoPlus2[], count1, count2, count3;
    String num1String, num2String, num3String, num4String, num5String, Game;
    
    
    public LottoPlus(){
        num1 = 0;
        num2 = 0;
        num3 = 0;
        num4 = 0;
        num5 = 0;
        count1 = 0;
        count2 = 0;
        count3 = 0;
        SecretLotto = new int [5];
        SecretLottoPlus1 = new int [5];
        SecretLottoPlus2 = new int [5];
        num1String = " ";
        num2String = " ";
        num3String = " ";
        num4String = " ";
        num5String = " ";
        Game = " ";  
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int getNum3() {
        return num3;
    }

    public void setNum3(int num3) {
        this.num3 = num3;
    }

    public int getNum4() {
        return num4;
    }

    public void setNum4(int num4) {
        this.num4 = num4;
    }

    public int getNum5() {
        return num5;
    }

    public void setNum5(int num5) {
        this.num5 = num5;
    }

    public int[] getSecretLotto() {
        return SecretLotto;
    }

    public void setSecretLotto(int[] SecretLotto) {
        this.SecretLotto = SecretLotto;
    }

    public int[] getSecretLottoPlus1() {
        return SecretLottoPlus1;
    }

    public void setSecretLottoPlus1(int[] SecretLottoPlus1) {
        this.SecretLottoPlus1 = SecretLottoPlus1;
    }

    public int[] getSecretLottoPlus2() {
        return SecretLottoPlus2;
    }

    public void setSecretLottoPlus2(int[] SecretLottoPlus2) {
        this.SecretLottoPlus2 = SecretLottoPlus2;
    }

    public int getCount1() {
        return count1;
    }

    public void setCount1(int count1) {
        this.count1 = count1;
    }

    public int getCount2() {
        return count2;
    }

    public void setCount2(int count2) {
        this.count2 = count2;
    }

    public int getCount3() {
        return count3;
    }

    public void setCount3(int count3) {
        this.count3 = count3;
    }

    public String getNum1String() {
        return num1String;
    }

    public void setNum1String(String num1String) {
        this.num1String = num1String;
    }

    public String getNum2String() {
        return num2String;
    }

    public void setNum2String(String num2String) {
        this.num2String = num2String;
    }

    public String getNum3String() {
        return num3String;
    }

    public void setNum3String(String num3String) {
        this.num3String = num3String;
    }

    public String getNum4String() {
        return num4String;
    }

    public void setNum4String(String num4String) {
        this.num4String = num4String;
    }

    public String getNum5String() {
        return num5String;
    }

    public void setNum5String(String num5String) {
        this.num5String = num5String;
    }

    public String getGame() {
        return Game;
    }

    public void setGame(String Game) {
        this.Game = Game;
    }
    
    
}
