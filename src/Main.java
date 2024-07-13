package src;
//*************************
//
// Author: MikaelVV
//
//*************************


public class Main {

    GUI gui;

    public static void main(String[] args){
        GUI gui = new GUI();
        System.out.println("Working!!");
    }

    public Main(GUI parentGUI) {
        gui = parentGUI;
    }

}