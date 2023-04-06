import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LayoutsProject extends JFrame implements ActionListener
{
    public static void main(String[] args)
    {
        new LayoutsProject();

    }
    JButton NorthBtn, WestBtn, EastBtn, SouthBtn, CenterBtn, Abtn, Bbtn, Cbtn, Dbtn, imgbtn;
    JPanel borderpanel, gridpanel;

    public LayoutsProject()
    {
        //setLayout(new BorderLayout());
        setLayout(new GridLayout(3,1));
        setSize(600, 400);
        setTitle("CarsAndVans");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Mini Project");
        setResizable(false);


        //BUTTONS
        NorthBtn = new JButton("NORTH");
        NorthBtn.addActionListener(this);
        EastBtn = new JButton("EAST");
        EastBtn.addActionListener(this);
        SouthBtn = new JButton("SOUTH");
        SouthBtn.addActionListener(this);
        WestBtn = new JButton("WEST");
        WestBtn.addActionListener(this);
        CenterBtn = new JButton("CENTER");
        CenterBtn.addActionListener(this);
        Abtn = new JButton("A");
        Abtn.addActionListener(this);
        Bbtn = new JButton("B");
        Bbtn.addActionListener(this);
        Cbtn = new JButton("C");
        Cbtn.addActionListener(this);
        Dbtn = new JButton("D");
        Dbtn.addActionListener(this);
        imgbtn = new JButton();
        imgbtn.addActionListener(this);

        //PANELS
        borderpanel = new JPanel();
        borderpanel.setBorder(BorderFactory.createLineBorder(Color.RED));
        borderpanel.setLayout(new BorderLayout());
        borderpanel.add("North", NorthBtn);
        borderpanel.add("East", EastBtn);
        borderpanel.add("South", SouthBtn);
        borderpanel.add("West", WestBtn);
        borderpanel.add("Center", CenterBtn);

        add(borderpanel);


        gridpanel = new JPanel();
        gridpanel.setBorder(BorderFactory.createLineBorder(Color.yellow));
        gridpanel.setLayout(new GridLayout(2,2));
        gridpanel.add(Abtn);
        gridpanel.add(Bbtn);
        gridpanel.add(Cbtn);
        gridpanel.add(Dbtn);

        add(gridpanel);

        // IMAGE ICONS
        ImageIcon ciu=new ImageIcon(new ImageIcon("image/ciu.jpg").
                getImage().getScaledInstance(600,100,Image.SCALE_DEFAULT));
        imgbtn.setIcon(ciu);

        add(imgbtn);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == NorthBtn)
            JOptionPane.showMessageDialog(null, "This is the North Region of a Border Layout.");
        if (e.getSource() == EastBtn)
            JOptionPane.showMessageDialog(null, "This is the East Region of a Border Layout.");
        if (e.getSource() == SouthBtn)
            JOptionPane.showMessageDialog(null, "This is the South Region of a Border Layout.");
        if (e.getSource() == WestBtn)
            JOptionPane.showMessageDialog(null, "This is the West Region of a Border Layout.");
        if (e.getSource() == CenterBtn)
            JOptionPane.showMessageDialog(null, "This is the Center Region of a Border Layout.");
        if (e.getSource() == Abtn)
            JOptionPane.showMessageDialog(null, "This is letter A");
        if (e.getSource() == Bbtn)
            JOptionPane.showMessageDialog(null, "This is letter B");
        if (e.getSource() == Cbtn)
            JOptionPane.showMessageDialog(null, "This is letter C");
        if (e.getSource() == Dbtn)
            JOptionPane.showMessageDialog(null, "This is letter D");
        if (e.getSource() == imgbtn)
            JOptionPane.showMessageDialog(null, "This is ST Building in CIU");

    }
}
