package com.doctor;


public class Test

{
    //病人是外科
    private void lookMan(Doctor doctor){
        if(doctor instanceof Surgery){
            //向下类型转换
            Surgery outdoctor=(Surgery) doctor;
            outdoctor.watch();
        }
    }

    public static void main(String[] args) {
        Test test=new Test();
        test.lookMan(new Li());
    }
}
