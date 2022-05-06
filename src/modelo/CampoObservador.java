package modelo;

@FunctionalInterface
public interface CampoObservador {

	public abstract void eventoOcorreu(Campo campo, CampoEvento evento );
}
