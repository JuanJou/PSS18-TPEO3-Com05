package Obstaculo;

import Colisionador.*;
import Comportamiento.MovimientoObstaculo;
import java.awt.Point;
import javax.swing.ImageIcon;

public class Destruible extends Obstaculo {

	public Destruible(Point pos) {
		super(pos);
		setGraficos();
		colisionador = new ColisionadorDestruible();
		comportamiento = new MovimientoObstaculo(this);
	}

	protected void setGraficos() {
		this.libreriaImagenes[0] = new ImageIcon(this.getClass().getResource("/img/obstaculoN.png"));
		this.libreriaImagenes[1] = new ImageIcon(this.getClass().getResource("/img/Explosion.png"));
	}
	
	public void meAtacan(Colisionador c) {
		c.atacarObstaculo(this);
	}
}
