package estruturaDeDados;

public class PilhaMain {
	
	public static void main(String[] args) {
		
		Pilha myStack = new Pilha();
		
		myStack.push(new NoStack(1));
		myStack.push(new NoStack(2));
		myStack.push(new NoStack(3));
		myStack.push(new NoStack(4));
		myStack.push(new NoStack(5));
		myStack.push(new NoStack(6));

		System.out.println(myStack);
		
		myStack.isEmpty();
		myStack.pop();
		
		System.err.println(myStack);

	}

}
