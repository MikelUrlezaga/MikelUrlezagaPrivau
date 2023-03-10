import javax.swing.*;

public class PertsonaGehituGUI extends JDialog {

    private JTextField jtfID;
    private JTextField jtfTeam;
    private JTextField jtfCountry;
    private JTextField jtfNameF;
    private JTextField jtfNameL;

    public PertsonaGehituGUI() {
        setTitle("Gehitu pertsona");
        jtfID = new JTextField("Sartu");
        jtfTeam = new JTextField("Sartu");
        jtfCountry = new JTextField("Sartu");
        jtfNameF = new JTextField("Sartu");
        jtfNameL = new JTextField("Sartu");

        JPanel jp = new JPanel();
        jp.add(jtfID);
        jp.add(jtfTeam);
        jp.add(jtfCountry);
        jp.add(jtfNameF);
        jp.add(jtfNameL);

        getContentPane().add(jp);

        setSize(200,300);
        setVisible(true);
    }
    public static void main(String[] args) {
        new PertsonaGehituGUI();
    
    }
    
}