package com.mycompany.app.Tuan3.Code1;

public abstract class GlyphTest{
    abstract void draw();  //method abstract
    void Glyph(){
        System.out.println("before draw()");
        draw();
        System.out.println("after draw()");
    }
    public class RoundGlyph extends GlyphTest{
        int radius ;
    
        //set radius
        public RoundGlyph(int r){
            this.radius = r;
    
    
        }
        public void draw (){
            System.out.println("Round Glyph draw method "+ this.radius);
        }
        
    }    
}
