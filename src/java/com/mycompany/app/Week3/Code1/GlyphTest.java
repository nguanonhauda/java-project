package com.mycompany.app.Week3.Code1;

public class GlyphTest {
    abstract static class Glyph {
        abstract void draw();
        Glyph() {
            System.out.println("Glyph() before draw");
            draw();
            System.out.println("Glyph() after draw");
        }
    }
    
    static class RoundGlyph extends Glyph {
        int radius = 1;
        RoundGlyph(int r) {
            radius = r;
            System.out.println("RoundGlyph(), radius=" + radius);
        }
        void draw() {
            System.out.println("RoundGlyph.draw(), radius=" + radius);
        }
    }
    
    public static void main(String[] args) {
        new RoundGlyph(5);
    }
}