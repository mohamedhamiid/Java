/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MyString;

/**
 *
 * @author mh_sm
 */
final public class MyStringBuffer {
     private char [] ref ;
    
    // Methods
    
    // No arg Constructor
    MyStringBuffer(){};
    
    // Arg Constructor
    MyStringBuffer(String passedStr){
        // Create Array of length = length of string
        this.ref = new char [passedStr.length() + 1] ;
        char i;
        for(i=0 ; i < passedStr.length(); i++){
        ref [i] = passedStr.charAt(i) ;
        }
        ref[passedStr.length()]= '\u0000';
    };
    
    void print(){
    
        char counter=0;
    
        while(ref[counter]!='\u0000'){
        System.out.print(ref[counter++]);
        }
        
        System.out.print("\n");
    }
    
    int indexOf (char x){
        int counter=0;
    
        while(ref[counter]!='\u0000'){
        if(ref[counter++]==x)
            return counter-1 ;
        }

        return -1 ;
    }
    
    int length(){
        char length = 0;
        while(ref[length]!='\u0000')
            length ++ ;
        return length;
    }
    
    void erase(int index, int length){
        
        char [] res = new char[ref.length-length];
        
        int noErased = 0;
        for(int j=0 ; j < ref.length ; j++){
            
            if(j==index)
        for(int i=index ; i<=index+length ; i++){
            j++;
        }
            else res[j]=ref[j];
        }
        this.ref = res ;
       
    }
    
    void insert(int index , String str){
        
        char[] res = new char [this.ref.length + str.length()];
        
        int i;
        int mainStringConuter=0;
        for(i=0 ; i < res.length ;i++){
            if(i==index){
                for(int passedStringCounter=0;passedStringCounter<str.length();passedStringCounter++){
                res[i++]=str.charAt(passedStringCounter);
                }
            }
            res[i]=ref[mainStringConuter++];
        }
        
        this.ref = res ;
    }
}
