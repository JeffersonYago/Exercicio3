package controller;

public class FatController {

	public FatController() {
		super();
	}
	public int fatorial(int n) {
		if(n == 0) {
//é feita a interrupção da chamada quando n chega a 0 porque não é mais necessário fazer multiplicações
			return 1;
		}else {
		return n * fatorial(n -1);
//a cada chamada da função, n é multiplicado por n-1
	}
 }
}
