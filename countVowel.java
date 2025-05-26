import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

class countt extends JFrame implements ActionListener{
    JButton b,e,r;
    JTextField t1;
    JTextField t2;
    public countt(){
        JLabel jl1 = new JLabel("Enter the String : ");
        JLabel jl2 = new JLabel("Number of Vowels in String are : ");
        b = new JButton("Count Vowel");
        e = new JButton("Exit");
        r = new JButton("Reset");
        t1 = new JTextField(20);
        t2 = new JTextField(20);
        setLayout(new FlowLayout());

        add(jl1);
        add(t1);
        add(jl2);
        add(t2);
        add(b);
        add(r);
        add(e);

        b.addActionListener(this);
        e.addActionListener(this);
        r.addActionListener(this);
    }

    public int countVowel(String s){
        s = s.toLowerCase(); 
        int c=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == 'a' || s.charAt(i) == 'e'|| s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u'){
                c++;
            }
        }
        return c;
    }

    public void actionPerformed(ActionEvent ev){
        if(ev.getSource() == b){
            String s = t1.getText();
            int number = countVowel(s);
            String finalNumber = Integer.toString(number);

            t2.setText(finalNumber);
        }

        else if(ev.getSource() == r){
            t2.setText(" ");
        }

        else if(ev.getSource() == e){
            System.exit(0);
        }
    }
}


public class countVowel {
    public static void main(String[] args) {
        countt d = new countt();
        d.setSize(400,300);
        d.setVisible(true);
    }
}
