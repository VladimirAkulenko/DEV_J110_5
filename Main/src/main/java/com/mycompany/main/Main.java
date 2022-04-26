/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.main;

/**
 *
 * @author USER
 */
public class Main {

    private final static double EPS = 0.00005;

    public static void main(String[] args) {

        //Вложенный класс
        double f1 = EquationRoots.findRoot(new ExMinusAhalf(),0.01,2, EPS);
        System.out.println("f1 = "+ f1);

        //Анонимный класс
        double f2 = EquationRoots.findRoot(new Function() {
            @Override
            public double getFunc(double x) {
                return Math.sin(x) -0.75;}
        },2, 3, EPS);
        System.out.println("f2 = " + f2);

        // Ссылка на статический метод
        double f3 = EquationRoots.findRoot(Math::tan,2,4, EPS);
        System.out.println("f3 = " + f3);

        //Ссылка на метод экземпляра
        Function lnCubMinus2 = new LnCubMinus2();
        double f4 = EquationRoots.findRoot(lnCubMinus2,1, 3, EPS);
        System.out.println("f4 = "+ f4);

        //Лямбда-выражение
        double f5 = EquationRoots.findRoot((double x) -> Math.pow(x,3)-8*x+2, 1, 5, EPS);
        System.out.println("f5 = " + f5);

    }

    private static class ExMinusAhalf implements Function {

        @Override
        public double getFunc(double x) {
            return Math.exp(-x)-0.5;
        }
    }
}
