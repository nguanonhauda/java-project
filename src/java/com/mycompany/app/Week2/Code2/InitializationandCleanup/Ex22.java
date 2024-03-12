package com.mycompany.app.Week2.Code2.InitializationandCleanup;

public class Ex22 {
    public enum Type{
        DOLLAR , EURO , YEN , POUND , VND ;
    }
    public void printCurrency2(Type currency){
        switch (currency) {
            case DOLLAR:
                System.out.println("DOLLAR - là tiền của nước Mỹ");
                break;
            case EURO :
                System.out.println("EURE - là tiền của các nước Liên Minh Châu Âu");
                break; 
            case YEN :
                System.out.println("YEN - là tiền của nước Nhật ");
                break; 
            case POUND :
                System.out.println("POUND - là tiền của nước Anh ");
                break; 
            case VND :
                System.out.println("VND - là tiền của nước Việt Nam ");
                break; 
            default:
                System.out.println("Còn rất nhiều loại tiền ") ;
                break;
        }
    }
}
