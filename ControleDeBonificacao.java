public class ControleDeBonificacao {
    /* Decalração das variaveis privadas */
	private double totalDebonus;
	
	public double getTotalDeBonus() {
		return this.totalDebonus;
	}
	
	public double calculaTotalDeBonus(Funcionario f) {
		return this.totalDebonus = this.totalDebonus + f.bonifica();
	}
}
