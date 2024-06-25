import java.awt.*;
import java.awt.event.*;
class air extends Frame
{
private Image backgroundImage;
air()
{
Label l1=new Label("CLASSY TRIP FLIGHTS");
Label l2=new Label("o_o Book Flights At Cheap Price Now");
l1.setFont(new Font("Amazone BT", Font.ITALIC, 74));
l2.setFont(new Font("Amazone BT", Font.PLAIN, 34));

Button bu1=new Button("BOOK MY TICKETS");
bu1.setBounds(700,700,200,50);
add(bu1);
l1.setBounds(300,100,900,90);
add(l1);
l2.setBounds(500,600,500,60);
add(l2);
backgroundImage=Toolkit.getDefaultToolkit().getImage("flight2.jpg");
setTitle("Airline Ticket Reservation");
setSize(1920,1080);
setLayout(null);
setVisible(true);
bu1.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent e)
{
dispose();
page1 p1 = new page1();
p1.setVisible(true);
}
});


addWindowListener(new WindowAdapter()
{
public void windowClosing(WindowEvent e)
{
System.exit(0);
}
});
}

public void paint(Graphics g)
{
g.drawImage(backgroundImage,0,0,getWidth(),getHeight(),this);
super.paint(g);
}
}



class page1 extends Frame
{
private Image backgroundImage;
page1()
{
backgroundImage=Toolkit.getDefaultToolkit().getImage("flight5.jpg");
Label l3=new Label("WELCOME");
l3.setBounds(200,100,200,30);
add(l3);
CheckboxGroup cb=new CheckboxGroup();
Checkbox c1=new Checkbox("BOOK TICKETS",cb,false);
c1.setBounds(100,260,100,30);
Checkbox c2=new Checkbox("PRINT TICKET",cb,false);
c2.setBounds(375,260,100,30);
l3.setFont(new Font("Amazone BT", Font.PLAIN, 34));
add(c1);
add(c2);
Button b2=new Button("NEXT>>");
b2.setBounds(250,400,100,50);
add(b2);
b2.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent e)
{
if(c1.getState())
{
dispose();
page2 p2=new page2();
p2.setVisible(true);
}
else if(c2.getState())
{
dispose();
page3 p3=new page3();
p3.setVisible(true);
}
}
});
setTitle("WELCOME PAGE");
setSize(1920,1080);
setLayout(null);
setVisible(true);

addWindowListener(new WindowAdapter()
{
public void windowClosing(WindowEvent e)
{
System.exit(0);
}
});
}

public void paint(Graphics g)
{
g.drawImage(backgroundImage,500,0,getWidth(),getHeight(),this);
super.paint(g);
}

}

class page2 extends Frame
{
private Image backgroundImage;
page2()
{
Label l4=new Label("SELECT STATION");
l4.setBounds(450,100,300,30);
l4.setFont(new Font("Amazone BT", Font.BOLD, 34));
add(l4);
Label l5=new Label("FROM");
l5.setBounds(400,200,90,30);
add(l5);
Label l6=new Label("TO");
l6.setBounds(400,300,90,30);
add(l6);

Choice q1=new Choice();
q1.setBounds(550,200,200,30);
q1.add("SELECT");
q1.add("Chennai");
q1.add("Hyderabad");
q1.add("Bangalore");
q1.add("Mumbai");
q1.add("Delhi");
q1.add("Ahmedabad");
q1.add("Kolkata");
add(q1);
Choice q2=new Choice();
q2.setBounds(550,300,200,30);
q2.add("SELECT");
q2.add("Chennai");
q2.add("Hyderabad");
q2.add("Bangalore");
q2.add("Mumbai");
q2.add("Delhi");
q2.add("Ahmedabad");
q2.add("Kolkata");
add(q2);

Button b3=new Button("NEXT");
b3.setBounds(450,400,200,50);
add(b3);
b3.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent e)
{
dispose();
page4 p4 = new page4();
p4.setVisible(true);
}
});



  backgroundImage=Toolkit.getDefaultToolkit().getImage("aiport.jpg");
setTitle("Airport Airport");
setSize(1920,1080);
setLayout(null);
setVisible(true);

addWindowListener(new WindowAdapter()
{
public void windowClosing(WindowEvent e)
{
System.exit(0);
}
});
}

public void paint(Graphics g)
{
g.drawImage(backgroundImage,0,0,getWidth(),getHeight(),this);
super.paint(g);
}
}

class page4 extends Frame
{
private Image backgroundImage;

page4()
{
Label l7=new Label("SELECT CLASS");
l7.setBounds(150,100,300,30);
l7.setFont(new Font("Amazone BT", Font.BOLD, 34));
add(l7);
  Checkbox cb1=new Checkbox("VIP CLASS",false);
cb1.setBounds(200,200,100,30);
Checkbox cb2=new Checkbox("FIRST CLASS",false);
cb2.setBounds(200,300,100,30);
Checkbox cb3=new Checkbox("SECOND CLASS",false);
cb3.setBounds(200,400,100,30);
Checkbox cb4=new Checkbox("THIRD CLASS",false);
cb4.setBounds(200,500,100,30);
Checkbox cb5=new Checkbox("PUBLIC CLASS",false);
cb5.setBounds(200,600,100,30);
add(cb1);
add(cb2);
add(cb3);
add(cb4);
add(cb5);
Button b4=new Button("SEE FLIGHT TIME AND DATE");
b4.setBounds(100,700,300,50);
add(b4);
b4.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent e)
{
dispose();
page5 p5 = new page5();
p5.setVisible(true);
}
});

  backgroundImage=Toolkit.getDefaultToolkit().getImage("firstclass.jpg");
setTitle("CLASSES IN AEROPLANE");
setSize(1920,1080);
setLayout(null);
setVisible(true);
addWindowListener(new WindowAdapter()
{
public void windowClosing(WindowEvent e)
{
System.exit(0);
}
});
}

public void paint(Graphics g)
{
g.drawImage(backgroundImage,500,0,getWidth(),getHeight(),this);
super.paint(g);
}
}
class page5 extends Frame
{
private Image backgroundImage;
page5()
{
  
Button b5=new Button("NEXT>>");
b5.setBounds(800,700,300,50);
add(b5);
backgroundImage=Toolkit.getDefaultToolkit().getImage("j.png");
setTitle("FLIGHT TIME");
setSize(1920,1080);
setLayout(null);
setVisible(true);
b5.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent e)
{
dispose();
page6 p6 = new page6();
p6.setVisible(true);
}
});
addWindowListener(new WindowAdapter()
{
public void windowClosing(WindowEvent e)
{
System.exit(0);
}
});
}

public void paint(Graphics g)
{
g.drawImage(backgroundImage,0,0,getWidth(),getHeight(),this);
super.paint(g);
}
}

class page6 extends Frame
{
private Image backgroundImage;
page6()
{
Label l8=new Label("SELECT FOOD");
l8.setBounds(50,100,300,30);
l8.setFont(new Font("Amazone BT", Font.BOLD, 34));
add(l8);
Checkbox cb6=new Checkbox("VEG",false);
cb6.setBounds(100,200,60,30);
Checkbox cb7=new Checkbox("NON VEG",false);
cb7.setBounds(100,300,90,30);
add(cb6);
add(cb7);
Button b6=new Button("NEXT>>");
b6.setBounds(90,400,100,50);
add(b6);
b6.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent e)
{
dispose();
page7 p7 = new page7();
p7.setVisible(true);
}
});
  backgroundImage=Toolkit.getDefaultToolkit().getImage("flightfood.jpeg");
setTitle("FLIGHT FOOD");
setSize(1920,1080);
setLayout(null);
setVisible(true);
addWindowListener(new WindowAdapter()
{
public void windowClosing(WindowEvent e)
{
System.exit(0);
}
});
}

public void paint(Graphics g)
{
g.drawImage(backgroundImage,0,0,getWidth(),getHeight(),this);
super.paint(g);
}
}

class page7 extends Frame
{
page7()
{
 Label l9=new Label("BASIC DETAILS");
l9.setBounds(500,100,300,30);
l9.setFont(new Font("Amazone BT", Font.BOLD, 34));
add(l9);
Label l10=new Label("MOBILE NUMBER");
l10.setBounds(400,200,300,30);
add(l10);
Label l11=new Label("NUMBER OF TICKETS");
l11.setBounds(400,300,300,30);
add(l11);
setBackground(Color.PINK); 
TextField t1=new TextField();
t1.setBounds(600,200,300,30);
add(t1);
TextField t2=new TextField();
t2.setBounds(600,300,300,30);
add(t2);
Button b7=new Button("ENTER INFORMATION");
b7.setBounds(400,400,400,50);
add(b7);
b7.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent e)
{
dispose();
page8 p8 = new page8();
p8.setVisible(true);
}
});
setTitle("DETAILS");
setSize(1920,1080);
setLayout(null);
setVisible(true);
addWindowListener(new WindowAdapter()
{
public void windowClosing(WindowEvent e)
{
System.exit(0);
}
});
}
}

class page8 extends Frame
{
private Image backgroundImage;
page8()
{
Label l17=new Label("ENTER DETAILS");
l17.setBounds(500,100,300,30);
l17.setFont(new Font("Amazone BT", Font.BOLD, 34));
add(l17);
Label l12=new Label("NAME");
l12.setBounds(400,200,150,30);
add(l12);
Label l13=new Label("AGE");
l13.setBounds(400,300,150,30);
add(l13);
Label l14=new Label("FLIGHT NUMBER");
l14.setBounds(400,400,150,30);
add(l14);
Label l15=new Label("STARTING TIME");
l15.setBounds(400,500,150,30);
add(l15);
Label l16=new Label("DEPARTURE TIME");
l16.setBounds(400,600,150,30);
add(l16);
Button b8=new Button("VERIFICATION DETAILS");
b8.setBounds(500,700,400,50);
add(b8);
TextField t3=new TextField();
t3.setBounds(600,200,200,30);
add(t3);
TextField t4=new TextField();
t4.setBounds(600,400,200,30);
add(t4);
b8.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent e)
{
dispose();
page9 p9 = new page9();
p9.setVisible(true);
}
});
Choice m=new Choice();
Choice q1=new Choice();
Choice q2=new Choice();
Choice q3=new Choice();
Choice q4=new Choice();
Choice q5=new Choice();
Choice q6=new Choice();
Choice q7=new Choice();
Choice q8=new Choice();

m.setBounds(600,500,50,3);
q1.setBounds(650,500,50,30);
q2.setBounds(700,500,50,30);
q3.setBounds(750,500,50,30);
q4.setBounds(600,600,50,30);
q5.setBounds(650,600,50,30);
q6.setBounds(700,600,50,30);
q7.setBounds(750,600,50,30);
q8.setBounds(600,300,50,30);
m.add("HH");
m.add("01");
m.add("02");
m.add("03");
m.add("04");
m.add("05");
m.add("06");
m.add("07");
m.add("08");
m.add("09");
m.add("10");
m.add("11");
m.add("12");

q1.add("MM");
q1.add("00");
q1.add("01");
q1.add("02");
q1.add("03");
q1.add("04");
q1.add("05");
q1.add("06");
q1.add("07");
q1.add("08");
q1.add("09");
q1.add("10");
q1.add("11");
q1.add("12");
q1.add("13");
q1.add("14");
q1.add("15");
q1.add("16");
q1.add("17");
q1.add("18");
q1.add("19");
q1.add("20");
q1.add("21");
q1.add("22");
q1.add("23");
q1.add("24");
q1.add("25");
q1.add("26");
q1.add("27");
q1.add("28");
q1.add("29");
q1.add("30");
q1.add("31");
q1.add("32");
q1.add("33");
q1.add("34");
q1.add("35");
q1.add("36");
q1.add("37");
q1.add("38");
q1.add("39");
q1.add("40");
q1.add("41");
q1.add("42");
q1.add("43");
q1.add("44");
q1.add("45");
q1.add("46");
q1.add("47");
q1.add("48");
q1.add("49");
q1.add("50");
q1.add("51");
q1.add("52");
q1.add("53");
q1.add("54");
q1.add("55");
q1.add("56");
q1.add("57");
q1.add("58");
q1.add("59");
q2.add("SS");
q2.add("00");
q2.add("01");
q2.add("02");
q2.add("03");
q2.add("04");
q2.add("05");
q2.add("06");
q2.add("07");
q2.add("08");
q2.add("09");
q2.add("10");
q2.add("11");
q2.add("12");
q2.add("13");
q2.add("14");
q2.add("15");
q2.add("16");
q2.add("17");
q2.add("18");
q2.add("19");
q2.add("20");
q2.add("21");
q2.add("22");
q2.add("23");
q2.add("24");
q2.add("25");
q2.add("26");
q2.add("27");
q2.add("28");
q2.add("29");
q2.add("30");
q2.add("31");
q2.add("32");
q2.add("33");
q2.add("34");
q2.add("35");
q2.add("36");
q2.add("37");
q2.add("38");
q2.add("39");
q2.add("40");
q2.add("41");
q2.add("42");
q2.add("43");
q2.add("44");
q2.add("45");
q2.add("46");
q2.add("47");
q2.add("48");
q2.add("49");
q2.add("50");
q2.add("51");
q2.add("52");
q2.add("53");
q2.add("54");
q2.add("55");
q2.add("56");
q2.add("57");
q2.add("58");
q2.add("59");

q3.add("AM");
q3.add("PM");

q4.add("HH");
q4.add("01");
q4.add("02");
q4.add("03");
q4.add("04");
q4.add("05");
q4.add("06");
q4.add("07");
q4.add("08");
q4.add("09");
q4.add("10");
q4.add("11");
q4.add("12");

q5.add("MM");
q5.add("00");
q5.add("01");
q5.add("02");
q5.add("03");
q5.add("04");
q5.add("05");
q5.add("06");
q5.add("07");
q5.add("08");
q5.add("09");
q5.add("10");
q5.add("11");
q5.add("12");
q5.add("13");
q5.add("14");
q5.add("15");
q5.add("16");
q5.add("17");
q5.add("18");
q5.add("19");
q5.add("20");
q5.add("21");
q5.add("22");
q5.add("23");
q5.add("24");
q5.add("25");
q5.add("26");
q5.add("27");
q5.add("28");
q5.add("29");
q5.add("30");
q5.add("31");
q5.add("32");
q5.add("33");
q5.add("34");
q5.add("35");
q5.add("36");
q5.add("37");
q5.add("38");
q5.add("39");
q5.add("40");
q5.add("41");
q5.add("42");
q5.add("43");
q5.add("44");
q5.add("45");
q5.add("46");
q5.add("47");
q5.add("48");
q5.add("49");
q5.add("50");
q5.add("51");
q5.add("52");
q5.add("53");
q5.add("54");
q5.add("55");
q5.add("56");
q5.add("57");
q5.add("58");
q5.add("59");

q6.add("SS");
q6.add("00");
q6.add("01");
q6.add("02");
q6.add("03");
q6.add("04");
q6.add("05");
q6.add("06");
q6.add("07");
q6.add("08");
q6.add("09");
q6.add("10");
q6.add("11");
q6.add("12");
q6.add("13");
q6.add("14");
q6.add("15");
q6.add("16");
q6.add("17");
q6.add("18");
q6.add("19");
q6.add("20");
q6.add("21");
q6.add("22");
q6.add("23");
q6.add("24");
q6.add("25");
q6.add("26");
q6.add("27");
q6.add("28");
q6.add("29");
q6.add("30");
q6.add("31");
q6.add("32");
q6.add("33");
q6.add("34");
q6.add("35");
q6.add("36");
q6.add("37");
q6.add("38");
q6.add("39");
q6.add("40");
q6.add("41");
q6.add("42");
q6.add("43");
q6.add("44");
q6.add("45");
q6.add("46");
q6.add("47");
q6.add("48");
q6.add("49");
q6.add("50");
q6.add("51");
q6.add("52");
q6.add("53");
q6.add("54");
q6.add("55");
q6.add("56");
q6.add("57");
q6.add("58");
q6.add("59");

q7.add("AM");
q7.add("PM");

q8.add("Age");
q8.add("18");
q8.add("19");
q8.add("20");
q8.add("21");
q8.add("22");
q8.add("23");
q8.add("24");
q8.add("25");
q8.add("26");
q8.add("27");
q8.add("28");
q8.add("29");
q8.add("30");
q8.add("31");
q8.add("32");
q8.add("33");
q8.add("34");
q8.add("35");
q8.add("36");
q8.add("37");
q8.add("38");
q8.add("39");
q8.add("40");
q8.add("41");
q8.add("42");
q8.add("43");
q8.add("44");
q8.add("45");
q8.add("46");
q8.add("47");
q8.add("48");
q8.add("49");
q8.add("50");
q8.add("51");
q8.add("52");
q8.add("53");
q8.add("54");
q8.add("55");
q8.add("56");
q8.add("57");
q8.add("58");
q8.add("59");
add(m);
add(q1);
add(q2);
add(q3);
add(q4);
add(q5);
add(q6);
add(q7);
add(q8);
   backgroundImage=Toolkit.getDefaultToolkit().getImage("detail.jpg");
setTitle("COMPLETE DETAILS");
setSize(1920,1080);
setLayout(null);
setVisible(true);
addWindowListener(new WindowAdapter()
{
public void windowClosing(WindowEvent e)
{
System.exit(0);
}
});
}

public void paint(Graphics g)
{
g.drawImage(backgroundImage,0,0,getWidth(),getHeight(),this);
super.paint(g);

}
}

class page9 extends Frame
{
private Image backgroundImage;
page9()
{
Label l17=new Label("PASSPORT ID");
l17.setBounds(200,200,200,30);
add(l17);
Label l18=new Label("VISA ID");
l18.setBounds(200,300,200,30);
add(l18);
Button b9=new Button("PROCEED TO PAY");
b9.setBounds(400,400,400,50);
add(b9);
TextField t5=new TextField();
t5.setBounds(600,200,200,30);
add(t5);
TextField t6=new TextField();
t6.setBounds(600,300,200,30);
add(t6);

  backgroundImage=Toolkit.getDefaultToolkit().getImage("passport.jpg");
setTitle("ID");
setSize(1920,1080);
setLayout(null);
setVisible(true);
b9.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent e)
{
dispose();
page10 p10 = new page10();
p10.setVisible(true);
}
});
addWindowListener(new WindowAdapter()
{
public void windowClosing(WindowEvent e)
{
System.exit(0);
}
});
}

public void paint(Graphics g)
{
g.drawImage(backgroundImage,0,0,getWidth(),getHeight(),this);
super.paint(g);

}
}
class page10 extends Frame
{
private Image backgroundImage;
page10()
{
  CheckboxGroup p=new CheckboxGroup();
Checkbox p1=new Checkbox("G-Pay",p,false);
p1.setBounds(400,200,100,30);
add(p1);
Checkbox p2=new Checkbox("PhonePe",p,false);
p2.setBounds(400,300,100,30);
add(p2);
Checkbox p3=new Checkbox("Paytm",p,false);
p3.setBounds(400,400,100,30);
add(p3);
Checkbox p4=new Checkbox("Debit Card",p,false);
p4.setBounds(400,500,100,30);
add(p4);
Checkbox p5=new Checkbox("Credit Card",p,false);
p5.setBounds(400,600,100,30);
add(p5);
Checkbox p6=new Checkbox("Net Banking",p,false);
p6.setBounds(400,700,100,30);
add(p6);
Button b10=new Button("NEXT>>");
b10.setBounds(450,750,100,50);
add(b10);
b10.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent e)
{
dispose();
page11 p11 = new page11();
p11.setVisible(true);
}
});
backgroundImage=Toolkit.getDefaultToolkit().getImage("amount5.jpg");
setTitle("ONLINE PAYMENT");
setSize(1920,1080);
setLayout(null);
setVisible(true);
addWindowListener(new WindowAdapter()
{
public void windowClosing(WindowEvent e)
{
System.exit(0);
}
});
}

public void paint(Graphics g)
{
g.drawImage(backgroundImage,0,0,getWidth(),getHeight(),this);
super.paint(g);

}
}
class page11 extends Frame
{
private Image backgroundImage;
Frame Frame;
page11()
{
Label l19=new Label("ACCOUNT NUMBER");
l19.setBounds(200,300,200,30);
add(l19);
Label l20=new Label("AMOUNT");
l20.setBounds(200,400,200,30);
add(l20);
Button b11=new Button("PAY");
b11.setBounds(400,500,200,50);
add(b11);
b11.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent e)
{
Button b11=new Button("OK");
Button b12=new Button("Cancel");
b11.setBounds(100,100,50,30);
b12.setBounds(150,100,50,30);
Label label=new  Label("Thank you! Your Form Has Been Submitted:)");
Dialog d1= new Dialog(Frame,"Form Submitted",true);
d1.addWindowListener(new WindowAdapter()
{
public void windowClosing(WindowEvent e)
{
d1.dispose();
}
});
d1.add(label);
d1.pack();
d1.add(b11);
d1.add(b12);
d1.setBounds(500,300,300,200);
d1.setLayout(null);
d1.setSize(300,200);
d1.setVisible(true);
}
});
Button b12=new Button("<<BACK");
b12.setBounds(200,500,200,50);
add(b12);
b12.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent e)
{
dispose();
page1 p1 = new page1();
p1.setVisible(true);
}
});
TextField t7=new TextField();
t7.setBounds(600,300,200,30);
add(t7);
TextField t8=new TextField();
t8.setBounds(600,400,200,30);
add(t8);
  backgroundImage=Toolkit.getDefaultToolkit().getImage("amount3.png");
setTitle("PAY");
setSize(1920,1080);
setLayout(null);
setVisible(true);
addWindowListener(new WindowAdapter()
{
public void windowClosing(WindowEvent e)
{
System.exit(0);
}
});
}

public void paint(Graphics g)
{
g.drawImage(backgroundImage,0,0,getWidth(),getHeight(),this);
super.paint(g);

}
}





class page3 extends Frame
{
private Image backgroundImage;
page3()
{
Label l21=new Label("MOBILE NUMBER");
l21.setBounds(200,300,200,30);
add(l21);
Label l22=new Label("TICKET NUMBER");
l22.setBounds(200,400,200,30);
add(l22);
TextField t9=new TextField();
t9.setBounds(600,300,200,30);
add(t9);
TextField t10=new TextField();
t10.setBounds(600,400,200,30);
add(t10);
Button b13=new Button("CHECK");
b13.setBounds(400,500,200,50);
add(b13);
b13.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent e)
{
dispose();
page12 p12 = new page12();
p12.setVisible(true);
}
});
  backgroundImage=Toolkit.getDefaultToolkit().getImage("flight9.jpg");
setTitle("PRINT TICKET");
setSize(1920,1080);
setLayout(null);
setVisible(true);
addWindowListener(new WindowAdapter()
{
public void windowClosing(WindowEvent e)
{
System.exit(0);
}
});
}

public void paint(Graphics g)
{
g.drawImage(backgroundImage,0,0,getWidth(),getHeight(),this);
super.paint(g);

}
}



class page12 extends Frame
{
private Image backgroundImage;
page12()
{
 backgroundImage=Toolkit.getDefaultToolkit().getImage("ticket9.png");
setTitle("FINAL TICKET");
setSize(1920,1080);
setLayout(null);
setVisible(true);
addWindowListener(new WindowAdapter()
{
public void windowClosing(WindowEvent e)
{
System.exit(0);
}
});
}

public void paint(Graphics g)
{
g.drawImage(backgroundImage,0,0,getWidth(),getHeight(),this);
super.paint(g);

}
}


class ticket
{
public static void main(String[] args)
{
air a=new air();
}
}
