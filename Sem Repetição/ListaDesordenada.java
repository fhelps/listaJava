public class ListaDesordenada <X>
{
    private class No {

        private X  info;
        private No prox;

        public No (X i, No p)
        {
            this.info = i;
            this.prox = p;
        }

		public No getProx(){
			return this.prox;
		}

		public X getInfo(){
			return this.info;
		}

		public void setProx(No novo){
			this.prox = novo;
		}
    }

    private No prim = null;

    public void insiraNoComeco (X i) {

		if(this.tem(i))
		 throw new Exception("Informa~cao repetida")
        this.prim = new No (i,this.prim);
    }

    public void insiraNoFim (X i) throws Exception{

		No novo = new No (i, null);

		No atual = this.prim;


		while (atual.getProx() != null){

			/**
			if(novo.getInfo() == atual.getInfo())
			**/
			if(i.equals(atual.getInfo()))
				throw new Exception("Ja existe!");

			atual = atual.getProx();
		}

		if(i.equals(atual.getInfo()))
			throw new Exception("Ja existe!");


		atual.setProx(novo);
    }

    public boolean tem (X i) {
		No atual = this.prim;

		while (atual != null){
			if (i.equals(atual.getInfo()))
				return true;

			atual = atual.getProx();
		}

		return false;
    }

    public void remova (X i)
    {
		if(i==null)
			//throw new Exception("Infoemacao inexistente");

		if (this.prim==null)
			//throw new Exception("Infoemacao ausente");


		if(i.equals(this.prim.getInfo()))
			this.prim = this.prim.getProx();

		else
		{
			No atual = this.prim;

			while (atual.getProx()!= null && !i.equals(atual.getProx().getInfo()))
				atual=atual.getProx();

			if(atual.getProx() == null)
				///throw new Exception("Informação ausentete");

			atual.setProx(atual.getProx().getProx());


		}
	}

	public void remova ()
	{
		if(this.prim==null)
		 return;

		if(this.prim.getProx()==null)
		 return;

		No anterior = null, atual = this.prim, seguinte=this.prim.getProx();

		while(seguinte!=null){
		 	atual.setProx(anterior);
			anterior=atual;
			atual = seguinte;
			seguinte = seguinte.getProx();
		}

		atual.setProx(anterior);
		this.prim =  atual;


	}


    public String toString() {

		String ret = "";

		No atual = this.prim;

		while (atual != null){

			ret += atual.getInfo() + " ";
			atual = atual.getProx();
		}

		return ret;
	}

}