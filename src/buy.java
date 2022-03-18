import javax.swing.*;
import java.awt.*;

public class buy extends JFrame{
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JButton submitBuyRequestButton;
    private JPanel buyPanel;
    public buy(){
        setTitle("Rain Prediction");
        setContentPane(buyPanel);
        setMinimumSize(new Dimension(500, 429));
        setSize(1200, 700);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {

    }
}
