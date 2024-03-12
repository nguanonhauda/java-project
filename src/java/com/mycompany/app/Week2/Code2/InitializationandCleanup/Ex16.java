package com.mycompany.app.Week2.Code2.InitializationandCleanup;

public class Ex16 {
    public  void printStringArr()  {
        String[] StringArr = new String[5];
        StringArr[0] = " Xin chào " ; 
        StringArr[1] = " Mình tên là Minh " ; 
        StringArr[2] = " Mình là sinh viên trường Phenikaa"; 
        StringArr[3] = " Năm nay mình 19 tuổi "; 
        StringArr[4] = " Quê mình ở Hỉa Phòng " ; 

        for ( int i = 0 ; i < StringArr.length ; i++) {
            System.out.println(StringArr[i]);
        }

    }
}
