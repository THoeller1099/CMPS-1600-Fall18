import javax.swing.*;
import java.awt.*;

public class IDCardFrame extends JFrame {
    private JLabel pictureLabel;
    private JLabel nameLabel;
    private JLabel programmerLabel;
    private JLabel heightLabel;
    private JLabel weightLabel;
    private JLabel eyeColorLabel;
    private JLabel speciesLabel;
    private JLabel ballerLabel;

    private IDCardFrame(String title) {
        setPreferredSize(new Dimension(500, 300));
        String name = title;
        String height = "4'10''";
        String weight = "200 lbs";
        GridBagConstraints layoutConst = null;
        Color backGround = new Color(13, 200, 72);
        getContentPane().setBackground(backGround);
        setTitle(name);

        ImageIcon mainPicture = new ImageIcon("C:\\Users\\Ted Hoeller\\Pictures\\12376681_1063072477089016_3145722177588178860_n.nocrop.w710.h2147483647.2x.jpg");
        pictureLabel = new JLabel(mainPicture);

        nameLabel = new JLabel(name);
        programmerLabel = new JLabel("Java Programmer");
        programmerLabel.setFont(programmerLabel.getFont().deriveFont(Font.BOLD, 14f));
        heightLabel = new JLabel("Height: " + height);
        weightLabel = new JLabel("Weight: " + weight);
        eyeColorLabel = new JLabel("Eye Color: Hazel");
        speciesLabel = new JLabel("Species: Frog");
        ballerLabel = new JLabel("Baller? 100% Ball is Life");

        setLayout(new GridBagLayout());

        layoutConst = new GridBagConstraints();
        layoutConst.gridx = 0;
        layoutConst.gridy = 1;
        layoutConst.gridheight = 10;
        layoutConst.insets = new Insets(1,1,1,1);
        add(pictureLabel, layoutConst);

        layoutConst = new GridBagConstraints();
        layoutConst.gridheight = 1;
        layoutConst.gridx = 0;
        layoutConst.gridy = 0;
        layoutConst.insets = new Insets(1,1,1,1);
        add(nameLabel, layoutConst);

        layoutConst = new GridBagConstraints();
        layoutConst.gridx = 0;
        layoutConst.gridy = 11;
        layoutConst.insets = new Insets(10, 10, 10, 10);
        add(programmerLabel, layoutConst);

        layoutConst = new GridBagConstraints();
        layoutConst.gridx = 1;
        layoutConst.gridy = 1;
        layoutConst.insets = new Insets(1, 1, 1, 1);
        add(heightLabel, layoutConst);

        layoutConst = new GridBagConstraints();
        layoutConst.gridx = 1;
        layoutConst.gridy = 2;
        layoutConst.insets = new Insets(1, 1, 1, 1);
        add(weightLabel, layoutConst);

        layoutConst = new GridBagConstraints();
        layoutConst.gridx = 1;
        layoutConst.gridy = 3;
        layoutConst.insets = new Insets(1, 1, 1, 1);
        add(eyeColorLabel, layoutConst);

        layoutConst = new GridBagConstraints();
        layoutConst.gridx = 1;
        layoutConst.gridy = 4;
        layoutConst.insets = new Insets(1,1, 1, 1);
        add(speciesLabel, layoutConst);

        layoutConst = new GridBagConstraints();
        layoutConst.gridx = 1;
        layoutConst.gridy = 5;
        layoutConst.insets = new Insets(1,1, 1, 1);
        add(ballerLabel, layoutConst);

    }

    public static void main(String[] args) {
	    IDCardFrame myFrame = new IDCardFrame("Dat Boi");
	    myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.setResizable(false);
        myFrame.pack();
        myFrame.setLocationRelativeTo(null);
	    myFrame.setVisible(true);
    }
}
