import java.io.*;
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class  Dh
{
static int sum=0;
static int ram=0;
static int i;
public static void main(String [] args)
{
JFrame f1= new JFrame("Welcome To Event Management");
JFrame f2 = new JFrame("Select Events");
JFrame f3 = new JFrame("Locations");
JFrame f4=new JFrame("Final Receipt");
JLabel l1 = new JLabel("Name");
JLabel l2 = new JLabel("Type of event");
JLabel l3 = new JLabel("Number of Guests Attending ");
JLabel l4 = new JLabel("Date");
JLabel l5 = new JLabel("Time");
JTextField tf1 = new JTextField("");
JTextField tf2 = new JTextField("");
JTextField tf3 = new JTextField("");
JTextField tf4 = new JTextField("");
JTextField tf5 = new JTextField("");
JButton b1 = new JButton("Submit");
JButton b2 = new JButton("Exit");
JButton b3 = new JButton("Location");
Checkbox c1 = new Checkbox("Food Stalls");
Checkbox c2 = new Checkbox("Beverages");
Checkbox c3 = new Checkbox("Decorations");
Checkbox c4 = new Checkbox("Photographer");
JButton b8= new JButton("Submit");
JButton b9 =new JButton("Next");
JButton bu1 = new JButton("Print");
JButton bu2 = new JButton("Back");
JButton bu3 = new JButton("Previous");


ButtonGroup bg = new ButtonGroup();
JRadioButton rb1 = new JRadioButton("Vijayawada");
JRadioButton rb2 = new JRadioButton("Hyderabad");
JRadioButton rb3 = new JRadioButton("Bangalore");
bg.add(rb1);
bg.add(rb2);
bg.add(rb3);


f1.add(l1);
f1.add(tf1);
f1.add(l2);
f1.add(tf2);
f1.add(l3);
f1.add(tf3);
f1.add(l4);
f1.add(tf4);
f1.add(l5);
f1.add(tf5);
f1.add(b1);
f1.add(b2);

l1.setBounds(20,30,150,75);
l2.setBounds(20,70,150,75);
l3.setBounds(20,110,150,75);
l4.setBounds(20,150,150,75);
l5.setBounds(20,190,150,75);

tf1.setBounds(200,50,150,25);
tf2.setBounds(200,90,150,25);
tf3.setBounds(200,130,150,25);
tf4.setBounds(200,170,150,25);
tf5.setBounds(200,210,150,25);
b1.setBounds(100,300,100,25);
b2.setBounds(300,300,100,25);

f1.setResizable(false);
f1.setSize(500,500);
f1.setLayout(null);
f1.setVisible(true);

b1.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent e)
{
if(tf1.getText().isEmpty() || tf2.getText().isEmpty() || tf3.getText().isEmpty() || tf4.getText().isEmpty() || tf5.getText().isEmpty() )
{
JLabel ll2 = new JLabel("*ALL FIELDS ARE REQUIRED");
f1.add(ll2);
ll2.setBounds(100,350,250,50);
}
else
{
f1.dispose();

f2.add(b3);
f2.add(c1);
f2.add(c2);
f2.add(c3);
f2.add(c4);
f2.add(b9);
f2.add(bu3);

b3.setBounds(100,30,150,25);
c1.setBounds(100,80,300,65);
c2.setBounds(100,130,300,65);
c3.setBounds(100,180,300,65);
c4.setBounds(100,230,300,65);
b9.setBounds(150,300,100,25);
bu3.setBounds(270,300,100,25);

f2.setResizable(false);
f2.setSize(500,500);
f2.setLayout(null);
f2.setVisible(true);
}
}
});

b2.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent e)
{
f1.dispose();
}
});

b3.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent e)
{
f2.dispose();
f3.add(rb1);
f3.add(rb2);
f3.add(rb3);
f3.add(b8);


rb1.setBounds(100,50,100,25);
rb2.setBounds(100,100,100,25);
rb3.setBounds(100,150,100,25);
b8.setBounds(150,300,100,25);


f3.setResizable(false);
f3.setSize(500,500);
f3.setLayout(null);
f3.setVisible(true);
}
});

b8.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent e)
{
if(rb1.isSelected())
{
i=1;
}
if(rb2.isSelected())
{
i=2;
}
if(rb3.isSelected())
{
i=3;
}
f3.dispose();


f2.setVisible(true);
}
});

b9.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent e)
{
if(c1.getState())
{
sum = sum+20000;
}
if(c2.getState())
{
sum = sum+10000;
}
if(c3.getState())
{
sum = sum+25000;
}
if(c4.getState())
{
sum = sum+15000;
}


f2.dispose();

JLabel l6 = new JLabel("");
JLabel ll1 = new JLabel("TOTAL COST  IS:");
JLabel l7 = new JLabel("YOUR EVENT WILL BE IN HYDERABAD");
JLabel l8 = new JLabel("YOUR EVENT WILL BE IN VIJAYAWADA");
JLabel l9 = new JLabel("YOUR EVENT WILL BE IN BANGALORE");
if(i==1)
{
f4.add(l8);
l8.setBounds(40,200,300,50);
}
else if(i==2)
{
f4.add(l7);
l7.setBounds(40,200,300,50);
}
else
{
f4.add(l9);
l9.setBounds(40,200,300,50);
}

String s=Integer.toString(sum);
l6.setText(s);
f4.add(l6);
f4.add(ll1);
ll1.setBounds(40,250,100,50);
l6.setBounds(150,250,100,50);

JLabel n = new JLabel(tf1.getText());
n.setBounds(40,50,100,50);
JLabel t = new JLabel(tf2.getText());
t.setBounds(40,70,100,50);
JLabel no = new JLabel(tf3.getText());
no.setBounds(40,90,100,50);
JLabel d = new JLabel(tf4.getText());
d.setBounds(40,110,100,50);
JLabel ti = new JLabel(tf5.getText());
ti.setBounds(40,130,100,50);

f4.add(ti);
f4.add(n);
f4.add(t);
f4.add(no);
f4.add(d);
f4.add(bu1);
f4.add(bu2);

bu1.setBounds(70,300,100,25);
bu2.setBounds(190,300,100,25);

f4.setResizable(false);
f4.setSize(400,400);
f4.setLayout(null);
f4.setVisible(true);

}
});

bu2.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent e)
{
f4.dispose();
f2.setVisible(true);
}
});

bu3.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent e)
{
f2.dispose();
f1.setVisible(true);
}
});

}
}
