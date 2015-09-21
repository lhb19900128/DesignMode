package com.liuhongbo.designmode.component;

import java.util.ArrayList;
import java.util.List;

public class Composite extends Component {

	private List<Component> list = new ArrayList<Component>();

	public Composite(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void add(Component c) {
		// TODO Auto-generated method stub
		list.add(c);
	}

	@Override
	public void delete(Component c) {
		// TODO Auto-generated method stub
		list.remove(c);
	}

	@Override
	public void dispaly(int depth) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < depth; ++i)
			sb.append("-");
		System.out.println(sb.toString() + super.getName());
		for (Component component : list) {
			component.dispaly(depth + 2);
		}
	}

}
