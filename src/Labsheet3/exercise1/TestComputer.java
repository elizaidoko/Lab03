package Labsheet3.exercise1;

import javax.swing.JOptionPane;

public class TestComputer {
    public static void main(String[] args){
        String output = "";

        Computer c1 = new Computer();

        output += "Calling the no-argument Computer constructor" +
        "The first Computer object details are\n\n" + c1.toString();

        Computer c2 = new Computer("Dell","Laptop",3.25,16,550.99);

        output += "\n\nCalling the multi-argument Computer constructor" +
                "The second Computer object details are\n\n" + c2.toString();

        JOptionPane.showMessageDialog(null,output,"Computer Object Data",
                JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);

    }

}
