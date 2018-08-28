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
        this.prim = new No (i,this.prim);
    }

    public void insiraNoFim (X i) {

		No novo = new No (i, null);

		No atual = this.prim;


		while (atual.getProx() != null){
			atual = atual.getProx();
		}

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

    public void remova (X i) throws Exception
    {


			if(i==null)
				throw new Exception("Infoemacao inexistente");

			if (this.prim==null)
				throw new Exception("Infoemacao ausente");

		while(this.tem(i)){

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

	}

	public int getQtd()
	{
		int ret=0;

		No atual=this.prim;

		while(atual!=null)
		{
			ret++;
			atual = atual.getProx();
		}

		return ret;
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