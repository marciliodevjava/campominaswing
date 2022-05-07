package visao;

import java.awt.Color;
import java.awt.event.MouseListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;

import org.w3c.dom.events.MouseEvent;

import modelo.Campo;
import modelo.CampoEvento;
import modelo.CampoObservador;

@SuppressWarnings("serial")
public class BotaoCampo extends JButton implements CampoObservador, MouseListener {

	private final Color BG_PADRAO = new Color(184, 184, 184);
	private final Color BG_MARCAR = new Color(8, 179, 247);
	private final Color BG_EXPLODIR = new Color(189, 66, 68);
	private final Color TEXTO_VERDE = new Color(0, 100, 0);
	private Campo campo;

	public BotaoCampo(Campo campo) {
		this.campo = campo;
		setBackground(BG_PADRAO);
		setBorder(BorderFactory.createBevelBorder(0));

		addMouseListener(this);
		campo.registrarObservador(this);
	}

	@Override
	public void eventoOcorreu(Campo campo, CampoEvento evento) {
		switch (evento) {
		case ABRIR:
			aplicarEstiloAbrir();
			break;
		case MARCAR:
			aplicarEstiloMarcar();
			break;
		case EXPLODIR:
			aplicarEstiloExplodir();
			break;
		default:
			aplicarEstiloPadrao();
		}
	}

	private void aplicarEstiloPadrao() {

	}

	private void aplicarEstiloExplodir() {

	}

	private void aplicarEstiloMarcar() {

	}

	private void aplicarEstiloAbrir() {

	}

	@Override
	public void mouseClicked(java.awt.event.MouseEvent e) {
		// TODO Auto-generated method stub

	}

	// Inteface dos Eventos do Mause.

	@Override
	public void mousePressed(java.awt.event.MouseEvent e) {
		if(e.getButton() == 1) {
			System.out.println("Bot�o esquerdo!");
		} else {
			System.out.println("Outro bot�o!");
		}
	}

	public void mouseClicked(MouseEvent e) {}	
	public void mouseEntered(java.awt.event.MouseEvent e) {}
	public void mouseExited(java.awt.event.MouseEvent e) {}
	public void mouseReleased(java.awt.event.MouseEvent e) {}
}
