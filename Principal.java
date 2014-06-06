
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class Principal implements ActionListener{
	JFrame ventana,ventana2;
	JLabel texto,textoGrupo,grupo,pts,mexico,mexPts,brazil,brPts,croacia,crPts,camerun,caPts;
	JButton boton,jornada1,jornada2,jornada3;
	JPanel panelArriba,panelAbajo,panelSuperior,panelAzul,panelLinea,panelLineaB,panelLineaC,panelLineaD,borde,panelBotones;
	
public void crearPanelArriba(){
	panelArriba = new JPanel();
	texto = new JLabel();
	texto.setText("Bienvenido a la mejor app del mundial");
	panelArriba.setLayout(new BoxLayout(panelArriba, BoxLayout.X_AXIS));
	panelArriba.add(texto);	
}

public void crearPanelAbajo(){
	panelAbajo = new JPanel();
	boton = new JButton();
	boton.setText("Entrar");
	panelAbajo.setLayout(new BoxLayout(panelAbajo, BoxLayout.X_AXIS));
	panelAbajo.add(boton);	
}

public void crearPanelSuperior(){
	panelSuperior = new JPanel();
	textoGrupo = new JLabel();
	Font font = new Font("Serif",Font.ITALIC,30);
	textoGrupo.setText("Grupo A");
	panelSuperior.setAlignmentX(JLabel.CENTER_ALIGNMENT);
	panelSuperior.setLayout(new BoxLayout(panelSuperior,BoxLayout.Y_AXIS));	
	panelSuperior.add(textoGrupo);
	textoGrupo.setFont(font);
	panelSuperior.setOpaque(false);
}

public void crearPanelAzul(){
	panelAzul = new JPanel();
	panelAzul.setLayout(new BoxLayout(panelAzul,BoxLayout.X_AXIS));
	Font font = new Font("Serif",Font.BOLD,40);
	//Dimension arcs = new Dimension(15,15);		
	grupo = new JLabel();
	pts = new JLabel();
	grupo.setFont(font);
	pts.setFont(font);	
	grupo.setText("Equipo");
	pts.setText("puntos");	
	grupo.setForeground(Color.white);
	pts.setForeground(Color.white);
	panelAzul.add(grupo);
	panelAzul.add(Box.createRigidArea(new Dimension(200,0)));
	panelAzul.add(pts);
	panelAzul.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));//padding
	panelAzul.setBackground(new Color(1,116,33));	
}

public void crearPanelLinea(){
	panelLinea = new JPanel();
	panelLinea.setLayout(new BoxLayout(panelLinea,BoxLayout.X_AXIS));
	Font font = new Font("Serif",Font.BOLD,28);	
	mexico = new JLabel();
	mexPts = new JLabel();
	mexico.setFont(font);
	mexPts.setFont(font);	
	mexico.setText("México");
	mexPts.setText("0");	
	panelLinea.add(mexico);
	panelLinea.add(Box.createRigidArea(new Dimension(334,0)));
	panelLinea.add(mexPts);
	panelLinea.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
	panelLinea.setBackground(new Color(255,255,255));
	//panelLinea.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.BLACK));
	
}

public void crearPanelLineaB(){
	panelLineaB = new JPanel();
	panelLineaB.setLayout(new BoxLayout(panelLineaB,BoxLayout.X_AXIS));
	Font font = new Font("Serif",Font.BOLD,28);	
	brazil = new JLabel();
	brPts = new JLabel();
	brazil.setFont(font);
	brPts.setFont(font);	
	brazil.setText("Brazil");
	brPts.setText("0");	
	panelLineaB.add(brazil);
	panelLineaB.add(Box.createRigidArea(new Dimension(346,0)));
	panelLineaB.add(brPts);
	panelLineaB.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
	panelLineaB.setBackground(new Color(255,255,255));
}

public void crearPanelLineaC(){
	panelLineaC = new JPanel();
	panelLineaC.setLayout(new BoxLayout(panelLineaC,BoxLayout.X_AXIS));
	Font font = new Font("Serif",Font.BOLD,28);	
	croacia = new JLabel();
	crPts = new JLabel();
	croacia.setFont(font);
	crPts.setFont(font);	
	croacia.setText("Croacia");
	crPts.setText("0");	
	panelLineaC.add(croacia);
	panelLineaC.add(Box.createRigidArea(new Dimension(326,0)));
	panelLineaC.add(crPts);
	panelLineaC.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));	
	panelLineaC.setBackground(new Color(255,255,255));
}

public void crearPanelLineaD(){
	panelLineaD = new JPanel();
	panelLineaD.setLayout(new BoxLayout(panelLineaD,BoxLayout.X_AXIS));
	Font font = new Font("Serif",Font.BOLD,28);	
	camerun = new JLabel();
	caPts = new JLabel();
	camerun.setFont(font);
	caPts.setFont(font);	
	camerun.setText("Camerun");
	caPts.setText("0");	
	panelLineaD.add(camerun);
	panelLineaD.add(Box.createRigidArea(new Dimension(308,0)));
	panelLineaD.add(caPts);
	panelLineaD.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));	
	panelLineaD.setBackground(new Color(255,255,255));
}

public void crearBotones(){
	panelBotones= new JPanel();
	panelBotones.setLayout(new BoxLayout(panelBotones,BoxLayout.X_AXIS));
	jornada1 = new JButton();
	jornada2 = new JButton();
	jornada3 = new JButton();
	jornada1.setText("Jornada 1");
	jornada2.setText("Jornada 2");
	jornada3.setText("Jornada 3");
	
	panelBotones.add(jornada1);
	panelBotones.add(Box.createRigidArea(new Dimension(15,0)));
	panelBotones.add(jornada2);
	panelBotones.add(Box.createRigidArea(new Dimension(15,0)));
	panelBotones.add(jornada3);
	panelBotones.setOpaque(false);
}



public void crearVentana(){
	ventana = new JFrame();
	ventana.setTitle("App Mundial");
	ventana.setSize(400,400);
	ventana.setLayout(new BoxLayout(ventana.getContentPane(),BoxLayout.Y_AXIS));
	ventana.add(Box.createRigidArea(new Dimension(0,20)));
	ventana.add(panelArriba);
	ventana.add(panelAbajo);
	//ventana.pack(); //Ajusta el tamaño
	ventana.setVisible(true);
	ventana.setLocationRelativeTo(null);//centrar ventana
	//add listener
	ventana.setDefaultCloseOperation(ventana.EXIT_ON_CLOSE);
	boton.addActionListener(this);
}


public void crearVentana2(){
	ventana2 = new JFrame();
	
	//ventana2.setForeground(new Color(4,49,180));
	ventana2.getContentPane().setBackground(new Color(212,211,219));
	ventana2.setTitle("Ventana 2");
	ventana2.setSize(800,600);
	ventana2.setLayout(new BoxLayout(ventana2.getContentPane(),BoxLayout.Y_AXIS));
	ventana2.add(panelSuperior);
	ventana2.add(Box.createRigidArea(new Dimension(0,20)));
	ventana2.add(panelAzul);
	ventana2.add(panelLinea);
	//ventana2.add(borde);
	ventana2.add(Box.createRigidArea(new Dimension(0,1)));
	ventana2.add(panelLineaB);
	ventana2.add(Box.createRigidArea(new Dimension(0,1)));
	ventana2.add(panelLineaC);
	ventana2.add(Box.createRigidArea(new Dimension(0,1)));
	ventana2.add(panelLineaD);
	ventana2.add(Box.createRigidArea(new Dimension(0,5)));
	ventana2.add(panelBotones);
	ventana2.setVisible(false);
	ventana2.setLocationRelativeTo(null);//centra
	ventana2.setDefaultCloseOperation(ventana.EXIT_ON_CLOSE);
	jornada1.addActionListener(this);
	jornada2.addActionListener(this);
	jornada3.addActionListener(this);
	
}
	public Principal(){
	/////////////////////////////////////////////////////////////CREAMOS ELEMENTOS
	
	crearPanelArriba();
	crearPanelAbajo();
	crearPanelSuperior();
	crearPanelAzul();
	crearPanelLinea();
	crearPanelLineaB();
	crearPanelLineaC();
	crearPanelLineaD();
	crearBotones();
	crearVentana();
	crearVentana2();


}	


public static void main(String[] argumentos){
	Principal ventana = new Principal();
}

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	System.out.println("hi");
	switch (e.getActionCommand()) {
	case "Entrar":
		System.out.println("si si");
		ventana.setVisible(false);
		ventana2.setVisible(true);
		break;
	
	case "Jornada 1":
		mexPts.setText("0");
		brPts.setText("3");
		crPts.setText("0");
		caPts.setText("3");
		
		break;
	case "Jornada 2":
		mexPts.setText("0");
		brPts.setText("6");
		crPts.setText("3");
		caPts.setText("3");
		
		break;
	case "Jornada 3":
		mexPts.setText("0");
		brPts.setText("9");
		crPts.setText("6");
		caPts.setText("3");
		
		break;

	default:
		break;
	}
}

	
}
