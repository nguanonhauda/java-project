package com.mycompany.app.Week2.ReusingClassess;

public class Ex19 {
    class MyClass {
        private final Object finalObject;
        public MyClass() {
            this.finalObject = new Object();
        }
    
        public MyClass(Object obj) {
            this.finalObject = obj;
        }

        public Object getFinalObject() {
            return this.finalObject;
        }
}
}
