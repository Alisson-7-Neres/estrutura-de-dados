package estruturaDeDados.no;

public class No<T> {

	private T value;
	private No<?> nextValue = null;

	public No(T value) {
		this.value = value;
	}

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}
	
	public No<?> getNextValue() {
		return nextValue;
	}
	public void setNextValue(No<?> nextValue) {
		this.nextValue = nextValue;
	}

    @Override
    public String toString() {
        return "No{" + value + '}';
    }

    public String toStringEncadeado() {
        String str = "No{" + value + "}";

        if(nextValue != null){
            str += "->" + nextValue.toString();
        }else{
            str += "->null";
        }
        return str;
    }

}
