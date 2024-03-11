package com.mycompany.app.Week3.Code1;

public class Test {
    public static void main(String[] args) {
        DisruptLecture disruptLecture = new DisruptLecture();
        
        // Tạo một instance của CellPhone
        DisruptLecture.CellPhone cellPhone = disruptLecture.new CellPhone();
        
        // Tạo một instance của Tune
        DisruptLecture.Tune tune = disruptLecture.new Tune();
        
        // Tạo một instance của ObnoxiusTune
        DisruptLecture.ObnoxiusTune obnoxiusTune = disruptLecture.new ObnoxiusTune();
        
        // Gọi phương thức ring với tune
        cellPhone.ring(tune);
        
        // Gọi phương thức ring với obnoxiusTune
        cellPhone.ring(obnoxiusTune);
    }
}
