package Pack;
import java.awt.*;
public class Function_Color {
GUI gui;
public Function_Color(GUI gui) {
this.gui=gui;
}
public void changeColor(String color) {
switch(color) {
case "White":
gui.window.getContentPane().setBackground(Color.white);
gui.textArea.setBackground(Color.white);
// gui.textArea.setForeground(Color.black);
break;
case "Black":
gui.window.getContentPane().setBackground(Color.black);
gui.textArea.setBackground(Color.black);
//gui.textArea.setForeground(Color.white);
break;
case "Blue":
gui.window.getContentPane().setBackground(Color.blue);
gui.textArea.setBackground(Color.blue);
//gui.textArea.setForeground(Color.white);
break;
case "Red":
gui.window.getContentPane().setBackground(Color.red);
gui.textArea.setBackground(Color.red);
//gui.textArea.setForeground(Color.white);
break;

 case "Gray":
gui.window.getContentPane().setBackground(Color.gray);
gui.textArea.setBackground(Color.gray);
//gui.textArea.setForeground(Color.white);
break;
 case "Yellow":
gui.window.getContentPane().setBackground(Color.yellow);
gui.textArea.setBackground(Color.yellow);
// gui.textArea.setForeground(Color.white);
break;
 case "Orange":
gui.window.getContentPane().setBackground(Color.orange);
gui.textArea.setBackground(Color.orange);
// gui.textArea.setForeground(Color.white);
break;
 case "Pink":
gui.window.getContentPane().setBackground(Color.pink);
gui.textArea.setBackground(Color.pink);
// gui.textArea.setForeground(Color.white);
break;
}
}
public void changeColor1(String colo) {
switch(colo) {
case "White1":
gui.window.getContentPane().setBackground(Color.white);
gui.textArea.setForeground(Color.white);
break;
case "Black1":
gui.window.getContentPane().setBackground(Color.black);
gui.textArea.setForeground(Color.black);
break;
case "Blue1":
gui.window.getContentPane().setBackground(Color.blue);
gui.textArea.setForeground(Color.blue);
break;
case "Red1":
gui.window.getContentPane().setBackground(Color.red);

gui.textArea.setForeground(Color.red);
break;
case "Gray1":
gui.window.getContentPane().setBackground(Color.gray);
gui.textArea.setForeground(Color.gray);
break;
case "Yellow1":
gui.window.getContentPane().setBackground(Color.yellow);
gui.textArea.setForeground(Color.yellow);
break;
case "Orange1":
gui.window.getContentPane().setBackground(Color.orange);
gui.textArea.setForeground(Color.orange);
break;
case "Pink1":
gui.window.getContentPane().setBackground(Color.pink);
gui.textArea.setForeground(Color.pink);
break;
}
}
}
