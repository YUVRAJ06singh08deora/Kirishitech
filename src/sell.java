import javax.swing.*;
import java.awt.*;

public class sell extends JFrame{
    private JPanel sell;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JButton createSellRequestButton;
    public sell(){
        setTitle("Rain Prediction");
        setContentPane(sell);
        setMinimumSize(new Dimension(500, 429));
        setSize(1200, 700);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {

    }
}
