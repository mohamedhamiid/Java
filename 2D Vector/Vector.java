/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab2;

/**
 *
 * @author mh_sm
 */
public class Vector {
        private double x ;
        private double y;
        
        Vector(){
        x = 0 ;
        y = 0 ;
        }
        
        Vector (double xValue , double yValue){
        x = xValue ;
        y = yValue ;
        }
        
        double getX(){
        return x ;
        }
        
        double getY(){
        return y ;
        }
        
        void setX(double x){
        this.x = x ;
        }
        
        void setY(double y){
        this.y = y;
        }
        
        double mag(){
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
        }
        
        double angle (){
        return Math.atan(y/x);
        }
        
        void print () {
        System.out.println(x + " i" + " + " + y + " j");
        }
        
        Vector add(Vector v){
        Vector res = new Vector() ; 
        res.setX(x+v.getX());
        res.setY(y+v.getY());
        return res ;
        }
        
        Vector sub(Vector v){
        Vector res = new Vector() ; 
        res.setX(x-v.getX());
        res.setY(y-v.getY());
        return res ;
        }
        
        static double average(Vector [] arr){
            double sum = 0 ;
        for(int i = 0 ; i < arr.length ; i++){
            sum += arr[i].mag() ;
        }
            return sum/arr.length ;
        }
    }   
