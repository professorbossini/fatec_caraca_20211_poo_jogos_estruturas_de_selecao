import javax.swing.JOptionPane;

public class IfElseAninhado {
  static public void main(String... outroQualquer) {
    long nota;
    nota = Long.parseLong(JOptionPane.showInputDialog("Digite a nota"));
    if (nota >= 90){
      JOptionPane.showMessageDialog(null, "Parabéns");
      JOptionPane.showMessageDialog(null, "Conceito A");
    }
    else{
      if (nota >= 80){
        JOptionPane.showMessageDialog(null, "Conceito B");
      }
      else{
        if (nota >= 70){
          JOptionPane.showMessageDialog(null, "Conceito C");
        }
        else{
          JOptionPane.showMessageDialog(null, "Reprovado");
        }
      }
    }  
  }
}
