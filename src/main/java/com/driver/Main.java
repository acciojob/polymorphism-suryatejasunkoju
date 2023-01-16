package com.driver;

public class Main {
    static class  Product{
        public int product(int x, int y){
            return x*y;
        }
        public int product(int x, int y, int z) {
            return x*y*z;
        }
        public double product(double x, double y) {
            return x*y;
        }
    }

    public static void main(String[] args) {
        Product p=new Product();
        p.product(23, 456);
        p.product(234, 3, 1);
        p.product(78.98, 98.9);
    }
}