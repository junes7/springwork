package di.etc;
//멤버변수가 List나 Map인 경우 DI를 어떻게 적용하나?

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class CollectionTest {
	//멤버변수 생성
	private ArrayList<String> list;
	private HashMap<String, String> map;
	
	public void setList(ArrayList<String> list) {
		this.list = list;
	}
	
	public void setMap(HashMap<String, String> map) {
		this.map = map;
	}


	public void getlist() {
		System.out.println("ArrayList에 저장된 데이터");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
	
	public void getMap() {
		System.out.println("HashMap에 저장된 데이터");
		Set<String> keylist = map.keySet();
		for (String key : keylist) {
			System.out.println("key:" + key + "," + "value:" + map.get(key));
		}
	}
}
