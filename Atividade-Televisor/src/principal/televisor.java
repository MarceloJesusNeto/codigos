package principal;

import java.util.Scanner;

public class televisor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int canal = 1;
		int volume = 1;
		int vol = 1;
		int oi = 0;
		int opa = 0;
		String lides;
		int infinito = 0;
		
		do {
			System.out.println("você quer ligar o televisor? (s/n)");
			lides = sc.nextLine();
			
			if(lides.equals("s")) {
				
				do {
					System.out.println("***********************************");
					System.out.println();
					System.out.println("canal: " + canal + " volume: " + vol);
					System.out.println();
					System.out.println("***********************************");
					
					if (canal>15) {
						System.out.println("*************limite de canais****************");
						canal = canal - 1;
						
					}
					else if (vol>16) {
						System.out.println("************limite de canais****************");
						vol = vol - 1;
					}
					else if(canal<16 || vol<17) {
						
						System.out.println("você quer aumentar volume, diminuir volume, aumentar canal, diminuir canal ou desligar televisor(av, dv, ac, dc, dt)");
						String desicao = sc.nextLine();
						
						if (desicao.equals("av")) {
							
							System.out.println("aperte " + "+" + " para aumentar o volume");
							String av = sc.nextLine();
							
								if (av.equals("+")) {
									vol = vol +1 ;
								}
								else {
									System.out.println("tente novamente");
								}
		
						}
						else if (desicao.equals("dv")) {
							
							System.out.println("aperte " + "-" + " para aumentar o volume");
							String av = sc.nextLine();
								
								if (av.equals("-")) {
									vol = vol - 1;
								}
								else {
									System.out.println("tente novamente");
								}
				
						}
						else if (desicao.equals("dc")) {
							
							System.out.println("aperte " + "-" + " para aumentar o volume");
							String av = sc.nextLine();
								
								if (av.equals("-")) {
									canal = canal - 1;
								}
								else {
									System.out.println("tente novamente");
								}
				
						}
						else if (desicao.equals("ac")) {
							
							System.out.println("aperte " + "+" + " para aumentar o volume");
							String av = sc.nextLine();
							
								if (av.equals("+")) {
									canal = canal +1 ;
								}
								else {
									System.out.println("tente novamente");
								}
		
						}
						else if (desicao.equals("dt")) {
							
							oi++;
		
						}
						
					}
						
				}while(oi==0);
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("televisor desligado");	
				System.out.println("");
				System.out.println("");
				System.out.println("");
			}
		}while(infinito == 0);
			System.out.print("surpresa");
	
	}

}
