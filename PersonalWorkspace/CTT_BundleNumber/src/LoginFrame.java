import javax.swing.JOptionPane;

class LoginFrame {

    String u1;

    String p1;

    public static void main(String arg[]) {
        try {
            Login frame = new Login();
            frame.setBounds(200, 200, 500, 150);
            // frame.setSize(500, 200);
            frame.setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
}