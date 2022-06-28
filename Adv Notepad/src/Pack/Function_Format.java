package Pack;
import java.awt.*;
public class Function_Format {
GUI gui;
Font arial,comiSamsMS,timeNewRoman;
String selectedFont;
public Function_Format(GUI gui) {
this.gui=gui;
}
public void wordWrap() {
if(gui.wordWrapOn==false) {
gui.wordWrapOn=true;
gui.textArea.setLineWrap(true);
gui.textArea.setWrapStyleWord(true);
gui.iWrap.setText("Word Wrap: On");
}
else if(gui.wordWrapOn==true) {
gui.wordWrapOn=false;
gui.textArea.setLineWrap(false);
gui.textArea.setWrapStyleWord(false);
gui.iWrap.setText("Word Wrap: Off"); 
}
}
public void createFont(int fontSize) {
arial=new Font("Arial",Font.PLAIN,fontSize);
comiSamsMS=new Font("Comic sans MS",Font.PLAIN,fontSize);
timeNewRoman=new Font("Times New Roman",Font.PLAIN,fontSize);
setFont(selectedFont);
}
public void setFont(String font) {
selectedFont=font;
switch(selectedFont) {
case "Arial":

gui.textArea.setFont(arial);
break;
case "Comic sans MS":
gui.textArea.setFont(comiSamsMS);
break;
case "Times New Roman":
gui.textArea.setFont(timeNewRoman);
break;
}
}
} 