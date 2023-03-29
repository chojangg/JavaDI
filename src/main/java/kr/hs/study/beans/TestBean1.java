package kr.hs.study.beans;

public class TestBean1 {
    private int data1;
    private double data2;
    private String data3;


    public TestBean1(int data1, double data2, String data3) {
        this.data1 = data1;
        this.data2 = data2;
        this.data3 = data3;
    }

    public void prData(){
        System.out.println("data1 : "+ data1);
        System.out.println("data2 : "+ data2);
        System.out.println("data3 : "+ data3);
    }
}
