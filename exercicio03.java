class exercicio03{
	public static void main(String[] args){
	float item_1=2.95f,item_2=3.50f;
	System.out.println("o item 1 custa"+item_1+"e o item 2 custa"+"item_2");
	float custo_total=item_1+item_2;
	System.out.println(custo_total);
	final float taxa=0.0825f;
	float taxa_calculada=custo_total*taxa;
	System.out.println(taxa_calculada);
	item_1=item_1+taxa_calculada;
	item_2=item_2+taxa_calculada;
	float novo_custo=item_1+item_2;
	boolean muito_caro=novo_custo>10;
	System.out.println(muito_caro);
	}
}
