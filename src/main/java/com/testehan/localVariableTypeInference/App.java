package com.testehan.localVariableTypeInference;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        // var is not a reserved java keyword
        int var = 10;
        System.out.println(var);

        var var1 = new Var();   // not ok to have var class name. This violates naming conventions anyway
        System.out.println(var1);

        var name = getName();
        System.out.println(name);

        // not allowed - Forms of local variable declarations that lack initializers
//        var x ;
//        x = 10;

        // not allowed - declare multiple variables
//        var x = 9,y = 10;

        // not allowed
//        var array[] = { 1, 2, 3, 4, 5 };

        // not allowed
//        var z = null;

        // not allowed
//        var f = () -> { };

    }

    static String getName(){
        return "ABC";
    }
}
