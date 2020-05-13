
package com.burak.matematik;


public class Matematik implements IMatematik{

    @Override
    public void toplama(int a, int b) {
        System.out.println(a+b);
    }

    @Override
    public void cikama(int a, int b) {
        System.out.println(a-b);
    }

    @Override
    public void bolme(int a, int b) {
        System.out.println((double)a/b);
    }

    @Override
    public void carpma(int a, int b) {
        System.out.println(a*b);
    }
    
}
