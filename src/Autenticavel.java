
// Contrato Autentic�vel
  // Quem assina esse contrato precisa implementar
    //m�todo setSenha
	//m�todo autentica

public abstract interface Autenticavel{

	public abstract boolean autentica(int senha);
	
	public abstract void setSenha(int senha);
}
