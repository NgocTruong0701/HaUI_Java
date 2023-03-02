/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ngoct
 */
class Parents{
    int intData;
    float floatData;
}

class Childrens extends Parents{
    int intData; // che dau thuoc tinh intData cua Parents 
    public void overrideTest(){
        intData = 1; // thuoc tinh cua lop con
        super.intData = -1; // thuoc tinh cua lop cha
    }
}





public class main {
    
}
