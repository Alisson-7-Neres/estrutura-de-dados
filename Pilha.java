package estruturaDeDados;

public class Pilha {
	
	NoStack refNoInputStack = null;
	
	public void push(NoStack newNo) {
		NoStack refNoAssistant = refNoInputStack;
		refNoInputStack = newNo;
		refNoInputStack.setRefNoStack(refNoAssistant);
	}
	
	public NoStack pop() {
		if(!isEmpty()) {
			NoStack noStackPoped = refNoInputStack;
			refNoInputStack = refNoInputStack.getRefNoStack();
			return noStackPoped;
		} 
		else return null;
	}
	
	public NoStack top() {
		return refNoInputStack;
	}
	
	public boolean isEmpty() {
		return refNoInputStack == null ? true : false;
	}
	
    @Override
    public String toString() {
        String stringReturn = "------------\n";
        stringReturn += "   Pilha\n";
        stringReturn += "------------\n";
        NoStack noAssistant = refNoInputStack;
        while(true){
            if(noAssistant != null){
                stringReturn += "[No{dado=" + noAssistant.getDado() + "}]\n";
                noAssistant = noAssistant.getRefNoStack();
            }else{
                break;
            }
        }
        stringReturn += "============";
        return stringReturn;
    }

}
