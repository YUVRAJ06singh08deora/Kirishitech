import javax.swing.*;
import java.awt.*;

public class trackingPage extends JFrame{
    private JPanel trackingPannel;
    private JTextField trackingId;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    public trackingPage(){
        setTitle("Rain Prediction");
        setContentPane(trackingPannel);
        setMinimumSize(new Dimension(500, 429));
        setSize(1200, 700);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {

    }
}
