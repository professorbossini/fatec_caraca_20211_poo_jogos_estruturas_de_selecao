import javax.swing.*;
public class IfSimples{
  public static void main (String [] args){
    double nota;
    //double -> Double
    //float -> Float
    //int -> Integer
    //char -> Character
    nota = Double.parseDouble(JOptionPane.showInputDialog ("Digite a nota"));
    //nota = float(input("Digite a nota"))
    /*esse é um comentário de 
    multiplas linhas*/
    /*if nota >=  70:
      pass*/
    if (nota >=  70){
      JOptionPane.showMessageDialog(null, "Aprovado"); 
    }
    //tipos primitivos do java
    //byte: 1 byte: 8 bits
    //short: 2 bytes: 16 bits
    //int: 4 bytes: 32 bits
    //long: 8 bytes: 64 bits
    //char: 1 byte: 8 bits
    //float: 4 bytes: 32 bits
    //double: 8 bytes: 32 bits

  }
}