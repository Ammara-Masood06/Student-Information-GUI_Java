package project1;
import javax.swing.*;
import java.awt.*;
public class Project1 {
    public static void main(String args[]){
        JFrame F = new JFrame("GUI");
        F.setVisible(true);
        F.setSize(400,300);
        F.setBounds(100, 50, 700, 700);
        F.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        F.setLayout(null);
        F.setResizable(false);
        Container con = F.getContentPane();
        con.setBackground(Color.ORANGE);
            
            JLabel L1 = new JLabel("Welcome");
            con.add(L1);
            L1.setBounds(250, 10, 200, 100);
            Font F1 = new Font("Garamond", Font.BOLD, 30);
            L1.setFont(F1);
            
            JLabel L2 = new JLabel("The University of Lahore");
            con.add(L2);
            L2.setBounds(150, 30, 400, 120);
            Font F2 = new Font("Garamond", Font.BOLD, 35);
            L2.setFont(F2);
            
            JLabel L3 = new JLabel("Name    :   ");
            con.add(L3);
            L3.setBounds(100, 90, 200, 140);
            L3.setFont(F1);
            JTextField T1 = new JTextField();
            con.add(T1);
            T1.setBounds(300, 140, 250, 40);
            
            JLabel L4 = new JLabel("SAP ID  :   ");
            con.add(L4);
            L4.setBounds(100, 150, 200, 140);
            L4.setFont(F1);
            JTextField T2 = new JTextField();
            con.add(T2);
            T2.setBounds(300, 200, 250, 40);
            
            JLabel L5 = new JLabel("Department  :   ");
            con.add(L5);
            L5.setBounds(100, 210, 200, 140);
            L5.setFont(F1);
            JTextField T3 = new JTextField();
            con.add(T3);
            T3.setBounds(300, 260, 250, 40);
            
            JLabel L6 = new JLabel("Gender  :   ");
            con.add(L6);
            L6.setBounds(100, 270, 200, 140);
            L6.setFont(F1);
            JRadioButton male = new JRadioButton("Male");
            con.add(male);
            male.setBounds(300, 320, 250, 40);
            JRadioButton female = new JRadioButton("Female");
            con.add(female);
            female.setBounds(300, 380, 250, 40);
            
            JButton submitbutton = new JButton("SUBMIT");
            submitbutton.setFont(F1);
            submitbutton.setBackground(Color.white);
            submitbutton.setForeground(Color.black);
            con.add(submitbutton);
            submitbutton.setBounds(400, 480, 200,40);
    }
}
