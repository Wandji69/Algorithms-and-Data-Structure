//This is a sample program to find the multiplication of two matrices consisting of complex numbers of any dimension
package com.numerical.java;

import java.util.Scanner;

public class ComplexNumberMultiplication {

    private double real, image;

    public ComplexNumberMultiplication(double real, double image) {
        this.real = real;
        this.image = image;
    }

    public ComplexNumberMultiplication() {
        this.image = 0;
        this.real = 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the dimension of the square matrix: ");
        int n = sc.nextInt();
        double re, im;
        ComplexNumberMultiplication[][] a = new ComplexNumberMultiplication[n][n];
        ComplexNumberMultiplication[][] b = new ComplexNumberMultiplication[n][n];
        ComplexNumberMultiplication[][] res = new ComplexNumberMultiplication[n][n];
        ComplexNumberMultiplication C = new ComplexNumberMultiplication();

        System.out.println("Enter the complex elements of 1st matrix: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                re = sc.nextDouble();
                im = sc.nextDouble();
                a[i][j] = C.complexForm(re, im);
            }
        }

        System.out.println("Enter the complex elements of matrix: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                re = sc.nextDouble();
                im = sc.nextDouble();
                b[i][j] = C.complexForm(re, im);
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                re = 0.0;
                im = 0.0;
                res[i][j] = C.complexForm(re, im);
            }
        }

        res = C.matrixMultiplication(a, b, res, n);
        System.out.println("The Multiplication is:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                System.out.print(res[i][j].real + " + " + res[i][j].image + "i ");
            System.out.println();
        }
        sc.close();
    }

    public ComplexNumberMultiplication complexForm(double re, double im) {
        ComplexNumberMultiplication res = new ComplexNumberMultiplication();
        res.real = re;
        res.image = im;

        return res;
    }

    public ComplexNumberMultiplication multiplication(ComplexNumberMultiplication c2) {
        ComplexNumberMultiplication Res = new ComplexNumberMultiplication();
        Res.real = (this.real * c2.real) - (this.image * c2.image);
        Res.image = (this.real * c2.image) + (this.image * c2.real);
        return Res;
    }

    public ComplexNumberMultiplication addition(ComplexNumberMultiplication c2) {
        ComplexNumberMultiplication Res = new ComplexNumberMultiplication();
        this.real += c2.real;
        this.image += c2.image;
        Res.real = this.real;
        Res.image = this.image;
        return Res;
    }

    public ComplexNumberMultiplication[][] matrixMultiplication(ComplexNumberMultiplication[][] a, ComplexNumberMultiplication[][] b, ComplexNumberMultiplication[][] res, int n) {
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                for (int k = 0; k < n; k++) res[i][j] = res[i][j].addition(a[i][k].multiplication(b[k][j]));

        return res;
    }
}
