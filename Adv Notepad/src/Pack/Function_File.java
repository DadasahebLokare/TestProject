package Pack;
import java.awt.*;
import java.io.*;
public class Function_File {
GUI gui;
String fileName;
String fileAddress;
public Function_File(GUI gui) {
this.gui=gui;
}
public void newFile() {
gui.textArea.setText("");
gui.window.setTitle("New");
fileName=null;
fileAddress=null;
}
public void open() {
FileDialog Fd=new FileDialog(gui.window,"Open",FileDialog.LOAD);
Fd.setVisible(true);
if(Fd.getFile()!=null) {
fileName=Fd.getFile();
fileAddress=Fd.getDirectory();
gui.window.setTitle(fileName);
}
System.out.println("File address and File name"+fileAddress+fileName);

try {
BufferedReader br=new BufferedReader(new 
FileReader(fileAddress+fileName));
gui.textArea.setText("");
String line=null;
while((line=br.readLine())!=null) {
gui.textArea.append(line+"\n");
}
br.close();
}catch(Exception e) {
System.out.println("FILE NOT OPENED");
}
}
public void save() {
if(fileName==null) {
saveAs();
}
else {
try {
FileWriter fw=new FileWriter(fileAddress+fileName);
fw.write(gui.textArea.getText());
fw.close();
}catch(Exception e) {
System.out.println("SOMETHING WRONG");
}
}
}
public void saveAs() {
FileDialog Fd=new FileDialog(gui.window,"Save",FileDialog.SAVE);
Fd.setVisible(true);
if(Fd.getFile()!=null) {
fileName=Fd.getFile();
fileAddress=Fd.getDirectory();
gui.window.setTitle(fileName);
}
try {
FileWriter fw=new FileWriter(fileAddress+fileName);
fw.write(gui.textArea.getText());
fw.close();
}catch(Exception e) {

System.out.println("SOMETHING WRONG");
}
}
public void exit() {
System.exit(0);
}
}