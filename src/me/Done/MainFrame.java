package me.Done;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {

    MainFrame() {

        this.setTitle(Data.name + (Data.showVersion ? (" " + Data.version) : ""));
        if(Data.fullscreen) {
            this.setSize(Toolkit.getDefaultToolkit().getScreenSize());
            this.setUndecorated(true);
        } else {
            this.setSize(Data.size);
            this.setLocale(null);
        }

    }

}
