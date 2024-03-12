package com.mycompany.app.Week2.Code2.InitializationandCleanup;

public class Ex12 {
    private boolean filled ; 
    // Constructor
    public void Tank(){
        filled = false ; 
    }
    // Phương thức để đổ nước vào bình 
    public void fill () {
        filled = true ; 
        System.out.println("Bình nước đã được đổ đầy " ) ; 
    }
    //Phướng thức để làm rỗng bình 
    public void empty(){
        filled = false ; 
        System.out.println("Bình đã rỗng rồi ");
    }
    // Phương thức finalize để kiểm tra kiều điện kết thúc 
    public void finalize (){
        if (filled){
            System.out.println("Lỗi ! Bình ch được dọn dẹp");
        }
        else {
            System.out.print("Bình đã dọn dẹp thành công ");
        }
    }
}
