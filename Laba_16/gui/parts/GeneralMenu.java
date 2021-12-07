package Laba_16.gui.parts;

import Laba_16.gui.Controller;

import javax.swing.*;
import java.awt.*;

public class GeneralMenu extends JMenuBar {

    public GeneralMenu(Component parent, JMenu[] others){
        JMenu fileMenu = new JMenu("Меню окон");

        var exit = new JMenuItem("Завершение работы");
        exit.addActionListener(e->System.exit(0));
        fileMenu.add(exit);

        this.add(fileMenu);

        for(var m: others){
            this.add(m);
        }
    }
}
