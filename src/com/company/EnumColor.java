package com.company;

/**
 * Created by Kiss on 05/07/2016.
 */
public class EnumColor {

    public enum Color {
        NOIR(0,"NOIR", "N"),
        BLEU(1, "BLEU", "B"),
        ROUGE(2, "ROUGE", "R"),
        VERT(3, "VERT", "V"),
        GRIS(4, "GRIS", "G"),
        JAUNE(5, "JAUNE", "J");

        private String nameColor = "";
        private int numberColor = -1;
        private String letterColor = "";

        Color(int numberColor, String nameColor, String letterColor){
            this.numberColor=numberColor;
            this.nameColor=nameColor;
            this.letterColor=letterColor;
        }

        public String nameColor(){
            return nameColor;
        }

        public int numberColor (){
            return numberColor;
        }

        public String letterColor(){
            return letterColor;
        }

        public static String getNameColor(int numberColor){
            for(Color e : values()) {
                if(e.numberColor == numberColor) return e.nameColor;
            }
            return null;
        }

        public static int getNumberColor(String letterColor){
            for(Color e : values()) {
                if(e.letterColor.equals(letterColor))
                    return e.numberColor;
            }
            return -1;
        }
    }
}
