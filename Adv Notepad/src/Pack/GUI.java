package Pack;
import java.awt.event.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.*;

public class GUI implements ActionListener {
	JFrame window, times;
	JTextArea textArea;
	JScrollPane scrollPane;
	boolean wordWrapOn = false;
	JMenuBar menuBar;
	JMenu menuFile, menuEdit, menuFormat, menuColor, menuHelp, menuColor1, Calculation, time;
	JMenuItem iNew, iOpen, iSave, iSaveAs, iExit, cut, copy, paste, selectAll, viewHelp;
	JMenuItem iWrap, iFontArial, iFontCSMS, iFontTNR, iFontSize8, iFontSize12, iFontSize16, iFontSize20, iFontSize24,
			iFontSize28;
	JMenuItem menuFont, menuFontSize;
	JMenuItem iColor1, iColor2, iColor3, iColor4, iColor5, iColor6, iColor7, iColor8;
	JMenuItem TColor1, TColor2, TColor3, TColor4, TColor5, TColor6, TColor7, TColor8;
	JTextField tf1, tf2;
	JButton b1;
	JLabel L, L1, L2, L3, L4, dateTime, L5;
	int a, b, c;
	Function_File file = new Function_File(this);
	Function_Format format = new Function_Format(this);
	Function_Color color = new Function_Color(this);

	public static void main(String[] args) {
		new GUI();
	}

public GUI() {
createWindow();
createTextArea();
createMenuBar();
createFileMenu();
createFormatMenu();
createColorMenu();
createColorMenu1();
ourDateTime();

format.selectedFont="Arial";
format.createFont(16);
format.wordWrap();
window.setVisible(true);
}

	public void createWindow() {
		window = new JFrame("Notepad (( Edit By Dadasaheb Lokare ))");
		window.setSize(800, 600);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void createTextArea() {
 textArea=new JTextArea();
 scrollPane=new 
JScrollPane(textArea,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
 scrollPane.setBorder(BorderFactory.createEmptyBorder());
 window.add(scrollPane);
 
 }

	public void createMenuBar() {
 menuBar=new JMenuBar();
 window.setJMenuBar(menuBar);
 
 menuFile=new JMenu("File");
 menuBar.add(menuFile);
 
 menuEdit=new JMenu("Edit");
 menuBar.add(menuEdit);
 
 menuFormat=new JMenu("Format");
 menuBar.add(menuFormat);
 
 menuColor=new JMenu("BGColor");
 menuBar.add(menuColor);
 
 menuColor1=new JMenu("TextColor");
 menuBar.add(menuColor1);
 
 menuHelp=new JMenu("Help");
 menuBar.add(menuHelp);
 
 Calculation=new JMenu ("Calculator");
 menuBar.add(Calculation);

 
 time=new JMenu("Date&Time");
 menuBar.add(time);
 }

	public void createFileMenu() {
 viewHelp=new JMenuItem("ViewHelp");
 viewHelp.addActionListener(this);
 menuHelp.add(viewHelp);
 
 iNew=new JMenuItem("New");
 iNew.addActionListener(this);
 iNew.setActionCommand("New");
 menuFile.add(iNew);
 
 
 iOpen=new JMenuItem("Open");
 iOpen.addActionListener(this);
 iOpen.setActionCommand("Open");
 menuFile.add(iOpen);
 
 iSave=new JMenuItem("Save");
 iSave.addActionListener(this);
 iSave.setActionCommand("Save");
 menuFile.add(iSave);
 
 iSaveAs=new JMenuItem("SaveAs");
 iSaveAs.addActionListener(this);
 iSaveAs.setActionCommand("SaveAs");
 menuFile.add(iSaveAs);
 
 iExit=new JMenuItem("Exit");
 iExit.addActionListener(this);
 iExit.setActionCommand("Exit");
 menuFile.add(iExit);
 
 cut=new JMenuItem("cut");
 cut.addActionListener(this);
 menuEdit.add(cut);
 
 copy=new JMenuItem("copy");
 copy.addActionListener(this);
 menuEdit.add(copy);
 
 paste=new JMenuItem("paste");
 paste.addActionListener(this);
 menuEdit.add(paste);

 
 selectAll=new JMenuItem("selectAll"); 
 selectAll.addActionListener(this);
 menuEdit.add(selectAll);
 
 
 tf1=new JTextField("");
 tf2=new JTextField("");
 b1=new JButton("Add Sub Mul Div ");
 
 L=new JLabel("All Mathematics Operation");
 L1=new JLabel(" ");
 L2=new JLabel(" "); 
 L3=new JLabel(" ");
 L4=new JLabel(" ");
 dateTime=new JLabel(" ");
 
 Calculation.add(L);
 Calculation.add(tf1);
 Calculation.add(tf2);
 Calculation.add(b1);
 Calculation.add(L1);
 Calculation.add(L2);
 Calculation.add(L3);
 Calculation.add(L4);
 time.add(dateTime); 
 b1.addActionListener(new x()); 
 
 }

	public void createFormatMenu() {
 iWrap=new JMenuItem("Word Wrap:Off");
 iWrap.addActionListener(this);
 iWrap.setActionCommand("Word Wrap");
 menuFormat.add(iWrap);
 
 menuFont=new JMenu("Font");
 menuFormat.add(menuFont);
 
 
 
 iFontArial=new JMenuItem("Arial");
 iFontArial.addActionListener(this);
 iFontArial.setActionCommand("Arial");
 menuFont.add(iFontArial);
 
 iFontCSMS=new JMenuItem("Comic sans MS");

 iFontCSMS.addActionListener(this);
 iFontCSMS.setActionCommand("Comic sans MS");
 menuFont.add(iFontCSMS);
 
 iFontTNR=new JMenuItem("Times New Roman");
 iFontTNR.addActionListener(this);
 iFontTNR.setActionCommand("Times New Roman");
 menuFont.add(iFontTNR);
 
 menuFontSize=new JMenu("Font Size");
 menuFormat.add(menuFontSize);
 
 iFontSize8 =new JMenuItem("8");
 iFontSize8.addActionListener(this);
 iFontSize8.setActionCommand("size8");
 menuFontSize.add(iFontSize8);
 
 iFontSize12 =new JMenuItem("12");
 iFontSize12.addActionListener(this);
 iFontSize12.setActionCommand("size12");
 menuFontSize.add(iFontSize12);
 
 iFontSize16 =new JMenuItem("16");
 iFontSize16.addActionListener(this);
 iFontSize16.setActionCommand("size16");
 menuFontSize.add(iFontSize16);
 
 iFontSize20 =new JMenuItem("20");
 iFontSize20.addActionListener(this);
 iFontSize20.setActionCommand("size20");
 menuFontSize.add(iFontSize20);
 
 iFontSize24 =new JMenuItem("24");
 iFontSize24.addActionListener(this);
 iFontSize24.setActionCommand("size24");
 menuFontSize.add(iFontSize24);
 
 iFontSize28 =new JMenuItem("28");
 iFontSize28.addActionListener(this);
 iFontSize28.setActionCommand("size28");
 menuFontSize.add(iFontSize28); 
 }

	public void createColorMenu() {
 iColor1=new JMenuItem("White");
 iColor1.addActionListener(this);

 iColor1.setActionCommand("White");
 menuColor.add(iColor1);
 
 iColor2=new JMenuItem("Black");
 iColor2.addActionListener(this);
 iColor2.setActionCommand("Black");
 menuColor.add(iColor2);
 
 iColor3=new JMenuItem("Blue");
 iColor3.addActionListener(this);
 iColor3.setActionCommand("Blue");
 menuColor.add(iColor3);
 
 iColor4=new JMenuItem("Red");
 iColor4.addActionListener(this);
 iColor4.setActionCommand("Red");
 menuColor.add(iColor4);
 
 iColor5=new JMenuItem("Gray");
 iColor5.addActionListener(this);
 iColor5.setActionCommand("Gray");
 menuColor.add(iColor5);
 
 iColor6=new JMenuItem("Yellow");
 iColor6.addActionListener(this);
 iColor6.setActionCommand("Yellow");
 menuColor.add(iColor6);
 
 iColor7=new JMenuItem("Orange");
 iColor7.addActionListener(this);
 iColor7.setActionCommand("Orange");
 menuColor.add(iColor7);
 
 iColor8=new JMenuItem("Pink");
 iColor8.addActionListener(this);
 iColor8.setActionCommand("Pink");
 menuColor.add(iColor8);
 }

	public void createColorMenu1() {
		TColor1 = new JMenuItem("White");
		TColor1.addActionListener(this);
		TColor1.setActionCommand("White1");
		menuColor1.add(TColor1);

		TColor2 = new JMenuItem("Black");
		TColor2.addActionListener(this);

		TColor2.setActionCommand("Black1");
		menuColor1.add(TColor2);

		TColor3 = new JMenuItem("Blue");
		TColor3.addActionListener(this);
		TColor3.setActionCommand("Blue1");
		menuColor1.add(TColor3);

		TColor4 = new JMenuItem("Red");
		TColor4.addActionListener(this);
		TColor4.setActionCommand("Red1");
		menuColor1.add(TColor4);

		TColor5 = new JMenuItem("Gray");
		TColor5.addActionListener(this);
		TColor5.setActionCommand("Gray1");
		menuColor1.add(TColor5);

		TColor6 = new JMenuItem("Yellow");
		TColor6.addActionListener(this);
		TColor6.setActionCommand("Yellow1");
		menuColor1.add(TColor6);

		TColor7 = new JMenuItem("Orange");
		TColor7.addActionListener(this);
		TColor7.setActionCommand("Orange1");
		menuColor1.add(TColor7);

		TColor8 = new JMenuItem("Pink");
		TColor8.addActionListener(this);
		TColor8.setActionCommand("Pink1");
		menuColor1.add(TColor8);
	}

	public void ourDateTime() {
 DateTimeFormatter dtr=DateTimeFormatter.ofPattern("yyy/MM/dd HH:mm:ss");
 LocalDateTime now=LocalDateTime.now();
 dateTime.setText(dtr.format(now));
 }

public void actionPerformed(ActionEvent e) { 
if(e.getSource()==cut)
textArea.cut();
 if(e.getSource()==paste)

 textArea.paste();
 if(e.getSource()==copy)
 textArea.copy();
 if(e.getSource()==selectAll)
 textArea.selectAll();
 
String command=e.getActionCommand();
switch(command) {
case "New":file.newFile();break;
case "Open":file.open();break;
case "Save":file.save();break;
case "SaveAs":file.saveAs();break;
case "Exit":file.exit();break;
case "Word Wrap":format.wordWrap();break;
case "Arial":format.setFont(command);break;
case "Comic sans MS":format.setFont(command);break;
case "Times New Roman":format.setFont(command);break;
case "size8":format.createFont(8);break;
case "size12":format.createFont(12);break;
case "size16":format.createFont(16);break;
case "size20":format.createFont(20);break;
case "size24":format.createFont(24);break;
case "size28":format.createFont(28);break;
case "White":color.changeColor(command);
case "Black":color.changeColor(command);
case "Blue":color.changeColor(command);
case "Red":color.changeColor(command);
case "Gray":color.changeColor(command);
case "Yellow":color.changeColor(command);
case "Orange":color.changeColor(command);
case "Pink":color.changeColor(command);
case "White1":color.changeColor1(command);
case "Black1":color.changeColor1(command);
case "Blue1":color.changeColor1(command);
case "Red1":color.changeColor1(command);
case "Gray1":color.changeColor1(command);
case "Yellow1":color.changeColor1(command);
case "Orange1":color.changeColor1(command);
case "Pink1":color.changeColor1(command);
}
}

	class x implements ActionListener {
public void actionPerformed(ActionEvent e) {

int a=Integer.parseInt(tf1.getText());
int b=Integer.parseInt(tf2.getText());
 int c=a+b;
int d=a-b;
int f=a*b;
int g=a/b;
L1.setText("Addition "+c);
L2.setText("Subtraction "+d);
L3.setText("Multiplication "+f);
L4.setText("Division "+g);
}
	}
}