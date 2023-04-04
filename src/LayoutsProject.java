import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LayoutsProject extends JFrame implements ActionListener {
    public static void main(String[] args) {
        new LayoutsProject();

    }
    JButton North, West, East, South, Center, A, B, C, D, img;
    JPanel borderpanel, gridpanel;

    public LayoutsProject(){
        //setLayout(new BorderLayout());
        setLayout(new GridLayout(3,2));
        setSize(600, 400);
        setTitle("CarsAndVans");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Mini Project");

//        JButton North, West, East, South, Center, A, B, C, D, img;
//        JPanel borderpanel, gridpanel, imagepanel;

        //BUTTONS
        North = new JButton("NORTH");
        North.addActionListener(this);
        East = new JButton("EAST");
        East.addActionListener(this);
        South = new JButton("SOUTH");
        South.addActionListener(this);
        West = new JButton("WEST");
        West.addActionListener(this);
        Center = new JButton("CENTER");
        Center.addActionListener(this);
        A = new JButton("A");
        A.addActionListener(this);
        B = new JButton("B");
        B.addActionListener(this);
        C = new JButton("C");
        C.addActionListener(this);
        D = new JButton("D");
        D.addActionListener(this);

        //PANELS
        borderpanel = new JPanel();
        borderpanel.setBorder(BorderFactory.createLineBorder(Color.RED));
        borderpanel.setLayout(new BorderLayout());
        borderpanel.add("North", North);
        borderpanel.add("East", East);
        borderpanel.add("South", South);
        borderpanel.add("West", West);
        borderpanel.add("Center", Center);
        add(borderpanel);


        gridpanel = new JPanel();
        gridpanel.setBorder(BorderFactory.createLineBorder(Color.yellow));
        gridpanel.setLayout(new GridLayout(2,2));
        gridpanel.add(A);
        gridpanel.add(B);
        gridpanel.add(C);
        gridpanel.add(D);
        add(gridpanel);

        //imagepanel = new JPanel();
        //imagepanel.setBorder(BorderFactory.createLineBorder(Color.GREEN));
        img = new JButton();
        img.addActionListener(this);
        ImageIcon ciu=new ImageIcon(new ImageIcon("D:\\ciu.JPG").
                getImage().getScaledInstance(600,100,Image.SCALE_DEFAULT));
        img.setIcon(ciu);
        add(img);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == North)
            JOptionPane.showMessageDialog(null, "This is the North Region of a Border Layout.");
        if (e.getSource() == East)
            JOptionPane.showMessageDialog(null, "This is the East Region of a Border Layout.");
        if (e.getSource() == South)
            JOptionPane.showMessageDialog(null, "This is the South Region of a Border Layout.");
        if (e.getSource() == West)
            JOptionPane.showMessageDialog(null, "This is the West Region of a Border Layout.");
        if (e.getSource() == Center)
            JOptionPane.showMessageDialog(null, "This is the Center Region of a Border Layout.");
        if (e.getSource() == A)
            JOptionPane.showMessageDialog(null, "This is letter A");
        if (e.getSource() == B)
            JOptionPane.showMessageDialog(null, "This is letter B");
        if (e.getSource() == C)
            JOptionPane.showMessageDialog(null, "This is letter C");
        if (e.getSource() == D)
            JOptionPane.showMessageDialog(null, "This is letter D");
        if (e.getSource() == img)
            JOptionPane.showMessageDialog(null, "This is ST Building in CIU");

    }
}
