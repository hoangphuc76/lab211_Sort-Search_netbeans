/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Element;
import java.util.*;

/**
 *
 * @author LENOVO
 */
public class Inputter {
    private Scanner sc = new Scanner(System.in);
    private Element element = new Element();
    public int[] EnterArr() {
        System.out.print("Enter number of array: ");
        element.setElement(sc.nextInt());
        int[] elementArr = new int[element.getElement()];
        System.out.println("Enter array: ");
        for (int i = 0; i < element.getElement(); i++) {
            elementArr[i] = sc.nextInt();
        }
        return elementArr;
    } 
}
