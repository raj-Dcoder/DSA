package OOPS;
// Method Overloading (multiple methods of same names, different parameters)
public class Calculator {

    int sum(int a, int b){
        return a+b;
    }
    float sum(float a, float b){
        return a+b;
    }
    int sum(int a, int b, int c){
        return a+b+c;
    }
    float sum(float a, float b, float c){
        return a+b+c;
    }
}
