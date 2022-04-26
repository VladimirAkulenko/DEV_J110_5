/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

/**
 *
 * @author USER
 */
// Поиск корней уравнения методом половинного деления
public class EquationRoots {


public static double findRoot (Function func, double left, double right, double eps){
    while ((right - left) > eps){
        double m = (left + right)/2;
        if (func.getFunc(m) == 0)
            return m;
        if (func.getFunc(left)<0 && func.getFunc(m)<0 || func.getFunc(left)>0 && func.getFunc(m)>0)
            left = m;
        else if (func.getFunc(m)<0 && func.getFunc(right)<0 || func.getFunc(m)>0 && func.getFunc(right)>0)
            right = m;
    }
    return left;
    }

}
