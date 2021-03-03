import javax.swing.JOptionPane;

public class PodeDirigir {
  public static void main(String[] args) {
    byte idade;
    idade = Byte.parseByte(JOptionPane.showInputDialog("QUal a sua idade"));
    String podeDirigir;
    //if/else
    if (idade >= 18)
      podeDirigir = "Sim";
    else
      podeDirigir = "Não";
    //python
    //pode_dirigir = "Sim" if idade >=18 else "Não"
    //operador ternário
    podeDirigir = (idade >= 18) ? ("Sim") : ("Não");  
  }  
}
