import javax.swing.JDialog;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPanel;

public class JDTxertatu extends JDialog {

   private JTextField bezeroKodea;
   private JTextField bezeroIzena;
   private JTextField kontaktuIzena;
   private JTextField kontaktuAbizena;
   private JTextField telefonoa;
   private JTextField fax;
   private JTextField helbideLerroa1;
   private JTextField helbideLerroa2;
   private JTextField herria;
   private JTextField eskualdea;
   private JTextField herrialdea;
   private JTextField postakodea;
   private JTextField salerosketaLangileKodea;
   private JTextField kredituMuga;
   private JButton txertatu;
   private JPanel jp;
   private DB db;
   
   public JDTxertatu (HasieraGUI hGUI){
   
      this.setTitle("Gehitu bezeroa");
      this.bezeroKodea = new JTextField("bezeroKodea");
      this.bezeroIzena = new JTextField("bezeroIzena");
      this.kontaktuIzena = new JTextField("kontaktuIzena");
      this.kontaktuAbizena = new JTextField("kontaktuAbizena");
      this.telefonoa = new JTextField("telefonoa");
      this.fax = new JTextField("fax");
      this.helbideLerroa1 = new JTextField("helbideLerroa1");
      this.helbideLerroa2 = new JTextField("helbideLerroa2");
      this.herria = new JTextField("herria");
      this.eskualdea = new JTextField("eskualdea");
      this.herrialdea = new JTextField("herrialdea");
      this.postakodea = new JTextField("postakodea");
      this.salerosketaLangileKodea = new JTextField("salerosketaLangileKodea");
      this.kredituMuga = new JTextField("kredituMuga");
      this.txertatu = new JButton("Txertatu");
      this.jp = new JPanel();
      this.db = new DB();
      
      this.jp.add(bezeroKodea);
      this.jp.add(bezeroIzena);
      this.jp.add(kontaktuIzena);
      this.jp.add(kontaktuAbizena);
      this.jp.add(telefonoa);
      this.jp.add(fax);
      this.jp.add(helbideLerroa1);
      this.jp.add(helbideLerroa2);
      this.jp.add(herria);
      this.jp.add(eskualdea);
      this.jp.add(herrialdea);
      this.jp.add(postakodea);
      this.jp.add(salerosketaLangileKodea);
      this.jp.add(kredituMuga);
      this.jp.add(txertatu);
 
      this.add(jp);
      
      this.txertatu.addActionListener(e -> txertatu());
                                                                             
      setSize(200,300);
      setLocationRelativeTo(null);
      setVisible(true);
   }
   
   public void txertatu(){
      Bezeroa b = new Bezeroa(Integer.parseInt(bezeroKodea.getText()), bezeroIzena.getText(), kontaktuIzena.getText(), kontaktuAbizena.getText(), telefonoa.getText(), fax.getText(), helbideLerroa1.getText(), helbideLerroa2.getText(), herria.getText(), eskualdea.getText(), herrialdea.getText(), postakodea.getText(), Integer.parseInt(salerosketaLangileKodea.getText()), Double.parseDouble(kredituMuga.getText()));
      db.gehituBezero(b);
   }
}