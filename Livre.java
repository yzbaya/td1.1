package td1;


	public class Livre {
		
		private String titre, auteur;
		private  int nbPages;
		 
		 Livre (String auteur, String titre) {
			 
		       this.auteur = auteur;
		       this.titre = titre;
		      
		}
		
		public String getAuteur() {
		    return auteur;
		}
		//l get hiya illi ta3ayatli lel 7aja ili bech nbadalha n7otoulha e type mte3ha qq soit int ou string
		 public void setAuteur(String aut) {
			 this.auteur=aut;
		 }
		 
		public int getNbPages() {
			return nbPages;
		}
		public void setNbPages (int nbpage) {
			if (nbpage<20) {
				
				this.nbPages=nbpage;
			}
			else {
				System.out.println("le nb est faible");
			}
		}
		//e set hiya ili t5allina nbadlou l valeur de retour w n7otoulha void
		

		
		
		public String getTitre() {
			return titre;
		}
		
	 
		public void setTitre(String titre) {
			this.titre = titre;
		}
	
		
		void utiliserLivre() {
			
		}
		
		
}