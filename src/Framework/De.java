


package Framework;

public class De<FaceDe> {
	
		
		private Object faces;
		private Object nbFace;
		private int positionActif =0; 

		/**
		 * Constructeur
		 * @param FaceDe[] Faces du dé
		 */
		public De(FaceDe[] face){
			this.faces= faces;
			this.nbFace=faces.length;
			positionActif=0;
		}
	}
}
		




