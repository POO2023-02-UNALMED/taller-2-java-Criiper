package test;

public class Auto {
	String modelo;
	int precio;
	Asiento[] asientos;
	String marca;
	Motor motor;
	int registro;
	static int cantidadCreados;
	
	public int cantidadAsientos(int numeroAsientos) {
		for (int i = 0; i < asientos.length; i++) {
			if (asientos[i] != null) {
				numeroAsientos++;
			}
		}
		return numeroAsientos;
		}
	
	
	public String verificarIntegridad(){
		
		for (int i = 0; i < asientos.length; i++) {
			if (asientos[i] != null) {
				
			if (asientos[i].registro != motor.registro || asientos[i].registro != this.registro) {
				return "Las piezas no son originales";
				
			}else if (asientos[i].registro == motor.registro && asientos[i].registro == this.registro) {
				return "Auto original";
								
			}
		}
		}	return "Las piezas no son originales";
	}
}	
	


