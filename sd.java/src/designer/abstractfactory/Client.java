package designer.abstractfactory;

public class Client {

	public static void main(String[] args) {
		
		MercedesFactory factory_cn = new MercedesFactoryCN();//�쳯�Ĺ���
		BenzA a1 = factory_cn.createBenzA(); //
		
		
		
		
		MercedesFactory factory_germany = new MercedesFactoryGermany(); //
		BenzA a2 = factory_germany.createBenzA(); //
		
	}
}
