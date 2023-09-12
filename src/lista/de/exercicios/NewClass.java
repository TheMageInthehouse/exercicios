/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista.de.exercicios;
import java.awt.Component;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.FlowLayout;
/**
 *
 * @author vicentin.7910
 */
public class NewClass {
    public class Botao extends JFrame{
        private final JButton ok;
        private JButton Cancelar;
    public Botao(){
    super("criando botao");
    setLayout ( new FlowLayout());
    
    ok = new JButton("OK");
         JButton Cancelar = new JButton("cancelar");
    add(ok);
            Component add = add(Cancelar);
    
  }
  } 
    
  }

