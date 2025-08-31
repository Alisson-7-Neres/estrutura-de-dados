package estruturaDeDados.stack;

public class NoStack {
	
	private int dado;
	private NoStack refNo = null;
	
	public NoStack(int dado) {
		this.dado = dado;
	}
	
	public int getDado() {
		return dado;
	}
	public void setDado(int dado) {
		this.dado = dado;
	}
	public NoStack getRefNoStack() {
		return refNo;
	}
	public void setRefNoStack(NoStack refNo) {
		this.refNo = refNo;
	}
	
    @Override
    public String toString() {
        return "No{" +
                "dado=" + dado +
                '}';
    }

}
