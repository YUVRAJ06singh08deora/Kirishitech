import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class RegistrationForm extends JDialog {
    private JTextField tfname;
    private JTextField tfemail;
    private JTextField tfphone;
    private JTextField tfaddress;
    private JPasswordField tfpassword;
    private JPasswordField tfconfirmpassword;
    private JButton registerButton;
    private JButton cancelButton;
    private JLabel userLogo;
    private JPanel registerPanel;

    public RegistrationForm(JFrame parent){
        super(parent);
        setTitle("Create a new accoount");
        setContentPane(registerPanel);
        setMinimumSize(new Dimension(450,474));
        setModal(true);
        setLocationRelativeTo(parent);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        registerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              registeruser();
            }
        });
        cancelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
        setVisible(true);
    }

    private void registeruser() {
        String name=tfname.getText();
        String email=tfemail.getText();
        String phone=tfphone.getText();
        String address = tfaddress.getText();
        String password= String.valueOf(tfpassword.getPassword());
        String confirmPassword=String.valueOf(tfconfirmpassword.getPassword());

        if(name.isEmpty()|| email.isEmpty()|| phone.isEmpty() || password.isEmpty()){
            JOptionPane.showMessageDialog(this,"Please Enter all the fields","try Again",JOptionPane.ERROR_MESSAGE);
            return;
        }
        if(!password.equals(confirmPassword)){
            JOptionPane.showMessageDialog(this,"Confirm Password Does Not Match","Try Again",JOptionPane.ERROR_MESSAGE);
            return;
        }
      user =  addUserToDatabase(name , email,phone,address,password);
      if(user!=null){
          dispose();
      }
      else{
          JOptionPane.showMessageDialog(this,"Failed to register new User","Try again",JOptionPane.ERROR_MESSAGE);
      }
    }
    public User user;
    private User addUserToDatabase(String name, String email, String phone, String address, String password)
    // Data Base Connected Successfully
    {
    User user =null;
    final String Db_URL="jdbc:mysql://localhost:3306/kritecLogin";
    final String USERNAME="root";
    final String PASSWORD="06yuvraj@SINGH";
    try{
        Connection conn = DriverManager.getConnection(Db_URL,USERNAME,PASSWORD);
        Statement stat= conn.createStatement();
        String sql="INSERT INTO users(name,email,phone,address,password)"+"VALUES(?,?,?,?,?)";
        PreparedStatement preparedStatement=conn.prepareStatement(sql);
        preparedStatement.setString(1,name);
        preparedStatement.setString(2,email);
        preparedStatement.setString(3,phone);
        preparedStatement.setString(4,address);
        preparedStatement.setString(5,password);
        // Insert into the row
        int addedRows = preparedStatement.executeUpdate();
        if(addedRows>0){
            user = new User();
            user.name=name;
            user.email=email;
            user.phone=phone;
            user.address=address;
            user.password=password;
        }
        stat.close();
        conn.close();
    } catch (SQLException e) {
        e.printStackTrace();
    }
        return user;
    }


    public static void main(String[] args) {

        RegistrationForm myForm= new RegistrationForm(null);
        User user=myForm.user;
        if(user!=null){
            System.out.println("Successfully Registered You can proceed woth login"+user.name);
        }
        else {
            System.out.println("Error in regstering");
        }
    }
}
