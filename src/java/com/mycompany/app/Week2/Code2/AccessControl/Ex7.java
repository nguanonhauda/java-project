package com.mycompany.app.Week2.Code2.AccessControl;

public class Ex7 {
    // Tạo gói Widget 
    public class Widget{
        private int widgetData ; 
        public Widget(int widgetData) {
            this.widgetData = widgetData ; 
        }
        public int getWidgetData(){
            return widgetData ;
        }
        public void setWidgetData(int widgetData){
            this.widgetData = widgetData ; 
        }
    }

    // Tạo gói AccessControl
    public class AccessControl {
        private int accessData ; 
        public AccessControl(int accessData) {
            this.accessData = accessData ; 
        }
        public int getAccessData(){
            return accessData ; 
        }
        public void setAccessData(int accessData){
            this.accessData = accessData ; 
        }
    }
    
}
