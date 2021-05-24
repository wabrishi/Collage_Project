package crm;

import javax.swing.*;
import java.awt.*;

public class first {
    public static void main(String [] args){
        login login= new login();
        login.setVisible(true);

    }

}

class login extends JFrame{
    public login(){
        setLayout(new GridLayout());
        setSize(1064,750);
        JLabel head = new JLabel( "Welcome to AGDG-TECH");
        JLabel subHead = new JLabel("grow you business with us");
        add(head);
        add(subHead);
    }

}